package bank.cucumbermap;

import java.util.Hashtable;

import bank.methods.HTMLReportGenerator;
import bank.methods.SeleniumOperations;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Search 
{
	@When("^user able to click on \"([^\"]*)\" button$")
	public void branches(String xpath) throws Throwable 
	{
		Object[] input5=new Object[1];
		input5[0]="//*[@src='images/Branches_but.jpg']";
		Hashtable<String,Object>input5output=SeleniumOperations.click(input5);
		HTMLReportGenerator.StepDetails(input5output.get("STATUS").toString(), "^user able to click on \"([^\"]*)\" button", input5output.get("MESSAGE").toString());
	}

	@When("^user able to select Country as \"([^\"]*)\"$")
	public void country (String xpath) throws Throwable 
	{
		Object[] input6=new Object[2];
		input6[0]="//*[@name='lst_countryS']";
		input6[1]="INDIA";
		Hashtable<String,Object>input6output=SeleniumOperations.selectMethod(input6);
	    HTMLReportGenerator.StepDetails(input6output.get("STATUS").toString(),"^user able to select Country as \"([^\"]*)\"" , input6output.get("MESSAGE").toString());
	}

	@When("^user able to select State as \"([^\"]*)\"$")
	public void State(String xpath) throws Throwable 
	{
		Object[] input7=new Object[2];
		input7[0]="//*[@name='lst_stateS']";
		input7[1]="MAHARASTRA";
		Hashtable<String,Object>input7output=SeleniumOperations.selectMethod(input7);
		HTMLReportGenerator.StepDetails(input7output.get("STATUS").toString(), "^user able to select State as \"([^\"]*)\"",input7output.get("MESSAGE").toString());
	   
	}

	@When("^user able to select City as \"([^\"]*)\"$")
	public void city(String xpath) throws Throwable 
	{
		Object[] input8=new Object[2];
		input8[0]="//*[@name='lst_cityS']";
		input8[1]="MUMBAI";
		Hashtable<String,Object>input8output=SeleniumOperations.selectMethod(input8);
		HTMLReportGenerator.StepDetails(input8output.get("STATUS").toString(),"^user able to select City as \"([^\"]*)\"" , input8output.get("MESSAGE").toString());
	    
	}

	@When("^user able to click \"([^\"]*)\" button$")
	public void clicksearch(String xpath) throws Throwable 
	{
		Object[] input9=new Object[1];
		input9[0]="//*[@name='btn_search']";
		Hashtable<String,Object>input9output=SeleniumOperations.click(input9);
		HTMLReportGenerator.StepDetails(input9output.get("STATUS").toString(), "^user able to click \"([^\"]*)\" button",input9output.get("MESSAGE").toString());
	   
	}

	@Then("^user able to see \"([^\"]*)\" city results$")
	public void validation (String xpath) throws Throwable 
	{
		Object[]input10=new Object[2];
		input10[0]="(//*[text()='MUMBAI'])[1]";
		input10[1]="MUMBAI";
		Hashtable<String,Object>input10output=SeleniumOperations.validation(input10);
		HTMLReportGenerator.StepDetails(input10output.get("STATUS").toString(),"^user able to see \"([^\"]*)\" city results" , input10output.get("MESSAGE").toString());
		
		
	   
	}
			

	

}
