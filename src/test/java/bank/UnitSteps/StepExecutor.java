package bank.UnitSteps;

import bank.methods.SeleniumOperations;

public class StepExecutor 
{
	public static void main(String[]args)
{

//open Browser		
Object[]input = new Object[2];
input[0]="Chrome";
input[1]="G:\\Automation Tools\\chromedriver_win32\\chromedriver.exe";
SeleniumOperations.browserLanuch(input);

//open website
Object[]input1=new Object[1];
input1[0]="http://primusbank.qedgetech.com/";
SeleniumOperations.openURL(input1);

//Enter Username
Object[]input2=new Object[2];
input2[0]="//*[@id='txtuId']";
input2[1]="Admin";
SeleniumOperations.sendKeys(input2);

//Enter Password
Object[] input3=new Object[2];
input3[0]="//*[@id='txtPword']";
input3[1]="Admin";
SeleniumOperations.sendKeys(input3);

//Click on Login button
Object[] input4=new Object[1];
input4[0]="//*[@id='login']";
SeleniumOperations.click(input4);


//click on Branches
Object[] input5=new Object[1];
input5[0]="//*[@src='images/Branches_but.jpg']";
SeleniumOperations.click(input5);

//Select Country 
Object[] input6=new Object[2];
input6[0]="//*[@name='lst_countryS']";
input6[1]="INDIA";
SeleniumOperations.selectMethod(input6);

//Select State
Object[] input7=new Object[2];
input7[0]="//*[@name='lst_stateS']";
input7[1]="MAHARASTRA";
SeleniumOperations.selectMethod(input7);

//Select City 
Object[] input8=new Object[2];
input8[0]="//*[@name='lst_cityS']";
input8[1]="MUMBAI";
SeleniumOperations.selectMethod(input8);

//Click on Search Button
Object[] input9=new Object[1];
input9[0]="//*[@name='btn_search']";
SeleniumOperations.click(input9);


Object[]input11=new Object[2];
input11[0]="//*[@size='3']";
input11[1]="Welcome to Admin";
SeleniumOperations.validation(input11);

//Print Welcome to admin
Object[]input10=new Object[2];
input10[0]="(//*[text()='MUMBAI'])[1]";
input10[1]="MUMBAI";
SeleniumOperations.validation(input10);



}	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
