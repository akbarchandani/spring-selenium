package com.udemy.spring.spring.selenium.resource;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.core.io.Resource;
import org.testng.annotations.Test;

import com.udemy.spring.spring.selenium.SpringBaseTestNGTest;

import java.io.IOException;
import java.nio.file.Files;

public class ResourceInitial extends SpringBaseTestNGTest {
	
	@Value("classpath:data/testdata1.csv")
	private Resource resource;
	
	@Test
	public void resourceTest() throws IOException {
		Files.readAllLines(resource.getFile().toPath())
		.forEach(System.out::println);
	}

}
