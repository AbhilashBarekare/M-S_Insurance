package pageAction;

import java.io.IOException;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import genericLib.TestBase;
import genericLib.propertyHelper;
import objectRepositary.OR_MS;

public class yourDetails extends TestBase {
	
	@Test
	public void basicDetail() throws IOException, InterruptedException{
		
		//which  we want to create log file
		Logger logger=Logger.getLogger("yourDetails");
		
		// configure log4j properties file
	    PropertyConfigurator.configure("log4j.properties");
	    
		TestBase tb = new TestBase();
		
		propertyHelper ph=new propertyHelper();
		tb.initializeDriver(ph.fetchValue("browserType"));
		OR_MS obj=PageFactory.initElements(driver, OR_MS.class);
		
		//Launch URL
		driver.get(ph.fetchValue("url_MS"));
		logger.info("Launched the webpage successfully");
		
		//Select value for Title dropdown
		tb.selectDropdown(obj.Title, "1","index");
		logger.info("Selected title");
		
		//Enter value in First Name field
		tb.setText(obj.FirstName, ph.fetchValue("FirstName"));
		logger.info("Entered customer first name" + ph.fetchValue("FirstName") );
		
		//Enter value in Last Name field
		tb.setText(obj.LastName, ph.fetchValue("LastName"));
		logger.error("Wrong input");
		
		//Enter value in Date of Birth field
		tb.setText(obj.Dob, ph.fetchValue("Date"));
		
		//Enter value in Post Code field
		tb.setText(obj.PostCode, ph.fetchValue("Post"));
		
		tb.performClick(obj.MyAddress);
		
		tb.waitUntil(obj.SelectAdress);
		
		tb.selectDropdown(obj.SelectAdress, "1", "index");
		
		//Click on No button
		//obj.Address.click();
		tb.performClick(obj.Address);
		
		
		
		//Enter value in Email field
		tb.setText(obj.Email, ph.fetchValue("Email"));
		
		//Enter value in Phone field
		tb.setText(obj.Phone, ph.fetchValue("Phone"));
		
		//Click on Continue button
		tb.performClick(obj.Continue);
		
		
		
		
		
	}

}
