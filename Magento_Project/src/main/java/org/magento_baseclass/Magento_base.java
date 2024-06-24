package org.magento_baseclass;

import java.awt.AWTException;

import java.awt.Robot;
import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Magento_base {
	private static Magento_base magento_base;
public static WebDriver driver;
public static WebDriverWait wait;
	
	public static void url(WebDriver driver,String s) {
		driver.get(s);

	}
	public static void maximize(WebDriver driver) {
		driver.manage().window().maximize();

	}
	public static void toClick(WebElement e) {
		e.click();

	}
	public static void toSendValues(WebElement w,String str) {
		w.sendKeys(str);

	}
	public static void actionClass(WebDriver driver,WebElement ac ) {
		Actions a = new Actions(driver);
		driver.findElement((By) ac);
		a.moveToElement(ac).perform();

	}
	public static void toAlert(WebDriver driver) {
		driver.switchTo().alert();
	}
	public static void doubleClick(WebDriver driver, WebElement dc) {
		Actions b = new Actions(driver);
		driver.findElement((By) dc);
		b.doubleClick(dc).perform();

	}
	public static void contextClick(WebDriver driver, WebElement cc) {
		Actions c = new Actions(driver);
		driver.findElement((By) cc);
		c.contextClick(cc).perform();
	}
	public static void takingScreenshot(WebDriver driver, String sc) throws IOException {
		TakesScreenshot t =(TakesScreenshot)driver;
		File source=t.getScreenshotAs(OutputType.FILE);
		File dest=new File(sc);
		FileUtils.copyFile(source, dest);

	}
	public static void toScroll(WebDriver driver, WebElement we) {
		WebElement scroll = driver.findElement((By) we);
		JavascriptExecutor j = (JavascriptExecutor)driver;
		j.executeScript("arguments[0].scrollIntoView", scroll);

	}
	public static void robotClass(int ro) throws AWTException {
		Robot r = new Robot();
		r.keyPress(ro);
		r.keyRelease(ro);
	}
	public static void toSelect(WebDriver driver,WebElement se,int s) {
		Select drop=new Select(se);
		drop.selectByIndex(s);

	}
	public static void toSelect(WebElement we, String s) {
		Select locate = new Select(we);
		locate.selectByVisibleText(s);

	}
			
	public static void waitUntilElementVisible(WebElement element) {
       wait.until(ExpectedConditions.visibilityOf(element));
	
	}
	public static void waitUntilclickable(WebElement element) {
		wait.until(ExpectedConditions.elementToBeClickable(element));
	
}
}
