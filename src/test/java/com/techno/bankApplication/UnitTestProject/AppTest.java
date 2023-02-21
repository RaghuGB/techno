package com.techno.bankApplication.UnitTestProject;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;


/**
 * Unit test for simple App.
 */
public class AppTest {

	Student s1,s2,s3,s4;
     @Before
	public void setUp()
		{
			s1=new Student(123, "Ramesh", 67.89);
			s2=new Student(124, "Rakesh", 89.67);
			s3=new Student(125, "Lohith", 76.89);
			s4=new Student(127, "Parmesh",57.89);
		}
     
     @Test
   public void Test1()
     {
    	 s1.cal_grade();
    	 assertEquals("SecondClass",s1.grade);
     }
     @Test
    public void Test2()
     {
    	 s2.cal_grade();
    	 assertEquals("Distinction",s2.grade);
     }
     @Test
    public void Test3()
     {
    	 s3.cal_grade();
    	 assertEquals("FirstClass",s3.grade);
     }
     @Test
     public void Test4()
     {
    	 s4.cal_grade();
    	 assertEquals("SecondClass",s4.grade);
     }
     
     
}
