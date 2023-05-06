package tests;

import java.io.IOException;
import java.time.Duration;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import subscribe.subscribeDemo.Reusables;
import subscribe.subscribeDemo.TestNgTestBase;
import subscribe.subscribeDemo.pages.HomePage;

public class VerifyPackages extends TestNgTestBase {
	private HomePage homepage;
	private static final Logger logger = LogManager.getLogger(VerifyPackages.class);
	String expectedTitle;
	String inputText;

	@BeforeMethod
	public void initPageObjects() {
		homepage = PageFactory.initElements(driver, HomePage.class);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	}

	@Test(priority = 1)
	public void verifyBahrain() throws IOException {
		logger.info("Test execution started");
		extentLogger = report.createTest("VerifyPackages::verifyBahrain");
		driver.get(baseUrl);
		Assert.assertTrue("stc tv - Watch Online movies, series & live TV | Enjoy Free Trial".equals(driver.getTitle()));
		extentLogger.info("Page title verifed");		
		//expectedTitle = Reusables.readExcelData(Constants.EXCEL_PATH, "TestCases", 2, 2);
		Reusables.click(driver, homepage.home_countrySelectBtn);
		Reusables.click(driver, homepage.home_CountryBahrainLink);
		Assert.assertTrue(homepage.verifyPackageDetails(extentLogger,1, "LITE", "2", "BHD"),"LITE Package verification Failed");
		extentLogger.info("Lite Package verification passed for Type & Price and Currency");
		Assert.assertTrue(homepage.verifyPackageDetails(extentLogger,2, "CLASSIC", "3", "BHD"),"CLASSIC Package verification Failed");
		extentLogger.info("CLASSIC Package verification passed for Type & Price and Currency");
		Assert.assertTrue(homepage.verifyPackageDetails(extentLogger,3, "PREMIUM", "6", "BHD"),"PREMIUM Package verification Failed");
		extentLogger.info("PREMIUM Package verification passed for Type & Price and Currency");
		extentLogger.pass("Passed:verifyBahrain");
	}
	@Test(priority = 2)
	public void verifyKSA() throws IOException {
		logger.info("Test execution started");
		extentLogger = report.createTest("VerifyPackages::verifyKSA");
		driver.get(baseUrl);
		Assert.assertTrue("stc tv - Watch Online movies, series & live TV | Enjoy Free Trial".equals(driver.getTitle()));
		extentLogger.info("Page title verifed");		
		//expectedTitle = Reusables.readExcelData(Constants.EXCEL_PATH, "TestCases", 2, 2);
		Reusables.click(driver, homepage.home_countrySelectBtn);
		Reusables.click(driver, homepage.home_CountryKSALink);
		Assert.assertTrue(homepage.verifyPackageDetails(extentLogger,1, "LITE", "15", "SAR"),"LITE Package verification Failed");
		extentLogger.info("Lite Package verification passed for Type & Price and Currency");
		Assert.assertTrue(homepage.verifyPackageDetails(extentLogger,2, "CLASSIC", "25", "SAR"),"CLASSIC Package verification Failed");
		extentLogger.info("CLASSIC Package verification passed for Type & Price and Currency");
		Assert.assertTrue(homepage.verifyPackageDetails(extentLogger,3, "PREMIUM", "60", "SAR"),"PREMIUM Package verification Failed");
		extentLogger.info("PREMIUM Package verification passed for Type & Price and Currency");
		extentLogger.pass("Passed:verifyKSA");
	}
	
	@Test(priority = 3)
	public void verifyKuwait() throws IOException {
		logger.info("Test execution started");
		extentLogger = report.createTest("VerifyPackages::verifyKuwait");
		driver.get(baseUrl);
		Assert.assertTrue("stc tv - Watch Online movies, series & live TV | Enjoy Free Trial".equals(driver.getTitle()));
		extentLogger.info("Page title verifed");		
		//expectedTitle = Reusables.readExcelData(Constants.EXCEL_PATH, "TestCases", 2, 2);
		Reusables.click(driver, homepage.home_countrySelectBtn);
		Reusables.click(driver, homepage.home_CountryKuwaitLink);
		Assert.assertTrue(homepage.verifyPackageDetails(extentLogger,1, "LITE", "1.2", "KWD"),"LITE Package verification Failed");
		extentLogger.info("LITE Package verification passed for Type & Price and Currency");
		Assert.assertTrue(homepage.verifyPackageDetails(extentLogger,2, "CLASSIC", "2.5", "KWD"),"CLASSIC Package verification Failed");
		extentLogger.info("CLASSIC Package verification passed for Type & Price and Currency");
		//failing the following case by intentionally: actual price is 4.8 but given wrong value as 9
		Assert.assertTrue(homepage.verifyPackageDetails(extentLogger,3, "PREMIUM", "9", "KWD"),"PREMIUM Package verification Failed");
		extentLogger.info("PREMIUM Package verification passed for Type & Price and Currency");
		extentLogger.pass("Passed:verifyKuwait");
	}

}
