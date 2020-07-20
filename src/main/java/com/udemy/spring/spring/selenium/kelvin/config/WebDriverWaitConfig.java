package com.udemy.spring.spring.selenium.kelvin.config;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Scope;

import com.udemy.spring.spring.selenium.kelvin.annotation.LazyConfiguration;

@LazyConfiguration
public class WebDriverWaitConfig {	

	@Value("${default.timeout:30}")
	private int timeout;

	@Bean
	@Scope(ConfigurableBeanFactory.SCOPE_PROTOTYPE)
	public WebDriverWait webdriverWait(WebDriver driver){
		return new WebDriverWait(driver, this.timeout);
	}

}