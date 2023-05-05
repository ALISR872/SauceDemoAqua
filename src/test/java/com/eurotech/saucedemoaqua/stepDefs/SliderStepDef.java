package com.eurotech.saucedemoaqua.stepDefs;

import com.eurotech.saucedemoaqua.pages.SliderPage;
import com.eurotech.saucedemoaqua.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.Keys;

public class SliderStepDef {


    SliderPage sliderPage = new SliderPage();
    @Given("the user is on the slider page")
    public void theUserIsOnTheSliderPage() {
        Driver.get().get("https://demoqa.com/slider/");
        Assert.assertTrue(sliderPage.inputRangeSlider.isDisplayed());


    }

    @When("the user moves the slider to {int}")
    public void theUserMovesTheSliderTo(int targetSliderRange) {

        int initialSliderRange = Integer.parseInt(sliderPage.inputRangeSlider.getAttribute("value"));
        int numberOfTimesSliderToMove = targetSliderRange-initialSliderRange;

        for (int i = 0; i < numberOfTimesSliderToMove; i++) {
            sliderPage.inputRangeSlider.sendKeys(Keys.ARROW_RIGHT);
        }
    }

    @Then("the slider should be ranged at {int}")
    public void theSliderShouldBeRangedAt(int expectedSliderRange) {

        int actualSliderRange = Integer.parseInt(sliderPage.inputRangeSlider.getAttribute("value"));
        Assert.assertEquals(expectedSliderRange,actualSliderRange);

    }
}
