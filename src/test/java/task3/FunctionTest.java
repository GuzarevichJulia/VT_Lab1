package task3;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;

import static org.junit.Assert.*;

/**
 * Created by Юлия on 08.11.2016.
 */
//@RunWith(Parameterized.class)
public class FunctionTest {

    private static Function function = new Function();

    private static double[][] expectedResult1 = {
            {-20.0, -2.23716},
            {-13.0, -0.46302},
            {-6.0, 0.29100},
            {1.0, 1.55740},
            {8.0, -6.79971},
            {15.0, -0.85599},
            {20.0, 2.23716}
    };

    private static double[][] expectedResult2 = null;

    @Test
    public void test() throws Exception{
        for(int i = 0; i < expectedResult1.length; i++){
            assertArrayEquals(function.getValuesOnInterval(-20,20,7)[i], expectedResult1[i], 0.00001);
        }
        assertEquals(function.getValuesOnInterval(-20,-40,7), expectedResult2);
    }
}