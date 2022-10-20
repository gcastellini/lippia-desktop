package com.crowdar.examples.steps;

import com.crowdar.core.PageSteps;
import com.crowdar.examples.services.CalculatorService;

import io.cucumber.java.ca.Cal;
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

    @When("(.*) divided (.*)")
    public void div(String dvn,String div){
        CalculatorService.div(dvn,div);
    }
    
    @Then("Result for (.*) minus (.*) is (.*)")
    public void resultMin(String min, String sub, String res) {
    	CalculatorService.minusResult(min,sub);
    }

    @Then("Result for (.*) divided (.*) is (.*)")
    public void resultDiv(String dvn, String div, String res) {
        CalculatorService.divResult(dvn,div);
    }

}