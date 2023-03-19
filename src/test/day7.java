package test;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class day7 {

	@Test
	public void Horizon_1() {

		System.out.println("Horizon_1");

	}

	@Test
	public void Horizon_2() {

		System.out.println("Horizon_2");

	}
	
	@BeforeClass
	public void Funto() {

		System.out.println("I will execute first, before any method got executed of day7 class");

	}
	@AfterClass
	public void Unto() {

		System.out.println("I will execute last, after all method got executed of day7 class");

	}
}

/*@BeforeClass, @AfterClass-- > The scope of these 2 annotations is at the Specific Class level only.
 @BeforeClass code will execute before any method got executed of day7 class.
 @AfterClass code will execute after all method got executed of day7 class.
 */


