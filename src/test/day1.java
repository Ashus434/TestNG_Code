package test;

import org.testng.annotations.Test;

public class day1 {

	@Test
	public void Demo() {

		System.out.println("hello day1");

	}
}


//////////////TestNG is a testing framework for the Java programming language/////////////////


//Note: - In java to compile & execute we need main method.
//        But in TestNG we need @ Test Annotation to execute method.
//        In TestNG Each method which i defined after @ Test annotation 
//        will be treated as test case.

//First install the testNG plug-in from Eclipse Market place then 
//hover the mouse on the @Test annotation and Add the TestNG Library & Import the Package. 
// Once the Test Run TestNG will deliver a neat output.

//Once the above things are done then Right-Click on the Project Select TestNG-->Convert to TestNG
//It will generate the Testng.xml file and it is the heart of TestNG Framework.
// Refer the testng.xml's mentioned comments also.
//Hierarchy for Testng xml (Test Suite--> Test Modules/Folder--> Test Cases)
// Inside a Suite Multiple Modules can be written and Inside a Module Multiple Test Cases can be written.

/*
<suite name="Suite">                     <!--This is Suite Name--> Starting tag to Ending tag
<test thread-count="5" name="Test">      <!--This is Test Module/Folder Name--> Starting tag to Ending tag
  <classes>
    <class name="test.day1"/>            <!--This is Test case Name, The .java class files are treating as test cases, So we are calling those here by the help of package name(test)--> Starting tag to Ending tag
     <class name="test.day2"/>           <!--This is Test case Name, The .java class files are treating as test cases, So we are calling those here by the help of package name(test)--> Starting tag to Ending tag
  </classes>
</test> <!-- Test -->
</suite> <!-- Suite -->

*/

/*
 * 
 * So, TestNG.xml file is a configuration file that helps in organizing our tests.
 * It allows testers to create and handle multiple test classes, define test
 * suites and tests. It makes a tester’s job easier by controlling the execution of tests by
 * putting all the test cases together and run it under one XML file. This is a
 * beautiful concept, without which, it is difficult to work in TestNG.
 * 
 * 
 * 
 * 
 * Advantages Of TestNG.xml Major advantages of TestNG.xml file are:
 * 
 * It provides parallel execution of test methods. 
 * It allows the dependency of one test method on another test method.
 * It helps in prioritizing our test methods. 
 * It allows grouping of test methods into test groups. 
 * It supports the parameterization of test cases using @Parameters annotation.
 * It helps in Data-driven testing using @DataProvider annotation.
 * It has different types of assertions that help in validating the expected results with the actual
 * results.
 * It has different types of HTML reports, Extent reports, etc. for a
 * better and clear understanding of our test summary. 
 * It has listeners who help in creating logs.
 * 
 * 
 * Note: - In TestNG, Methods get execute as per Alphabetical order.
 */

