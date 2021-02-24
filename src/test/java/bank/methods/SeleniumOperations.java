package bank.methods;

import java.util.Hashtable;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.support.ui.Select;



public class SeleniumOperations 
{
	public static WebDriver driver=null;
	public static Hashtable<String,Object> outputParameters=new Hashtable<String,Object>();
	
	
		public static Hashtable<String,Object>browserLanuch(Object[]inputparameters)
	{
		try{
		String bname=(String)inputparameters[0];
		String exepath=(String)inputparameters[1];
	
		if (bname.equalsIgnoreCase("Chrome"))
		{
			System.setProperty("webdriver.chrome.driver", exepath);
			driver=new ChromeDriver();
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		}
		
		else if (bname.equalsIgnoreCase("FireFox"))
		{
			System.setProperty("webdriver.gecko.driver", exepath);
			driver=new FirefoxDriver();
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		}
		else if(bname.equalsIgnoreCase("IE"))
		{
			System.setProperty("webdriver.ie.driver", exepath);
			driver=new InternetExplorerDriver();
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		}
		outputParameters.put("STATUS", "PASS");
		outputParameters.put("MESSAGE", "Acion:Broeser Launch, Input Given:"+inputparameters[0].toString());
		
		
		} catch(Exception e)
			{
			outputParameters.put("STATUS", "FAIL");
			outputParameters.put("MESSAGE", "Acion:Browser Launch, Input Given:"+inputparameters[0].toString());
		}
		
		return outputParameters;
	}
	
		public static Hashtable<String,Object> openURL(Object[]inputparameters)
		{
			try{
		String url=(String)inputparameters[0];
		driver.get(url);
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		
		outputParameters.put("STATUS", "PASS");
		outputParameters.put("MESSAGE", "Acion:Open URL, Input Given:"+inputparameters[0].toString());
		
			}catch(Exception e)
			{
				outputParameters.put("STATUS", "FAIL");
				outputParameters.put("MESSAGE", "Acion:Open URL, Input Given:"+inputparameters[0].toString());
			}
			
		return outputParameters;	
		}

		public static Hashtable<String,Object> sendKeys(Object[]inputparameters)
		{
			try{
		String xpath=(String)inputparameters[0];
		String value=(String)inputparameters[1];
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		WebElement obj=driver.findElement(By.xpath(xpath));
				   obj.clear();
				   obj.sendKeys(value);
				   
			outputParameters.put("STATUS", "PASS");
			outputParameters.put("MESSAGE", "Acion:Send Keys, Input Given:"+inputparameters[0].toString());
				   
			}catch(Exception e)
			{
				outputParameters.put("STATUS", "FAIL");
				outputParameters.put("MESSAGE", "Acion:Send Keys, Input Given:"+inputparameters[0].toString());
			}
			
			return outputParameters;	
		}
		
		public static Hashtable<String,Object> click(Object[]inputParameters)
		{
			try{
		String xpath=(String)inputParameters[0];
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		WebElement obj=driver.findElement(By.xpath(xpath));
				   obj.click();
				   
		outputParameters.put("STATUS", "PASS");
		outputParameters.put("MESSAGE", "Acion:click, Input Given:"+inputParameters[0].toString());   
				   
		}
			
			
			catch(Exception e)
			{
				outputParameters.put("STATUS", "FAIL");
				outputParameters.put("MESSAGE", "Acion:click, Input Given:"+inputParameters[0].toString());
			}
			
			return outputParameters;	
		}
		
		public static Hashtable<String,Object> selectMethod(Object[]inputParameters)
		{
			try{
			String xpath=(String)inputParameters[0];
			String name=(String) inputParameters[1];
			driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);		
			Select sel=new Select(driver.findElement(By.xpath(xpath)));
			sel.selectByVisibleText(name);
			
			outputParameters.put("STATUS", "PASS");
			outputParameters.put("MESSAGE", "Acion:Select Method, Input Given:"+inputParameters[0].toString()); 
			
			}catch (Exception e)
			{
				outputParameters.put("STATUS", "FAIL");
				outputParameters.put("MESSAGE", "Acion:Select Method, Input Given:"+inputParameters[0].toString());
			}
			
			return outputParameters;
		}
		
		public static Hashtable<String,Object> validation(Object[]inputParameters)
		{
			String xpath=(String)inputParameters[0];
			String string1=(String)inputParameters[1];
			
			WebElement web=driver.findElement(By.xpath(xpath));
			
			String String2=web.getText();
			try
			{
			if(string1.equalsIgnoreCase(String2))
			{
				System.out.println("Testcase is passed");
			}
			else
			{
				System.out.println("Test case Failed");
			}
			
			outputParameters.put("STATUS", "PASS");
			outputParameters.put("MESSAGE", "Acion:Validation, Input Given:"+inputParameters[0].toString()); 
			}
			catch(Exception e)
			{
				outputParameters.put("STATUS", "FAIL");
				outputParameters.put("MESSAGE", "Acion:Validation, Input Given:"+inputParameters[0].toString());
			}

			return outputParameters;
		}
		
		
		
}
	
	

