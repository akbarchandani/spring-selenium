package com.udemy.spring.spring.selenium.bdd;

import com.udemy.spring.spring.selenium.kelvin.annotation.LazyAutowired;
import com.udemy.spring.spring.selenium.kelvin.service.ScreenshotService;
import io.cucumber.java.After;
import io.cucumber.java.AfterStep;
import io.cucumber.java.Scenario;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.springframework.context.ApplicationContext;

public class CucumberHooks {

	@LazyAutowired
	private ScreenshotService screenshotService;

	@LazyAutowired
	private ApplicationContext applicationContext;

	@AfterStep
	public void afterStep(Scenario scenario) {
		if (scenario.isFailed()) {
			scenario.embed(this.screenshotService.getScreenshot(), "image/png", scenario.getName());
		}
	}

	@After
	public void afterScenario() {
		this.applicationContext.getBean(WebDriver.class).quit();		
	}	

}
