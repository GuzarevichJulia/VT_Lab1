package task8;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by Юлия on 10.11.2016.
 */
public class Combiner2Test {

    private Combiner2 combiner2 = new Combiner2();
    double[] a1 = {3,5,7,9};
    double[] b1 = {2,6,10};
    int[] expected1 = {0, 2, 4};
    double[] a2 = {};
    double[] b2 = {2,6,10};
    int[] expected2 = {0, 0, 0};
    double[] a3 = {1,1,1,1};
    double[] b3 = {2,2,2,2};
    int[] expected3 = {4, 4, 4, 4};

    @Test
    public void test1(){
        assertArrayEquals(expected1, combiner2.findPositionToInsert(a1, b1));
    }

    @Test
    public void test2(){
        assertArrayEquals(expected2, combiner2.findPositionToInsert(a2, b2));
    }

    @Test
    public void test3(){
        assertArrayEquals(expected3, combiner2.findPositionToInsert(a3, b3));
    }

}