package com.udemy.spring.spring.selenium.googletest;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.udemy.spring.spring.selenium.SpringBaseTestNGTest;
import com.udemy.spring.spring.selenium.kelvin.annotation.LazyAutowired;
import com.udemy.spring.spring.selenium.kelvin.service.ScreenshotService;
import com.udemy.spring.spring.selenium.page.google.GooglePage;

public class Google1Test extends SpringBaseTestNGTest {
	
	@LazyAutowired
    private GooglePage googlePage;

	@LazyAutowired
    private ScreenshotService screenShotUtil;

    @Test
    public void googleTest() throws IOException {
        this.googlePage.goTo();
        Assert.assertTrue(this.googlePage.isAt());
        this.googlePage.getSearchComponent().search("spring boot");
        Assert.assertTrue(this.googlePage.getSearchResult().isAt());
        Assert.assertTrue(this.googlePage.getSearchResult().getCount() > 2);
        this.screenShotUtil.takeScreenShot();
        this.googlePage.close();
    }

}
