package test;

import org.testng.Assert;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

//Listeners can be used for various purposes, such as taking screenshots of failed tests, logging errors

//ITestListener interface which implements TestNG listeners

/*Right click (on the Listeners class) -> go to source-> click
  on override/implement methods -> select the check boxes for
  the ITest listener (make sure all check box inside it should be checked)->click on oK. That's it
*/

public class Listeners implements ITestListener {

	@Override
	public void onTestStart(ITestResult result) {
		// TODO Auto-generated method stub
		ITestListener.super.onTestStart(result);
		
	}

	@Override
	public void onTestSuccess(ITestResult result) {
		// TODO Auto-generated method stub
		ITestListener.super.onTestSuccess(result);
		
		//System.out.println("I will execute on each .java/test file success execution");
	}

	@Override
	public void onTestFailure(ITestResult result) {
		// TODO Auto-generated method stub
		ITestListener.super.onTestFailure(result);
		
		//Screenshot Code we can written here for failure web application or mobile application test case.
		//Log File Code we can written here for failure API test case.
		/*So in case of test cases failure this block will execute. So if we are writing any screenshot
		  code or log file code here then that will definitely execute on any test case failure.
		  
		  In day6 file we are failing one test case to execute this "onTestFailure" method/block
		  Assert.assertTrue(false);- So in day6 for one method the assertTrue will expect True 
		  but we are passing as false to fail.
		*/
		
		System.out.println("I will execute if any test case getting fail of any .java/test file And the Failed Test Case Name is"+" "+result.getName());
		
		/*The failed test case information stored in the ITestResult's "result" object
		  So if we are calling this "getName()" method through "result" object then
		  it will print the failed test case name.
		*/
	}

	@Override
	public void onTestSkipped(ITestResult result) {
		// TODO Auto-generated method stub
		ITestListener.super.onTestSkipped(result);
	}

	@Override
	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
		// TODO Auto-generated method stub
		ITestListener.super.onTestFailedButWithinSuccessPercentage(result);
	}

	@Override
	public void onTestFailedWithTimeout(ITestResult result) {
		// TODO Auto-generated method stub
		ITestListener.super.onTestFailedWithTimeout(result);
	}

	@Override
	public void onStart(ITestContext context) {
		// TODO Auto-generated method stub
		ITestListener.super.onStart(context);
	}

	@Override
	public void onFinish(ITestContext context) {
		// TODO Auto-generated method stub
		ITestListener.super.onFinish(context);
	}

    
 
}


/*
Listeners can be used for various purposes, such as taking screenshots of failed tests, logging errors.
 
Syntax to declaring about Listeners in XML: -
  
  <listeners>
	<listener class-name="test.Listeners"/> <!--Here we are telling to testng.xml about the Listener -->
  </listeners>
      
 */
