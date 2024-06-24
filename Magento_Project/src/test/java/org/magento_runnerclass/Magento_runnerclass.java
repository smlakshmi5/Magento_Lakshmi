package org.magento_runnerclass;

import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features="src\\test\\java\\magento_feature\\Magento.feature", glue="org.magento_stepdef")

public class Magento_runnerclass {
	public static WebDriver driver;
	
	@BeforeClass
	public static void Start() {
		driver = new ChromeDriver();

	}
	

}
