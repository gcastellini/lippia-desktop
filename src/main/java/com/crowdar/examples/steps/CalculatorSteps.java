package com.crowdar.examples.steps;

import com.crowdar.core.PageSteps;
import com.crowdar.examples.services.CalculatorService;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class CalculatorSteps extends PageSteps {

    @When("Seven Plus Eight")
    public void plus() {
    	CalculatorService.plus();
    }

    @When("(.*) Minus (.*)")
    public void minus(String minuend,String subtrahend)
    {
        CalculatorService.minus(minuend,subtrahend);
    }

    
    @Then("Result for (.*) minus (.*) is (.*)")
    public void result(String min, String sub, String res) {
    	CalculatorService.result(min,sub);
    }

}