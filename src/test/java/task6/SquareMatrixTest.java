package task6;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by Юлия on 10.11.2016.
 */
public class SquareMatrixTest {

    private static SquareMatrix squareMatrix = new SquareMatrix();
    private double[] inputValue1 = {1, 2, 3, 4, 5};
    private double[] inputValue2 = {};
    private double[][] expected1 ={
            {1,  2,  3,  4,  5},
            {2,  3,  4,  5,  1},
            {3,  4,  5,  1,  2},
            {4,  5,  1,  2,  3},
            {5,  1,  2,  3,  4}
    };
    private int[][] expected2 = null;

    @Test
    public void test1(){
        double[][] actual = squareMatrix.create(inputValue1);
        for(int i = 0; i < actual.length; i++){
            for(int j = 0; j < actual[i].length; j++) {
                assertEquals(expected1[i][j], actual[i][j], 0.00001);
            }
        }
    }

    @Test
    public void test2(){
        assertEquals(expected2,squareMatrix.create(inputValue2));
    }


}