package test;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;



public class day6 {

	@Test
	public void RandomMethods_1() {

		System.out.println("RandomMethods_1");

	}
	@Test
	public void RandomMethods_T() {

		System.out.println("RandomMethods_T");
		Assert.assertTrue(false); //To Fail this test case we are putting as false for assertTrue.

	}

	@Parameters({"URL"})
	@Test
	public void RandomMethods_2(String urlname ) {

		System.out.println("RandomMethods_2");
		System.out.println(urlname);
	}

	@Parameters({"URL", "Key"})
	@Test
	public void RandomMethods_3(String urlname, String code) {

		System.out.println("RandomMethods_3");
		System.out.println(urlname);
		System.out.println(code);
	}
	
	@Test(dataProvider="getData")
	public void RandomMethods_X(String username, String Password) {

		System.out.println(username);
		System.out.println(Password);
	}
	
	@DataProvider
	public Object getData() {

		//1st Combination- username password- good credit history= row
		//2nd - username password - no credit history
		//3rd - fraudlent credit history
		
		String[][] data = new String[3][2];
		
		//1st Set
		data[0][0]="Firstname";
		data[0][1]="FirstPassword";
		
		//2nd Set
		data[1][0]="Secondname";
		data[1][1]="SecondPassword";
		
		//3rd Set
		data[2][0]="Thirdname";
		data[2][1]="ThirdPassword";
		
		return data;

	}
	
	@BeforeMethod
	public void Method_Doc() {

		System.out.println("I will execute before each method execution of day6 class");

	}
	
	@AfterMethod
	public void Method_xlsx() {

		System.out.println("I will execute after each method execution of day6 class");

	}
}

/*@BeforeMethod, @AfterMethod--> The scope of these 2 annotations is at the Specific Class level only.
 @BeforeMethod code will execute before each method got executed of day6 class.
 @AfterMethod code will execute after each method got executed of day6 class.
*/


/*	
 
    @Parameters({"URL"}) -- the URL value will get received here, from testng.xml.
	@Test
	public void RandomMethods_2(String urlname ) -- Then we have to caught that value by the help of this argument "String urlname"
	{
		System.out.println("RandomMethods_2");
		System.out.println(urlname); --  then we are printing here.
	}
Note: - <parameter name="URL" value="qaclickacademy.com"></parameter> --> This parameters concept
        we can use both at suite level & test module level.(as per the requirement)
 
 */



/*@DataProvider- @DataProvider annotation helps us to write different data sets for any test method.
                 here our "RandomMethods_X" is a test method and it needs different data sets. So for
                 that we are setting up the data in getData() method with @DataProvider annotation, 
                 which will run  multiple times.(means for each data the getData() method will run)


The name of the data provider ( ‘data-provider’ in this case ) must be used by the test method if it 
wants to use the datasets provided by the provider method.
                 
@DataProvider is the second way of passing parameters to test methods except passing parameters from 
testng.xml.   

passing parameters from testng.xml is the 1st way                              
 
 */
