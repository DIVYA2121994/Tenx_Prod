package com.prod.pageobjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class TenxPO 
{
	public TenxPO()
	{
		
	}
	
    @FindBy(how=How.XPATH, using = "//input[@id='login_userId']")
    public static WebElement usernamefield;
    
    @FindBy(how=How.XPATH, using = "//input[@id='login_password']")
    public static WebElement passwordfield;
    
    @FindBy(how=How.XPATH, using = "//button[@id='login_submitButton']")
    public static WebElement login;
    
    @FindBy(how=How.XPATH, using = "//a[@id='green']")
    public static WebElement logout;
}
