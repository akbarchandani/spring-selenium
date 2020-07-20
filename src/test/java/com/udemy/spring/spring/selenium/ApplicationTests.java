package com.udemy.spring.spring.selenium;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class ApplicationTests {
	
	@Value("${Pat:www.google.com}")
	private String path;

	@Test
	void contextLoads() {
		System.out.println(this.path);
	}

}
