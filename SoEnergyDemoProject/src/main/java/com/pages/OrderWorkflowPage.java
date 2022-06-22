package com.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import java.util.*;

public class OrderWorkflowPage {

	private WebDriver driver;
	Actions actions;
	

	// 1. By Locators: OR
	private By dressesMenu = By.xpath("//ul[@class=\"sf-menu clearfix menu-content sf-js-enabled sf-arrows\"]/li[2]/a");
	private By summerDresses = By.xpath("//ul[@class=\"sf-menu clearfix menu-content sf-js-enabled sf-arrows\"]/li[2]/ul/li[3]/a");
	private By listView = By.xpath("//i[@class=\"icon-th-list\"]");
	private By addToCart = By.xpath("//div[@class=\"button-container col-xs-7 col-md-12\"]/a");
	private By proceedToCheckoutpopup = By.xpath("//a[@href=\"http://automationpractice.com/index.php?controller=order\"]");
	private By orderDropdown = By.xpath("//a[@title=\"View my shopping cart\"]");
	private By quantityIncrease = By.xpath("//i[@class=\"icon-plus\"]");
	private By signIn = By.xpath("//div[@class=\"header_user_info\"]/a");
	private By emailId = By.xpath("//input[@name=\"email\"]");
	private By passwd = By.xpath("//input[@name=\"passwd\"]");
	private By submitLogin = By.xpath("//button[@name=\"SubmitLogin\"]");
	private By proceedToCheckoutSummary = By.xpath("//a[@class=\"button btn btn-default standard-checkout button-medium\"]");
	private By confirmAddress = By.xpath("//button[@class=\"button btn btn-default button-medium\"]");
	private By shippingAddress = By.xpath("//button[@class=\"button btn btn-default standard-checkout button-medium\"]");
	private By termsCheckbox = By.xpath("//input[@id=\"cgv\"]");
	private By productName = By.xpath("//p[@class=\"product-name\"]/a");
	private By totalPrice = By.xpath("//span[@id=\"total_price\"]");
	
	
	// 2. Constructor of the page class:
	public OrderWorkflowPage(WebDriver driver) {
		this.driver = driver;
	}

	
	public void mousehoveronDressesMenuandClickSummerDress() throws InterruptedException {
		WebElement dressesmenuElement = driver.findElement(dressesMenu);
		WebElement summerDressesMenuElement = driver.findElement(summerDresses);
		actions = new Actions(driver);
		actions.moveToElement(dressesmenuElement).moveToElement(summerDressesMenuElement).click().perform();
		Thread.sleep(10000);
	}
	
	
	public void changetoListView() {
		driver.findElement(listView).click();
	}
	
	public void clickonAddToCart() {
		driver.findElement(addToCart).click();
	}
	
	
	public void proceedtoCheckout()
	{
		driver.findElement(proceedToCheckoutpopup).click();
		driver.findElement(orderDropdown).click();
		
	}
	
	public void increaseDressesQuantity()
	{
		driver.findElement(quantityIncrease).click();
				
	}
	
	public void loginIntoTheApp()
	{
		driver.findElement(signIn).click();
		driver.findElement(emailId).sendKeys("balaa_krish@hotmail.com");
		driver.findElement(passwd).sendKeys("Sastra");
		driver.findElement(submitLogin).click();	
		driver.findElement(orderDropdown).click();
	}
	
	public void NavigateUntilPaymentPage()
	{
		driver.findElement(proceedToCheckoutSummary).click();
		driver.findElement(confirmAddress).click();
		driver.findElement(termsCheckbox).click();
		driver.findElement(shippingAddress).click();
		String product = driver.findElement(productName).getText();
		System.out.println("Product Name is" + product);
		String price = driver.findElement(totalPrice).getText();
		System.out.println("Price is" + price);

		
	}
	

	
}
