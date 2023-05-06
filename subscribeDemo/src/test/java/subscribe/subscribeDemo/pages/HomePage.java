package subscribe.subscribeDemo.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.testng.Assert;

import com.aventstack.extentreports.ExtentTest;

/**
 * Sample page
 */
public class HomePage extends Page {

  @FindBy(how = How.TAG_NAME, using = "h1") public WebElement header;
  @FindBy(id = "country-btn") public WebElement home_countrySelectBtn;
  @FindBy(id = "bh") public WebElement home_CountryBahrainLink;
  @FindBy(id = "sa") public WebElement home_CountryKSALink;
  @FindBy(id = "kw") public WebElement home_CountryKuwaitLink;
  
  //1st way
  @FindBy(xpath = "(//*[@class='plan-title'])[1]") public WebElement home_package1Title;
  @FindBy(xpath = "(//*[@class='plan-title'])[2]") public WebElement home_package2Title;
  @FindBy(xpath = "(//*[@class='plan-title'])[3]") public WebElement home_package3Title;
  @FindBy(xpath = "(//*[@class='price']/b)[1]") public WebElement home_package1price;
  @FindBy(xpath = "(//*[@class='price']/b)[2]") public WebElement home_package2price;
  @FindBy(xpath = "(//*[@class='price']/b)[3]") public WebElement home_package3price;
  @FindBy(xpath = "(//*[@class='price']/i)[1]") public WebElement home_package1Currency;
  @FindBy(xpath = "(//*[@class='price']/i)[2]") public WebElement home_package2Currency;
  @FindBy(xpath = "(//*[@class='price']/i)[3]") public WebElement home_package3Currency;
  
  //second way
  String packageNameXpath="(//*[@class='plan-title'])";
  String priceXpath="(//*[@class='price']/b)";
  String currencyXpath="(//*[@class='price']/i)";
  
  public HomePage(WebDriver webDriver) {
    super(webDriver);
  }
  
  public boolean verifyPackageDetails(ExtentTest extentLogger,int packageNumber,String packageName,String price,String currency) {
	  boolean status=false;
	  try {
		String actualName=driver.findElement(By.xpath(packageNameXpath+"["+packageNumber+"]")).getText();
		String actualprice=driver.findElement(By.xpath(priceXpath+"["+packageNumber+"]")).getText();
		String actualCurrency=driver.findElement(By.xpath(currencyXpath+"["+packageNumber+"]")).getText();
		Assert.assertEquals(actualName, packageName,"expected:"+packageName+" but actual:"+actualName);
		extentLogger.info("Package name verified: "+packageName);
		Assert.assertEquals(actualprice, price,"expected:"+price+" but actual:"+actualprice);
		extentLogger.info("price value verified: "+price);
		if(actualCurrency.contains(currency)) {
			extentLogger.info("currency name verified: "+currency);
			status=true;
		}
		else {
			extentLogger.info("currency name verified failed: expected:"+currency+" but actual:"+actualCurrency);
			status=false;
		}
	} catch (Exception e) {
		extentLogger.error("Package Verificatin failed for "+packageName);
		e.printStackTrace();
		status=false;
	}
	return status;
	  
  }
}
