package task8;

import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.*;

/**
 * Created by Юлия on 10.11.2016.
 */
public class Combiner1Test {

    private Combiner1 combiner1 = new Combiner1();
    double[] a1 = {3,5,7,9};
    double[] b1 = {2,6,10};
    int[] expected1 = {1, 4, 7};
    double[] a2 = {};
    double[] b2 = {2,6,10};
    int[] expected2 = null;
    double[] a3 = {1,1,1,1};
    double[] b3 = {2,2,2,2};
    int[] expected3 = {5, 6, 7, 8};

    @Test
    public void test1(){
        assertArrayEquals(expected1, combiner1.findPositionToInsert(a1, b1));
    }

    @Test
    public void test2(){
        assertArrayEquals(expected2, combiner1.findPositionToInsert(a2, b2));
    }

    @Test
    public void test3(){
        assertArrayEquals(expected3, combiner1.findPositionToInsert(a3, b3));
    }

}