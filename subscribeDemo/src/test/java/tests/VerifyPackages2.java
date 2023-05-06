package tests;

import java.io.IOException;
import java.time.Duration;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import subscribe.subscribeDemo.Constants;
import subscribe.subscribeDemo.Reusables;
import subscribe.subscribeDemo.TestNgTestBase;
import subscribe.subscribeDemo.pages.HomePage;

public class VerifyPackages2 extends TestNgTestBase {
	private HomePage homepage;
	private static final Logger logger = LogManager.getLogger(VerifyPackages2.class);
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
		expectedTitle = Reusables.readExcelData(Constants.EXCEL_PATH, "TestCases", 1, 2);
		Assert.assertTrue(expectedTitle.equals(driver.getTitle()));
		extentLogger.info("Page title verifed");

		Reusables.click(driver, homepage.home_countrySelectBtn);
		Reusables.click(driver, homepage.home_CountryBahrainLink);
		Assert.assertTrue(
				homepage.verifyPackageDetails(extentLogger, 1,
						Reusables.readExcelData(Constants.EXCEL_PATH, "TestCases", 1, 3),
						Reusables.readExcelData(Constants.EXCEL_PATH, "TestCases", 1, 4),
						Reusables.readExcelData(Constants.EXCEL_PATH, "TestCases", 1, 5)),
				"LITE Package verification Failed");
		extentLogger.info("Lite Package verification passed for Type & Price and Currency");
		Assert.assertTrue(
				homepage.verifyPackageDetails(extentLogger, 2,
						Reusables.readExcelData(Constants.EXCEL_PATH, "TestCases", 2, 3),
						Reusables.readExcelData(Constants.EXCEL_PATH, "TestCases", 2, 4),
						Reusables.readExcelData(Constants.EXCEL_PATH, "TestCases", 2, 5)),
				"CLASSIC Package verification Failed");
		extentLogger.info("CLASSIC Package verification passed for Type & Price and Currency");
		Assert.assertTrue(
				homepage.verifyPackageDetails(extentLogger, 3,
						Reusables.readExcelData(Constants.EXCEL_PATH, "TestCases", 3, 3),
						Reusables.readExcelData(Constants.EXCEL_PATH, "TestCases", 3, 4),
						Reusables.readExcelData(Constants.EXCEL_PATH, "TestCases", 3, 5)),
				"PREMIUM Package verification Failed");
		extentLogger.info("PREMIUM Package verification passed for Type & Price and Currency");
		extentLogger.pass("Passed:verifyBahrain");
	}

	@Test(priority = 2)
	public void verifyKSA() throws IOException {
		logger.info("Test execution started");
		extentLogger = report.createTest("VerifyPackages::verifyKSA");
		driver.get(baseUrl);
		expectedTitle = Reusables.readExcelData(Constants.EXCEL_PATH, "TestCases", 4, 2);
		Assert.assertTrue(expectedTitle.equals(driver.getTitle()));
		extentLogger.info("Page title verifed");
		Reusables.click(driver, homepage.home_countrySelectBtn);
		Reusables.click(driver, homepage.home_CountryKSALink);
		Assert.assertTrue(
				homepage.verifyPackageDetails(extentLogger, 1,
						Reusables.readExcelData(Constants.EXCEL_PATH, "TestCases", 4, 3),
						Reusables.readExcelData(Constants.EXCEL_PATH, "TestCases", 4, 4),
						Reusables.readExcelData(Constants.EXCEL_PATH, "TestCases", 4, 5)),
				"LITE Package verification Failed");
		extentLogger.info("Lite Package verification passed for Type & Price and Currency");
		Assert.assertTrue(
				homepage.verifyPackageDetails(extentLogger, 2,
						Reusables.readExcelData(Constants.EXCEL_PATH, "TestCases", 5, 3),
						Reusables.readExcelData(Constants.EXCEL_PATH, "TestCases", 5, 4),
						Reusables.readExcelData(Constants.EXCEL_PATH, "TestCases", 5, 5)),
				"CLASSIC Package verification Failed");
		extentLogger.info("CLASSIC Package verification passed for Type & Price and Currency");
		Assert.assertTrue(
				homepage.verifyPackageDetails(extentLogger, 3,
						Reusables.readExcelData(Constants.EXCEL_PATH, "TestCases", 6, 3),
						Reusables.readExcelData(Constants.EXCEL_PATH, "TestCases", 6, 4),
						Reusables.readExcelData(Constants.EXCEL_PATH, "TestCases", 6, 5)),
				"PREMIUM Package verification Failed");
		extentLogger.info("PREMIUM Package verification passed for Type & Price and Currency");
		extentLogger.pass("Passed:verifyKSA");
	}

	@Test(priority = 3)
	public void verifyKuwait() throws IOException {
		logger.info("Test execution started");
		extentLogger = report.createTest("VerifyPackages::verifyKuwait");
		driver.get(baseUrl);
		expectedTitle = Reusables.readExcelData(Constants.EXCEL_PATH, "TestCases", 7, 2);
		Assert.assertTrue(expectedTitle.equals(driver.getTitle()));
		extentLogger.info("Page title verifed");
		// expectedTitle = Reusables.readExcelData(Constants.EXCEL_PATH, "TestCases", 2,
		// 2);
		Reusables.click(driver, homepage.home_countrySelectBtn);
		Reusables.click(driver, homepage.home_CountryKuwaitLink);
		Assert.assertTrue(
				homepage.verifyPackageDetails(extentLogger, 1,
						Reusables.readExcelData(Constants.EXCEL_PATH, "TestCases", 7, 3),
						Reusables.readExcelData(Constants.EXCEL_PATH, "TestCases", 7, 4),
						Reusables.readExcelData(Constants.EXCEL_PATH, "TestCases", 7, 5)),
				"LITE Package verification Failed");
		extentLogger.info("Lite Package verification passed for Type & Price and Currency");
		Assert.assertTrue(
				homepage.verifyPackageDetails(extentLogger, 2,
						Reusables.readExcelData(Constants.EXCEL_PATH, "TestCases", 8, 3),
						Reusables.readExcelData(Constants.EXCEL_PATH, "TestCases", 8, 4),
						Reusables.readExcelData(Constants.EXCEL_PATH, "TestCases", 8, 5)),
				"CLASSIC Package verification Failed");
		extentLogger.info("CLASSIC Package verification passed for Type & Price and Currency");
		Assert.assertTrue(
				homepage.verifyPackageDetails(extentLogger, 3,
						Reusables.readExcelData(Constants.EXCEL_PATH, "TestCases", 9, 3),
						Reusables.readExcelData(Constants.EXCEL_PATH, "TestCases", 9, 4),
						Reusables.readExcelData(Constants.EXCEL_PATH, "TestCases", 9, 5)),
				"PREMIUM Package verification Failed");
		extentLogger.info("PREMIUM Package verification passed for Type & Price and Currency");
		extentLogger.info("PREMIUM Package verification passed for Type & Price and Currency");
		extentLogger.pass("Passed:verifyKuwait");
	}

}
