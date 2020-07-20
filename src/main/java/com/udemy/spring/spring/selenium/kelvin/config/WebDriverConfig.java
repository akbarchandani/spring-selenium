package com.udemy.spring.spring.selenium.kelvin.config;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingBean;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.context.annotation.Profile;


import com.udemy.spring.spring.selenium.kelvin.annotation.LazyConfiguration;
import com.udemy.spring.spring.selenium.kelvin.annotation.ThreadScopeBean;

import io.github.bonigarcia.wdm.WebDriverManager;

@LazyConfiguration
@Profile("!remote")
public class WebDriverConfig {

	@ThreadScopeBean
	@ConditionalOnProperty(name = "browser", havingValue = "firefox")
	public WebDriver firefoxDriver(){
		WebDriverManager.firefoxdriver().setup();
		return new FirefoxDriver();
	}
	
	@ThreadScopeBean
	@ConditionalOnMissingBean
	public WebDriver chromeDriver(){
		WebDriverManager.chromedriver().version("83.0.4103.39").setup();
		return new ChromeDriver();
	}

}
