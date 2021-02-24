package bank.cucumbermap;

import java.net.UnknownHostException;

import bank.methods.HTMLReportGenerator;
import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;

public class Hookable 


{
	
	
	@Before
	public void before(Scenario scenario) throws UnknownHostException
	{
		HTMLReportGenerator.TestSuiteStart("D:\\primusbank.html", "PrimusBank");
		HTMLReportGenerator.TestCaseStart(scenario.getName(), scenario.getStatus());
		
		System.out.println("________________Scenario Start________________");
		
	}
	@After
	public void after (Scenario scenario)
	{
		System.out.println("________________Scenario End________________");
	
		HTMLReportGenerator.TestCaseEnd();
		HTMLReportGenerator.TestSuiteEnd();
	
	}
	
	

}
