package bank.cucumbermap;

import java.util.Hashtable;

import bank.methods.HTMLReportGenerator;
import bank.methods.SeleniumOperations;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Login 
{
	@When ("^user opens the \"([^\")]*)\" browser and exepath \"([^\"]*)\"$")
	
	public void browserLaunch(String  bname, String xpath)
	{
		Object[]input = new Object[2];
		input[0]="Chrome";
		input[1]="G:\\Automation Tools\\chromedriver_win32\\chromedriver.exe";
		SeleniumOperations.browserLanuch(input);
	}

	@When ("^user opens the url \"([^\"]*)\"$")
	
	public void openURL(String url)
	{
		Object[]input1=new Object[1];
		input1[0]="http://primusbank.qedgetech.com/";
		SeleniumOperations.openURL(input1);
		
	}
	@When ("^user enters \"([^\"]*)\" as a username$")
	
	public void username(String xpath)
	{
		Object[]input2=new Object[2];
		input2[0]="//*[@id='txtuId']";
		input2[1]="Admin";
		Hashtable<String,Object>input2output=SeleniumOperations.sendKeys(input2);
		HTMLReportGenerator.StepDetails(input2output.get("STATUS").toString(),"^user enters \"([^\"]*)\" as a username",input2output.get("MESSAGE").toString());
		
	}
	
	@When ("^user enters \"([^\"]*)\" as a password$")
	
	public void password(String xpath)
	{
	Object[] input3=new Object[2];
	input3[0]="//*[@id='txtPword']";
	input3[1]="Admin";
	Hashtable<String,Object>input3output=SeleniumOperations.sendKeys(input3);
	HTMLReportGenerator.StepDetails(input3output.get("STATUS").toString(), "^user enters \"([^\"]*)\" as a password",input3output.get("MESSAGE").toString());
	}
	
	@When ("^user click on the \"([^\"]*)\" button$")
	
	public void loginbutton(String xpath)
	{
		Object[] input4=new Object[1];
		input4[0]="//*[@id='login']";
		Hashtable<String,Object>input4output=SeleniumOperations.click(input4);
		HTMLReportGenerator.StepDetails(input4output.get("STATUS").toString(),"^user click on the \"([^\"]*)\" button" , input4output.get("MESSAGE").toString());
	}
	
	@Then("^the user is on the \"([^\"]*)\" page and get message as Welcome to Admin$")
	public void validation1(String xpath)
	{
		Object[]input11=new Object[2];
		input11[0]="//*[@size='3']";
		input11[1]="Welcome to Admin";
		Hashtable<String,Object>input11output=SeleniumOperations.validation(input11);
		HTMLReportGenerator.StepDetails(input11output.get("STATUS").toString(),"^the user is on the \"([^\"]*)\" page and get message as Welcome to Admin" ,input11output.get("MESSAGE").toString());	
	}
	
	
	

}
