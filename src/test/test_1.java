package test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import pages.homepage;

public class test_1 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
        System.setProperty("webdriver.chrome.driver", "/Users/ashrafhossain/Downloads/webdriver/chromedriver");
		WebDriver browser = new ChromeDriver();
		//going to website
		browser.get("https://www.makemytrip.com/?ccde=us");
		
		homepage home = new homepage(browser);
		home.roundtrip().click();
		home.from().click();
		home.from1().sendKeys("delhi");
		Thread.sleep(2000l);//pause
		home.from2().click();
		home.to().click();
		home.to1().sendKeys("mumbai");
		Thread.sleep(2000l);//pause
		home.to2().click();
		home.next().click();
		Thread.sleep(2000l);//pause
		home.departue_date().click();
		Thread.sleep(2000l);
		home.next().click();
		home.return_date().click();
		Thread.sleep(1000l);//pause
		home.traveller().click();
		Thread.sleep(2000l);//pause
		home.passenger().click();
		home.ticket_class().click();
		Thread.sleep(2000l);//pause
		home.apply().click();
		Thread.sleep(2000l);//pause
		home.search().click();
		
		
		

	}

}
