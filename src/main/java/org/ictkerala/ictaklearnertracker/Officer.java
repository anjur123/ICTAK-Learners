package org.ictkerala.ictaklearnertracker;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class Officer {
	
	WebDriver driver;
	@FindBy(xpath="//input[@id='username']")
	private WebElement user2;
	@FindBy(xpath="//input[@id='password']")
	private WebElement pass2;
	@FindBy(xpath="//i[@class='bi bi-eye-slash']")
	private WebElement eye1;
	@FindBy(xpath="//i[@class='bi bi-eye']")
	private WebElement eye2;
	@FindBy(xpath="//button[@class='btn btn-success w-100']")
	private WebElement login1;
	@FindBy(xpath="//div[@class='fade alert alert-danger alert-dismissible show']")
	private WebElement alertt1;
	@FindBy(linkText="LearnerTracker")
	private WebElement head1;
	@FindBy(xpath="//button[@class='btn btn-success btn btn-primary']")
	private WebElement button;
	@FindBy(xpath="//*[@id=\"root\"]/div/div/div[2]/main/div/div/h3")
	private WebElement Learnerform;
	@FindBy(xpath="//button[@class='btn btn-success']")
	private WebElement Learnerformsubmit;
	@FindBy(xpath="//select[@name='pstatus']")
	private WebElement Learnerstatus;
	@FindBy(xpath="//button[text()='Back to Dashboard']")
	private WebElement backd;
	@FindBy(xpath="//a[@id='basic-nav-dropdown']")
	private WebElement officerarrow;
	@FindBy(linkText="Logout")
	private WebElement logout1;
	
	
	
	public Officer(WebDriver driver) 
	{
	this.driver = driver;
	PageFactory.initElements(driver, this);
	}
	public void User(String us, String ps)
	{
		user2.sendKeys(us);
		pass2.sendKeys(ps);
		eye1.click();
		eye2.click();
		login1.click();
		
	}
	public String Head()
	{
		String actl1 = head1.getText();
		return(actl1);
	}
	
	public void Button()
	{
		button.click();
		}
	public String Heading()
	{
		String actl2 = Learnerform.getText();
		return(actl2);
	}
        		
	public void Buttonsubmit()
	{
	
		Learnerformsubmit.click();
		}
	public void Placement()
	{
		button.click();
		Learnerstatus.click();
		}
	public void Learnerbatch1()
	{
		
		Select status = new Select(Learnerstatus);
		status.selectByIndex(2);
		
	}
	public void Backtod()
	{
		
		button.click();
		backd.click();
		}
	public void Officer1()
	{
		
		officerarrow.click();
		logout1.click();
		}
	public void AdminLogin(String us3, String ps3)
	{
		
		user2.sendKeys(us3);	
		pass2.sendKeys(ps3);
		eye1.click();
		eye2.click();
		login1.click();
		}
	public String Loginfail()
	{
		String actl1 = alertt1.getText();
		return(actl1);
	}
}
