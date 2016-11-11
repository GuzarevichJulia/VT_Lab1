package task3;

import java.util.ArrayList;
import java.util.Arrays;

import static java.lang.Math.tan;

/**
 * Created by Юлия on 02.11.2016.
 */
public class Function {
    private double a;
    private double b;
    private double h;

    public  double getA(){
        return a;
    }
    public  double getB(){
        return b;
    }
    public  double getH(){
        return h;
    }

    public  double getY(double x){

        return tan(x);
    }

    public double[][] getValuesOnInterval(double a, double b, double h)
    {
        if (correctValues(a, b, h)){
            ArrayList<Double> xValues = new ArrayList<Double>();
            ArrayList<Double> yValues = new ArrayList<Double>();
            while (a < b) {
                xValues.add(a);
                yValues.add(getY(a));
                a = a + h;
            }
            xValues.add(b);
            yValues.add(getY(b));
            double[][] result = makeResult(xValues, yValues);
            return result;
        }
        return null;
    }

    private double[][] makeResult(ArrayList<Double> xValues, ArrayList<Double> yValues){
        double[][] result = new double[xValues.size()][2];
        for(int i = 0; i < result.length; i++){
            result[i][0] = xValues.get(i);
            result[i][1] = yValues.get(i);
        }
        return result;
    }

    private  boolean correctValues(double a, double b, double h){
        if (a <= b){
            if (h > 0){
                return true;
            }
        }
        return false;
    }


}

