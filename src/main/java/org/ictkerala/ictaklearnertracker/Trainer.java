package org.ictkerala.ictaklearnertracker;

import org.openqa.selenium.Alert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;

import dev.failsafe.internal.util.Assert;

public class Trainer {
	
		WebDriver driver;
		@FindBy(xpath="//input[@id='username']")
		private WebElement user;
		@FindBy(xpath="//input[@id='password']")
		private WebElement pass;
		@FindBy(xpath="//i[@class='bi bi-eye-slash']")
		private WebElement eye;
		@FindBy(xpath="//i[@class='bi bi-eye']")
		private WebElement eye1;
		@FindBy(xpath="//button[@class='btn btn-success w-100']")
		private WebElement login;
		@FindBy(xpath="//div[@class='fade alert alert-danger alert-dismissible show']")
		private WebElement alertt;
		@FindBy(xpath="//button[@class='btn-close']")
		private WebElement close;
		@FindBy(xpath="//input[@id='username']")
		private WebElement user1;
		@FindBy(xpath="//input[@id='password']")
		private WebElement pass1;
		@FindBy(xpath="//button[@class='btn btn-success w-100']")
		private WebElement login1;
		@FindBy(xpath="//small[@class='text-danger']")
		private WebElement blankus;
		@FindBy(xpath="//input[@id='username']")
		private WebElement user2;
		@FindBy(xpath="//input[@id='password']")
		private WebElement pass2;
		@FindBy(xpath="//button[@class='btn btn-success w-100']")
		private WebElement login2;
		@FindBy(xpath="//*[@id=\"root\"]/div/div/div[2]/div/div[2]/div[2]/small")
		private WebElement blankps;
		@FindBy(xpath="//input[@id='username']")
		private WebElement user3;
		@FindBy(xpath="//input[@id='password']")
		private WebElement pass3;
		@FindBy(xpath="//button[@class='btn btn-success w-100']")
		private WebElement login3;
		@FindBy(xpath="//a[@class='navbar-brand']")
		private WebElement head;
		@FindBy(xpath="//ion-icon[@class='md icon-large hydrated']")
		private WebElement add;
		@FindBy(xpath="//*[@id=\"root\"]/div/div/div[2]/main/div/div/h3")
		private WebElement addLearner;
		@FindBy(xpath="//input[@id='learnerid']")
		private WebElement id;
		@FindBy(xpath="//button[@class='btn btn-success']")
		private WebElement submit;
		@FindBy(xpath="//p[@class='fw-light fst-italic text-start text-danger']")
		private WebElement errormsg;
		@FindBy(xpath="//input[@id='name']")
		private WebElement namee;
		@FindBy(xpath="//p[@class='fw-light fst-italic text-start text-danger']")
		private WebElement errormsg1;
		@FindBy(xpath="//select[@class='form-select required']")
		private WebElement course;
		@FindBy(xpath="//p[@class='fw-light fst-italic text-start text-danger']")
		private WebElement errormsg2;
		@FindBy(xpath="//p[@class='fw-light fst-italic text-start text-danger']")
		private WebElement errormsg3;
		@FindBy(xpath="//select[@name='project']")
		private WebElement project;
		@FindBy(xpath="//p[@class='fw-light fst-italic text-start text-danger']")
		private WebElement errormsg4;
		@FindBy(xpath="//select[@name='batch']")
		private WebElement batch;
		@FindBy(xpath="//p[@class='fw-light fst-italic text-start text-danger']")
		private WebElement errormsg5;
		@FindBy(xpath="//select[@name='cstatus']")
		private WebElement status;
		@FindBy(xpath="//button[@class='btn btn-success']")
		private WebElement submit1;
		@FindBy(xpath="//div[@id='swal2-html-container']")
		private WebElement success;
		@FindBy(xpath="//button[@class='swal2-confirm swal2-styled']")
		private WebElement ok;
		@FindBy(xpath="//button[@class='btn btn-warning']")
		private WebElement back;
		@FindBy(xpath="//ion-icon[@name=\"cloud-upload\"]")
		private WebElement upload;
		@FindBy(xpath="//label[text()='Upload a CSV File :']")
		private WebElement file;
		@FindBy(xpath="//input[@name='file']")
		private WebElement csvfile;
		@FindBy(xpath="//button[@type='submit']")
		private WebElement csvfilesubmit;
		@FindBy(xpath="//h2[@id='swal2-title']")
		private WebElement csvfilesuccess;
		@FindBy(xpath="//button[@class='swal2-confirm swal2-styled']")
		private WebElement csvfilesuccessok;
		@FindBy(xpath="//button[@class='swal2-confirm swal2-styled']")
		private WebElement csvfilesuccessok1;
		@FindBy(linkText="Click here to download a sample csv file")
		private WebElement dwldfile;
		@FindBy(xpath="//button[@class='ui mini button']")
		private WebElement cancel;
		@FindBy(xpath="//button[@class='btn btn-success']")
		private WebElement edit;
		@FindBy(xpath="//ion-icon[@name='close-circle']")
		private WebElement delete;
		@FindBy(xpath="//a[@id='basic-nav-dropdown']")
		private WebElement trainerarrow;
		@FindBy(linkText="Logout")
		private WebElement trainerlogout;
		
		public Trainer(WebDriver driver) 
		{
		this.driver = driver;
		PageFactory.initElements(driver, this);
		}
		public void User(String us, String ps) throws InterruptedException
		{
			user.sendKeys(us);
			pass.sendKeys(ps);
			eye.click();
			eye1.click();
			login.click();
			Thread.sleep(2000);
			user.clear();
			pass.clear();
			//close.click();
		}
		public String AlertMsg()
		{
			JavascriptExecutor jse2 = (JavascriptExecutor)driver;
			jse2.executeScript("arguments[0].click();", alertt);
			String actl1 = alertt.getText();
			return(actl1);
	                
		}
		public void Userblank(String us1, String ps1)
		{
			user1.sendKeys(us1);
			user1.sendKeys(Keys.BACK_SPACE);
			pass1.sendKeys(ps1);
			login1.click();
			user1.clear();
			pass1.clear();
			
		}
		public String blank()
		{
			String actl2 = blankus.getText();
			return(actl2);
		}
		public void Passblank(String us2, String ps2)
		{
			user2.sendKeys(us2);
			pass2.sendKeys(ps2);
			pass2.sendKeys(Keys.BACK_SPACE);
			login2.click();
			user2.clear();
			pass2.clear();
			
		}
		public String Passblank1()
		{
			String actl3 = blankps.getText();
			return(actl3);
		}
		public void Validlogin(String us3, String ps3)
		{
			user3.sendKeys(us3);
			pass3.sendKeys(ps3);
			login3.click();
			close.click();
}
		public String Head()
		{
			String actl4 = head.getText();
			return(actl4);
		}
		public void Learners()
		{
			add.click();	
			}
		
		public String Form()
		{
			String actl5 = addLearner.getText();
			return(actl5);
		}
		public void Learnerid(String id1)
		{
			id.sendKeys(id1);
			submit.click();
			}
		public String Form1()
		{
			String actl6 = errormsg.getText();
			return(actl6);
		}
		public void Learnerid1(String id2)
		{
			id.sendKeys(id2);
			submit.click();
			id.clear();
			}
		public void Learnerid2(String id3)
		{
			id.sendKeys(id3);
}
		public void Learnername(String name1)
		{
			namee.sendKeys(name1);
			submit.click();
			}
		public String Form2()
		{
			String actl7 = errormsg1.getText();
			return(actl7);
		}
		public void Learnername1(String name2)
		{
			namee.sendKeys(name2);
			submit.click();
			namee.clear();
			}
		public void Learnername2(String name3)
		{
			namee.sendKeys(name3);
}
		public void Learnercourse()
		{
			submit.click();
			
		}
		public String Form3()
		{
			String actl8 = errormsg2.getText();
			return(actl8);
		}
		public void Learnercourse1()
		{
			
			Select course1 = new Select(course);
			course1.selectByIndex(5);
		}
		public void Learnerproject()
		{
			submit.click();
			
		}
		public String Form4()
		{
			String actl9 = errormsg3.getText();
			return(actl9);
		}
		public void Learnerproject1()
		{
			
			Select course1 = new Select(project);
			course1.selectByIndex(1);
		}
		public void Learnerbatch()
		{
			submit.click();
			
		}
		public String Form5()
		{
			String actl10 = errormsg4.getText();
			return(actl10);
		}
		public void Learnerbatch1()
		{
			
			Select batch1 = new Select(batch);
			batch1.selectByIndex(1);
		}
		public void Learnerstatus()
		{
			submit.click();
			
		}
		public String Form6()
		{
			String actl11 = errormsg5.getText();
			return(actl11);
		}
		public void Learnerstatus1()
		{
			
			Select status1 = new Select(status);
			status1.selectByIndex(1);
		}
		public void Submit1()
		{
			submit1.click();
		}
		public String Form7()
		{
			String actl12 = success.getText();
			return(actl12);
		}
		public void Submitok()
		{
			ok.click();
		}
		public void Backto()
		{
			add.click();
			back.click();
		}
		public void Upload()
		{
			upload.click();
		}
		public String Form8()
		{
			String actl13 = file.getText();
			return(actl13);
		}
		public void Uploadcsv(String filepath)
		{
			
			csvfile.sendKeys(filepath);
			csvfilesubmit.click();
			csvfilesuccessok.click();
			csvfilesuccessok1.click();

			
		}
		public String Form9()
		{
			String actl14 = csvfilesuccess.getText();
			return(actl14);
		}
		public void Dwldfile()
		{
			upload.click();
			dwldfile.click();
		}

		public void Cancel()
		{
			cancel.click();
		}
		public void Edit()
		{
			edit.click();
		}
		public void Editdetails(String id4, String name4 )
		{
			id.clear();
			id.sendKeys(id4);
			namee.clear();
			namee.sendKeys(name4);
			Select course1 = new Select(course);
			course1.selectByIndex(5);
			Select course2 = new Select(project);
			course2.selectByIndex(1);
			Select batch1 = new Select(batch);
			batch1.selectByIndex(1);
			Select status1 = new Select(status);
			status1.selectByIndex(1);
			submit1.click();
			
		}
		public void Delete()
		{
			delete.click();
			
		}
		public void Trainerarrow()
		{
			trainerarrow.click();
		}
		public void Trainerlogout()
		{
			trainerlogout.click();
		}
}
