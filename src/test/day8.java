package test;

import org.testng.annotations.Test;

public class day8 {

	@Test
	public void W() {

		System.out.println("W");

	}

	@Test
	public void Z() {

		System.out.println("Z");

	}
	
	@Test(dependsOnMethods= {"W","Z"})
	public void A() {

		System.out.println("A");

	}
	@Test
	public void C() {

		System.out.println("C");

	}
	
	@Test(enabled=true)
	public void Jack() {

		System.out.println("Jack");

	}
	
	@Test(timeOut=4000)
	public void Sparrow() {

		System.out.println("Sparrow");

	}
	
}

/* The by default execution nature of TestNG is Alphabetical order execution.
 but if we don't want to execute like that then we have to use "dependsOnMethods"
 concept.
 
 if we are declaring any method with (dependsOnMethods= {"","",""}), then we are 
 saying to TestNG that, this method is dependable of these specific methods. So
 Execute those methods first then execute this method.
 
 we are declaring dependsOnMethods beside that method's annotations.
 */


/*(enabled=false) --> This feature we are using when we want to skip any specific method/TestCase.
 if we wan to run that method with all the methods then we have set that as true. (enabled=true)
 
 (timeOut=4000) --> if we are assigning the timeOut then TestNG will wait until that time period
 once it is crossed then it will fail that particular block/method/TestCase.
 */
