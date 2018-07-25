package first.calc.easy.easycalc;

import org.mariuszgromada.math.mxparser.Expression;

import java.util.ArrayList;

/**
 * Created by Mujahid on 7/19/2018.
 */

public class MathParser {



    public static double ParseExp(String s){
        Expression ec = new Expression(s);
        return ec.calculate();
    }



    public static String placeHolder(String s){
        if(s.contains("×")){
           return s.replace("×","*");
        }
        return s;
    }



}
