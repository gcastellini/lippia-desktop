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

    @When("(.*) multiplied (.*)")
    public void mult(String factor1,String factor2){
        CalculatorService.mult(factor1,factor2);
    }
    @When("(.*) divided (.*)")
    public void div(String dividend,String divisor){
        CalculatorService.div(dividend,divisor);
    }
    
    @Then("Result  is (.*)")
    public void result( String res) {
    	CalculatorService.Result(res);
    }


}
