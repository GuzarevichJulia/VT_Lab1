package task1;

import static org.junit.Assert.*;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.Assert;

import java.util.Arrays;
import java.util.Collection;

/**
 * Created by Юлия on 08.11.2016.
 */

@RunWith(Parameterized.class)
public class ExpressionTest {

    private double x;
    private double y;
    private double expected;
    private static Expression expression = new Expression();

    public ExpressionTest(double x, double y, double result){
        this.x = x;
        this.y = y;
        this.expected = result;
    }

    @Parameterized.Parameters
    public static Collection<Double[]> testInputData(){
        Double[][] inputData= {
                {-1.5, -0.8, -0.814652},
                {0.0, 0.0, 0.5},
                {1.0 ,2.0, 1.392274},
                {-3.0, 2.0, -2.646934},
        };

        return Arrays.asList(inputData);
    }

    @Test
    public void test() throws Exception {
        Assert.assertEquals(expected, expression.compute(x,y), 0.000001);
    }

}