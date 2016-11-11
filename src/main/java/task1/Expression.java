package task1;

import static java.lang.Math.sin;
import static java.lang.Math.abs;
import static java.lang.Math.pow;

public class Expression {
    public double compute(double x, double y){
        return  getNumber(x,y)/ getDenominator(x,y)+x;
    }

    private  double getNumber(double x, double y){
        return 1+pow(sin(x+y),2);
    }

    private  double getDenominator(double x, double y){
        return 2+abs(x-2*x/(1+pow(x*y,2)));
    }

}

