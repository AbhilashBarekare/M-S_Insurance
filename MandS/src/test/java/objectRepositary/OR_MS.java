package objectRepositary;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class OR_MS {
	
	
	
	@FindBy(xpath="//select[@name='PolicyHolder.Title']")
	public WebElement Title;
	
	@FindBy(xpath="//input[@id='PolicyHolder_FirstName']")
	public WebElement FirstName;
	
	@FindBy(xpath="//input[@id='PolicyHolder_LastName']")
	public WebElement LastName;
	
	@FindBy(xpath="//input[@name='PolicyHolder.DateOfBirth']")
	public WebElement Dob;
	
	@FindBy(xpath="//input[@name='PropertyToInsure.Postcode']")
	public WebElement PostCode;
	
	@FindBy(xpath="//input[@id='addressLookup']")
	public WebElement MyAddress;
	
	@FindBy(xpath="//select[@id='PropertyToInsure_MultiplePostcode']")
	public WebElement SelectAdress;
	
	@FindBy(xpath="//label[@for='IsCorrespondenceAddressDifferentNo']")
	public WebElement Address;
	
	@FindBy(xpath="//input[@id='PolicyHolder_EmailAddress']")
	public WebElement Email;
	
	@FindBy(xpath="//input[@id='PolicyHolder_TelephoneNumber']")
	public WebElement Phone;
	
	@FindBy(xpath="//input[@name='continueButton']")
	public WebElement Continue;
	
	
	
	

}
