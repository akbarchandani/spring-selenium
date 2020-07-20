package com.udemy.spring.spring.selenium.kelvin.config;

import org.springframework.context.annotation.Bean;

import com.github.javafaker.Faker;
import com.udemy.spring.spring.selenium.kelvin.annotation.LazyConfiguration;

@LazyConfiguration
public class FakerConfig {
	
	@Bean
    public Faker getFaker(){
        return new Faker();
    }

}
