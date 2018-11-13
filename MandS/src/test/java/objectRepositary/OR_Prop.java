package objectRepositary;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class OR_Prop {
	
	@FindBy(xpath="//label[@class='BC']")
	public WebElement BandC;
	
	@FindBy(xpath="//select[@name='PropertyType']")
	public WebElement PropType;
	
	@FindBy(xpath="//input[@name='YearBuilt']")
	public WebElement YearBuilt;
	
	
	@FindBy(xpath="//select[@name='NumberOfBedrooms']")
	public WebElement NoOfBed;
	
	@FindBy(xpath="//select[@name='NumberOfBathrooms']")
	public WebElement NoOfBath;
	
	@FindBy(xpath="//label[@for='constructionTypeNo']")
	public WebElement tiledRoof;
	
	@FindBy(xpath="//label[@for='ownership_M']")
	public WebElement Mortgaged;
	
	@FindBy(xpath="//select[@id='PropertyUsedType']")
	public WebElement propUsed;
	
	@FindBy(xpath="//label[@for='floodingYes']")
	public WebElement Flooding;
	
	@FindBy(xpath="//select[@name='NumberOfAdults']")
	public WebElement Adults;
	
	@FindBy(xpath="//select[@name='NumberOfChildren']")
	public WebElement Children;
	
	@FindBy(xpath="//label[@for='years_3']")
	public WebElement Year_Insur;
	
	@FindBy(xpath="//label[@for='unOccupiedDuringDayYes']")
	public WebElement Ocuppy_Day;
	
	@FindBy(xpath="//a[@class='bt_date']")
	public WebElement datePicker;
	
	@FindBy(xpath="//div[@class='ui-datepicker-inline ui-datepicker ui-widget ui-widget-content ui-helper-clearfix ui-corner-all']/table[@class='ui-datepicker-calendar']/tbody/tr/td/a")
	public List<WebElement> chooseDate;
	
	@FindBy(xpath="//a[@class='ui-datepicker-next ui-corner-all']")
	public WebElement calender_Next;
	
	@FindBy(xpath="//div[@class='ui-datepicker-title']/span[@class='ui-datepicker-month']")
	public WebElement calender__Month;
	
	
	
	
	
	
	
	
	
	
	
	


}
