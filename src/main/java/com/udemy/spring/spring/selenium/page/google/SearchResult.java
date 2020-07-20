package com.udemy.spring.spring.selenium.page.google;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.udemy.spring.spring.selenium.kelvin.annotation.PageFragment;
import com.udemy.spring.spring.selenium.page.Base;

@PageFragment
public class SearchResult extends Base{
	
	@FindBy(css = "div.rc")
    private List<WebElement> results;

    public int getCount(){
        return this.results.size();
    }

    @Override
    public boolean isAt() {
        return this.wait.until((d) -> !this.results.isEmpty());
    }

}
