package com.crowdar.examples.services;

import com.crowdar.core.actions.MobileActionManager;
import org.testng.Assert;

import com.crowdar.core.actions.ActionManager;
import com.crowdar.examples.constants.CalculatorConstants;
import org.testng.asserts.Assertion;

public class CalculatorService {

	private CalculatorService() {}


    public static void minus(String minuend,String subtrahend){
       char[] ch=minuend.toCharArray();
       for (int i =0; i<ch.length;i++){
           MobileActionManager.click(CalculatorConstants.NUM,String.valueOf(ch[i]));
       }
       MobileActionManager.click(CalculatorConstants.MINUS);
       char[] ch2=subtrahend.toCharArray();
        for (int i =0; i<ch2.length;i++){
            MobileActionManager.click(CalculatorConstants.NUM,String.valueOf(ch2[i]));
        }
        MobileActionManager.click(CalculatorConstants.EQUAL);


    }

    public static void div(String dvn,String dvd){
        char[] ch=dvn.toCharArray();
        for (int i =0; i<ch.length;i++){
            MobileActionManager.click(CalculatorConstants.NUM,String.valueOf(ch[i]));
        }
        MobileActionManager.click(CalculatorConstants.DIV);
        if (Integer.parseInt(dvd) == 0){
          throw  new IllegalStateException("You cannot divide by zero");
        }
        else {
            char[] ch2 = dvd.toCharArray();
            for (int i = 0; i < ch2.length; i++) {
                MobileActionManager.click(CalculatorConstants.NUM, String.valueOf(ch2[i]));
            }
            MobileActionManager.click(CalculatorConstants.EQUAL);
        }

    }
	public static void plus() {
    	ActionManager.click(CalculatorConstants.SEVEN);
    	ActionManager.click(CalculatorConstants.PLUS);
        ActionManager.click(CalculatorConstants.EIGHT);
        ActionManager.click(CalculatorConstants.EQUAL);
    }

    public static void minusResult(String min,String sub) {
        Integer res = Integer.parseInt(min) - Integer.parseInt(sub);
        Assert.assertEquals(getResult(), String.valueOf(res));
    }

    public static void divResult(String dvn,String div)
    {Integer res = Integer.parseInt(dvn) - Integer.parseInt(div);
    	Assert.assertEquals(getResult(),String.valueOf(res));
    }
    
    public static String getResult() {
		return ActionManager.getText(CalculatorConstants.CALCULATOR_RESULTS).replaceAll("\\D+", "").trim();
    }

}
