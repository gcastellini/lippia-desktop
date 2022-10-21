package com.crowdar.examples.services;

import com.crowdar.core.actions.MobileActionManager;
import org.testng.Assert;

import com.crowdar.core.actions.ActionManager;
import com.crowdar.examples.constants.CalculatorConstants;

public class CalculatorService {

	private CalculatorService() {

    }


    public static void minus(String minuend,String subtrahend) {
        char[] ch = minuend.toCharArray();
        if (Integer.parseInt(minuend) < 0) {
            for (int i=1;i<ch.length;i++) {
                MobileActionManager.click(CalculatorConstants.NUM, String.valueOf(ch[i]));
            }
            MobileActionManager.click(CalculatorConstants.NEGATE);
        }
        else {
            for (char c : ch) {
                MobileActionManager.click(CalculatorConstants.NUM, String.valueOf(c));
            }
        }
            MobileActionManager.click(CalculatorConstants.MINUS);
            char[] ch2 = subtrahend.toCharArray();
        if (Integer.parseInt(subtrahend) < 0 ) {
            for (int i=1;i<ch2.length;i++) {
                MobileActionManager.click(CalculatorConstants.NUM, String.valueOf(ch2[i]));
            }
            MobileActionManager.click(CalculatorConstants.NEGATE);
        } else {
            for (char c : ch2) {
                MobileActionManager.click(CalculatorConstants.NUM, String.valueOf(c));
            }
        }
            MobileActionManager.click(CalculatorConstants.EQUAL);

        }


    public static void mult(String factor1,String factor2){
        char[] ch=factor1.toCharArray();
        if (Integer.parseInt(factor1 )< 0) {
            for (int i=1;i<ch.length;i++) {
                MobileActionManager.click(CalculatorConstants.NUM, String.valueOf(ch[i]));
            }
            MobileActionManager.click(CalculatorConstants.NEGATE);
        }
        else{
            for (char c : ch) {
                MobileActionManager.click(CalculatorConstants.NUM, String.valueOf(c));
            }
        }
        MobileActionManager.click(CalculatorConstants.MUL);
        char[] ch2=factor2.toCharArray();
        if(Integer.parseInt(factor2)<0) {
            for (int i=1;i<ch2.length;i++) {
                MobileActionManager.click(CalculatorConstants.NUM, String.valueOf(ch2[i]));
            }
            MobileActionManager.click(CalculatorConstants.NEGATE);
        }
        else{
            for (char c : ch2) {
                MobileActionManager.click(CalculatorConstants.NUM, String.valueOf(c));
            }
        }
        MobileActionManager.click(CalculatorConstants.EQUAL);

    }

    public static void div(String dvn,String dvd) {
        char[] ch = dvn.toCharArray();
        if (Integer.parseInt(dvn) <0) {
            for (int i=1;i<ch.length;i++) {
                MobileActionManager.click(CalculatorConstants.NUM, String.valueOf(ch[i]));
            }
            MobileActionManager.click(CalculatorConstants.NEGATE);
        }else{
            for (char c : ch) {
                MobileActionManager.click(CalculatorConstants.NUM, String.valueOf(c));
            }
        }
        MobileActionManager.click(CalculatorConstants.DIV);
        if (Integer.parseInt(dvd) == 0) {
            throw new IllegalStateException("You cannot divide by zero");
        }
          else if (Integer.parseInt(dvd)<0)  {
            char[] ch2 = dvd.toCharArray();
              for (int i=1;i<ch2.length;i++) {
                MobileActionManager.click(CalculatorConstants.NUM, String.valueOf(ch2[i]));
            }
            MobileActionManager.click(CalculatorConstants.NEGATE);
          }
          else{
            char[] ch2 = dvd.toCharArray();
            for (char c : ch2) {
                MobileActionManager.click(CalculatorConstants.NUM, String.valueOf(c));
            }
        }
            MobileActionManager.click(CalculatorConstants.EQUAL);
        }


	public static void plus() {
    	ActionManager.click(CalculatorConstants.SEVEN);
    	ActionManager.click(CalculatorConstants.PLUS);
        ActionManager.click(CalculatorConstants.EIGHT);
        ActionManager.click(CalculatorConstants.EQUAL);
    }

    public static void Result(String res) {
        Assert.assertEquals(getResult(), res);
    }

    public static String getResult() {
		return ActionManager.getText(CalculatorConstants.CALCULATOR_RESULTS).replaceAll("[^0-9-]", "").trim();
    }

}
