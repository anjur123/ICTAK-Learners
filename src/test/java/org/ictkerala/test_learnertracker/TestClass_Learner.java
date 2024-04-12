package org.ictkerala.test_learnertracker;

import java.io.File;
import java.util.HashMap;

import org.openqa.selenium.Alert;
import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestClass_Learner extends TestBase_Learner {
	
	@Test(priority=1)
	public void opensite()
	{
		
		String pageTitle = driver.getTitle();
        System.out.println("ICTAK: " + pageTitle);
	}
	@Test(priority=2)
	public void TC2() throws InterruptedException
	{
		Logobj.User("trainerr", "trainer@1233");
		Thread.sleep(2000);
		String expresult = "User not found !!";
        String actl1 = Logobj.AlertMsg();
        Assert.assertEquals(actl1, expresult);
        System.out.println(expresult);
        
	}
	@Test(priority=3)
	public void TC3()
	{
		Logobj.Userblank("t", "trainer@123");
		String expresult2 = "Username is required.";
        String actl2 = Logobj.blank();
        Assert.assertEquals(actl2, expresult2);
        System.out.println(expresult2);
	}
	@Test(priority=4)
	public void TC4()
	{
		Logobj.Passblank("trainer", "e");
		String expresult3 = "Password is required.";
        String actl3 = Logobj.Passblank1();
        Assert.assertEquals(actl3, expresult3);
        System.out.println(expresult3);
	}
	@Test(priority=5)
	public void TC5()
	{
		Logobj.Validlogin("trainer", "trainer@123");
		String expresult4 = "LearnerTracker";
        String actl4 = Logobj.Head();
        Assert.assertEquals(actl4, expresult4);
        System.out.println(expresult4);
	}
	@Test(priority=6)
	public void TC6()
	{
		Logobj.Learners();
		String expresult5 = "Learner's form";
        String actl5 = Logobj.Form();
        Assert.assertEquals(actl5, expresult5);
        System.out.println(expresult5);
	}
	@Test(priority=7)
	public void TC7()
	{
		Logobj.Learnerid("");
		String expresult6 = "Must contain letters,numbers and - only";
        String actl6 = Logobj.Form1();
        Assert.assertEquals(actl6, expresult6);
        System.out.println(expresult6);
	}
	@Test(priority=8)
	public void TC8()
	{
		Logobj.Learnerid1("anju&");
		String expresult6 = "Must contain letters,numbers and - only";
        String actl6 = Logobj.Form1();
        Assert.assertEquals(actl6, expresult6);
        System.out.println(expresult6);
	}
	@Test(priority=9)
	public void TC9()
	{
		Logobj.Learnerid2("anju123");
}
	@Test(priority=10)
	public void TC10()
	{
		Logobj.Learnername("");
		String expresult7 = "Must contain letters only";
        String actl7 = Logobj.Form2();
        Assert.assertEquals(actl7, expresult7);
        System.out.println(expresult7);
	}
	@Test(priority=11)
	public void TC11()
	{
		Logobj.Learnername1("anju123");
		String expresult7 = "Must contain letters only";
        String actl7 = Logobj.Form2();
        Assert.assertEquals(actl7, expresult7);
        System.out.println(expresult7);
	}
	@Test(priority=12)
	public void TC12()
	{
		Logobj.Learnername2("anju");
}
	@Test(priority=13)
	public void TC13()
	{
		Logobj.Learnercourse();
		String expresult8 = "Please select a course for the learner";
        String actl8 = Logobj.Form3();
        Assert.assertEquals(actl8, expresult8);
        System.out.println(expresult8);
	}
	@Test(priority=14)
	public void TC14()
	{
		Logobj.Learnercourse1();
	
}
	@Test(priority=15)
	public void TC15()
	{
		Logobj.Learnerproject();
		String expresult9 = "Please select a project for the learner";
        String actl9 = Logobj.Form4();
        Assert.assertEquals(actl9, expresult9);
        System.out.println(expresult9);
	}
	@Test(priority=16)
	public void TC16()
	{
		Logobj.Learnerproject1();
	
}
	@Test(priority=17)
	public void TC17()
	{
		Logobj.Learnerbatch();
		String expresult10 = "Please select a batch for the learner";
        String actl10 = Logobj.Form5();
        Assert.assertEquals(actl10, expresult10);
        System.out.println(expresult10);
	}
	@Test(priority=18)
	public void TC18()
	{
		Logobj.Learnerbatch1();
	
}
	@Test(priority=19)
	public void TC19()
	{
		Logobj.Learnerstatus();
		String expresult11 = "Please select the course status of the learner";
        String actl11 = Logobj.Form6();
        Assert.assertEquals(actl11, expresult11);
        System.out.println(expresult11);
	}
	@Test(priority=20)
	public void TC20()
	{
		Logobj.Learnerstatus1();
	
}
	@Test(priority=21)
	public void TC21()
	{
		Logobj.Submit1();
		String expresult12 = "Posted successfully";
        String actl12 = Logobj.Form7();
        Assert.assertEquals(actl12, expresult12);
        System.out.println(expresult12);
	}
	@Test(priority=22)
	public void TC22()
	{
		Logobj.Submitok();
	
}
	@Test(priority=23)
	public void TC23()
	{
		Logobj.Backto();
	
}
	@Test(priority=24)
	public void TC24()
	{
		Logobj.Upload();
		String expresult13 = "Upload a CSV File :";
        String actl13 = Logobj.Form8();
        Assert.assertEquals(actl13, expresult13);
        System.out.println(expresult13);
	
}
	@Test(priority=25)
	public void TC25()
	{
		String filepath = System.getProperty("user.dir");
		Logobj.Uploadcsv(filepath+ "\\File\\SampleCSV - Sheet1 (4).csv");
		String expresult14 = "Saved!";
        String actl14 = Logobj.Form9();
        Assert.assertEquals(actl14, expresult14);
        System.out.println(expresult14);
}
	@Test(priority=26)
	public void TC26() throws InterruptedException
	{
		String downloadFilepath = System.getProperty("user.dir");
		File file = new File(downloadFilepath+"\\SampleCSV - Sheet1.csv");
	    if(file.exists())
	    {
	    	System.out.println("file got successfully downloaded");
	    }
	    else
	    {
	    	System.out.println("file is not downloaded");
	    }
	    Logobj.Dwldfile();
		Thread.sleep(3000);
	}
	@Test(priority=27)
	public void TC27()
	{
		
	    Logobj.Cancel();
	}
	@Test(priority=28)
	public void TC28()
	{
		
	    Logobj.Edit();
	}
	@Test(priority=29)
	public void TC29()
	{
		
	    Logobj.Editdetails("254", "ammu");
	}
	@Test(priority=30)
	public void TC30() throws InterruptedException
	{
		
	    Logobj.Delete();
	    Thread.sleep(3000);
	}
	
	@Test(priority=31)
	public void TC31()
	{
		
	    Logobj.Trainerarrow();
	}
	@Test(priority=32)
	public void TC32()
	{
		
	    Logobj.Trainerlogout();
	}
}

	

