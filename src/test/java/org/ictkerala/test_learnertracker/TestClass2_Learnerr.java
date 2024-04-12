package org.ictkerala.test_learnertracker;

import org.openqa.selenium.Alert;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestClass2_Learnerr extends TestBase_Learner 
{
	@Test(priority=1)
	public void TC1() 
	{
		Logobj1.User("pofficer", "pofficer@123");
		String expresult = "LearnerTracker";
        String actl1 = Logobj1.Head();
        Assert.assertEquals(actl1, expresult);
        System.out.println(expresult);
        
	}
	
	@Test(priority=2)
	public void TC2() 
	{
		Logobj1.Button();
		String expresult1 = "Learner's form";
        String actl2 = Logobj1.Heading();
        Assert.assertEquals(actl2, expresult1);
        System.out.println(expresult1);
        
	}
	@Test(priority=3)
	public void TC3() 
	{
		
		Logobj1.Buttonsubmit();
		  
	}
	@Test(priority=4)
	public void TC4() 
	{
		
		Logobj1.Placement();
		Logobj1.Learnerbatch1();
		  
	}
	@Test(priority=5)
	public void TC5() 
	{
		
		Logobj1.Buttonsubmit();
		  
	}
	@Test(priority=6)
	public void TC6() 
	{
		
		Logobj1.Backtod();
		  
	}
	@Test(priority=7)
	public void TC7() 
	{
		
		Logobj1.Officer1();
		  
	}
	@Test(priority=8)
	public void TC8() 
	{
		
		Logobj1.AdminLogin("admin", "admin@123");
		String expresult1 = "Login Failed!!";
        String actl1 = Logobj1.Loginfail();
        Assert.assertEquals(actl1, expresult1);
        System.out.println(expresult1);
		  
	}
	
	
}
