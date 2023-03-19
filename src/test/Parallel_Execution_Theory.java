package test;

public class Parallel_Execution_Theory {

}

/* This class I just have created to write about Parallel_Execution.
 * 
 * <suite name="Loan Department" parallel="tests" thread-count="2">   
 * 
 * parallel="tests" means run the test folders/Modules. 
 * 
 * Note: it is "tests" not "test" And We are mentioning parallel="tests" because we are declaring at suite level
 *       but if we are declaring at test level then we have to write as parallel="classes"
 *       
 * thread-count="2" means run 2 test folders/Modules parallel
 *
 * 
 * <test thread-count="5" name="Personal Loan" parallel="classes" thread-count="2"> -- This is at Test Module level
 * 
 * 
 * 
 * Note:- The output for sequence run and parallel run will produce similar output. But parallel run is 
 *        little bit fast. for example if we are running 2 test module which contains 2 login test files
 *        then it will open both the login page at a time in different browser.
 *        
 *        but in sequential it will open it serially
 *       
 *        <suite name="Loan Department"> - this is sequential
 *        <test thread-count="5" name="Personal Loan"> - this is sequential
 *        
 */

