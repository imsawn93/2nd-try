package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class homepage {
	//constructor
	WebDriver driver;
	
	public homepage(WebDriver driver) {
		
	this.driver = driver;
	
	PageFactory.initElements(driver, this);
		
	}
	
	//clicking round trip
	@FindBy (xpath="//li[contains(text(),'Round Trip')]")
	WebElement roundtrip;
	//clicking from box
	@FindBy (xpath="//*[@id=\"root\"]/div/div[2]/div/div/div[2]/div[1]/div[1]/label")
	WebElement from;
	//writing delhi
	@FindBy (xpath="//input[@placeholder='From']")
	WebElement from1;
	//clicking delhi
	@FindBy (xpath="//li[@id='react-autowhatever-1-section-0-item-0']//p[text()='Delhi Airport']")
	WebElement from2;
	//clicking to box
	@FindBy (xpath="//input[@id='toCity']")
	WebElement to;
	//writing mumbai
	@FindBy (xpath="//input[@placeholder='To']")
	WebElement to1;
	//clicking mumbai
	@FindBy (xpath="//li[@id='react-autowhatever-1-section-0-item-0']//div[@class='calc60']")
	WebElement to2;
	//clicking next button in departure
	@FindBy (xpath="//span[@class='DayPicker-NavButton DayPicker-NavButton--next']")
	WebElement next;
	//picking the date in departure
	@FindBy (xpath=" //div[@class='DayPicker-wrapper']//div[1]//div[3]//div[4]//div[3]//div[1]//p[1]")
	WebElement departue_date;

	//picking the date in departure
	@FindBy (xpath="//div[@class='DayPicker-Months']//div[2]//div[3]//div[2]//div[4]//div[1]//p[1]")
	WebElement return_date;
	//selecting traveller & class
	@FindBy (xpath="//div[contains(@class,'fsw_inputBox flightTravllers inactiveWidget')]//label")
	WebElement traveller;
	//selecting passenger number
	@FindBy (xpath="//body/div[@id='root']/div/div/div/div/div/div/div/div/div/ul[1]/li[2]")
	WebElement passenger;
	//clicking ticket class
	@FindBy (xpath="//li[contains(text(),'Business')]")
	WebElement ticket_class;
	//clicking apply
	@FindBy (xpath="//div[@id='root']//div//div//div//div//div//div//div//div//button")
	WebElement apply;
	//clicking search
	@FindBy (xpath="//div[@id='root']//div//div//div//div//div//p//a")
	WebElement search;
	
	
	
	
	
	
	public WebElement roundtrip() {
	return roundtrip;}
	
	public WebElement from() {
	return from;}
	
	public WebElement from1() {
	return from1;}
	
	public WebElement from2() {
	return from2;}
	
	public WebElement to() {
	return to;}
	
	public WebElement to1() {
	return to1;}
	
	public WebElement to2() {
	return to2;}
	
	public WebElement next() {
	return next;}
	
	public WebElement  departue_date() {
	return  departue_date;}
		
	public WebElement return_date() {
	return  return_date;}
	
	public WebElement traveller() {
	return  traveller;}
	
	public WebElement passenger() {
	return  passenger;}
	
	public WebElement ticket_class() {
	return  ticket_class;}
	
	public WebElement apply() {
	return  apply;}
	
	public WebElement search() {
	return  search;}
	



	

	
		
	
	
	

}
