package com.crowdar.examples.services;

import com.crowdar.core.actions.MobileActionManager;
import org.testng.Assert;

import com.crowdar.core.actions.ActionManager;
import com.crowdar.examples.constants.CalculatorConstants;

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
	public static void plus() {
    	ActionManager.click(CalculatorConstants.SEVEN);
    	ActionManager.click(CalculatorConstants.PLUS);
        ActionManager.click(CalculatorConstants.EIGHT);
        ActionManager.click(CalculatorConstants.EQUAL);
    }

    public static String minusResult(String min,String sub){
        Integer res = Integer.parseInt(min) - Integer.parseInt(sub);
        return String.valueOf(res);
    }
    public static void result(String min,String sub)
    {
    	Assert.assertEquals(getResult(),minusResult(min,sub));
    }
    
    public static String getResult() {
		return ActionManager.getText(CalculatorConstants.CALCULATOR_RESULTS).replaceAll("\\D+", "").trim();
    }

}
