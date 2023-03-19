package test;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class day2 {

	
	@Test
	public void Demo() {

		System.out.println("hello day2");

	}
	
	@BeforeTest
	public void FirstExecution() {
		System.out.println("I will execute Fast, Before All @Test annotation code got executed of Personal loan Test Module only");
	}
	
	@AfterTest
	public void LastExecution() {
		System.out.println("I will execute Last, After All @Test annotation code got executed of Personal loan Test Module only");
	}
	
	@BeforeSuite
	public void FirstSuiteLvelExecution() {
		System.out.println("I will execute First, before any Test Module's Test Cases got executed of the Suite");
	}
	
	@AfterSuite
	public void LastSuiteLevelExecution() {
		System.out.println("I will execute Last, After all Test Module's Test Cases got executed of the Suite");
	
}
}

/*@BeforeTest, @AfterTest-- > These 2 annotations will work only at the Test Module level. 
This means the scope of these 2 annotations is at the Specific Module level only. and in 
XML our day1,2,3 are present inside Personal loan Module only. So @BeforeTest code will 
execute before all @Test annotation code execution of Personal loan Module.

Similarly, @AfterTest code will execute after all @Test annotation code execution of 
Personal loan Module. And that is the reason why @AfterTest code has not printed at
last of the suite. For that we have to use @Aftersuite annotation.
*/


/*@BeforeSuite, @AfterSuite--> The scope of these 2 annotations is at the Suite level.
@BeforeSuite code will execute First before any Test Module's Test Cases got executed of the Suite.
Similarly
@AfterSuite code will execute Last After all, Test Module's Test Cases got executed in the Suite.
 */


