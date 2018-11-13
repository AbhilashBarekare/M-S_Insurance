package pageAction;

import java.io.IOException;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.By;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import genericLib.TestBase;
import genericLib.propertyHelper;
import objectRepositary.OR_MS;
import objectRepositary.OR_Prop;

public class myProperty extends TestBase {
	
	@Test
	public void propDetails() throws IOException{
		//which  we want to create log file
				Logger logger=Logger.getLogger("myProperty");
				
				// configure log4j properties file
			    PropertyConfigurator.configure("log4j.properties");
			    
	TestBase tb = new TestBase();
	propertyHelper ph=new propertyHelper();
	OR_Prop obj=PageFactory.initElements(driver, OR_Prop.class);
	
	tb.waitUntil(obj.BandC);
	logger.info("Property details page got loaded.");
	
	tb.performClick(obj.BandC);
	
	
	tb.selectDropdown(obj.PropType, "4", "index");
	
	tb.setText(obj.YearBuilt, ph.fetchValue("Yearbuilt"));
	
	tb.selectDropdown(obj.NoOfBed, "5", "index");
	
	tb.selectDropdown(obj.NoOfBed, "3", "index");
	
	tb.performClick(obj.tiledRoof);
	
	tb.performClick(obj.Mortgaged);
	
	tb.selectDropdown(obj.propUsed, "4", "index");
	
	tb.performClick(obj.Flooding);
	
	tb.selectDropdown(obj.Adults, "4", "index");
	
	tb.selectDropdown(obj.Children, "2", "index");
	
	tb.performClick(obj.Year_Insur);
	
	tb.performClick(obj.Ocuppy_Day);
	
	tb.performClick(obj.datePicker);

	//Selecting ur desierd month



	 while(!obj.calender__Month.getText().contains("December"))

	 {

	  tb.performClick(obj.calender_Next);

	 }

	int count1= obj.chooseDate.size();
	System.out.println(count1);

	 

	for (int i=0;i<count1;i++)

	{

	 String s1= obj.chooseDate.get(i).getText();
	 System.out.println(s1);

	 

	 if (s1.equalsIgnoreCase("15"))

	 {
		 
		 obj.chooseDate.get(i).click();
		 break;

	 }

	 

	}

	
	
	
	}

	
	
	
}
