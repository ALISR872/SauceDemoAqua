package com.eurotech.saucedemoaqua.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SliderPage extends BasePage{


    @FindBy(xpath = "//input[@type='range']")
    public WebElement inputRangeSlider;
   

    
    
}
