package com.java.ejb;

import javax.ejb.LocalBean;
import javax.ejb.Stateless;

/**
 * Session Bean implementation class NewCalc
 */
@Stateless
@Remote(CalculationRemote.class)
public class NewCalc implements NewCalcRemote {

    /**
     * Default constructor. 
     */
    public NewCalc() {
        // TODO Auto-generated constructor stub
    }

}
