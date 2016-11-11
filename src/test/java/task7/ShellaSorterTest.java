package task7;

import org.junit.Test;

import java.util.Collection;

import static org.junit.Assert.*;

/**
 * Created by Юлия on 10.11.2016.
 */
public class ShellaSorterTest {

    private ShellaSorter shellaSorter = new ShellaSorter();
    double[] inputValues1 = {7, 4, 9, 3, 6, 5};
    double[] inputValues2 = {79, 7, 6, 5, 4};
    double[] inputValues3 = {};
    double[] expected1 = {3.0,  4.0,  5.0,  6.0,  7.0,  9.0 };
    double[] expected2 = {4.0,  5.0,  6.0,  7.0,  79.0 };
    double[] expected3 = {};

    @Test
    public void test1(){
        assertArrayEquals(expected1, shellaSorter.sort(inputValues1), 0.0001);
    }

    @Test
    public void test2(){
        assertArrayEquals(expected2, shellaSorter.sort(inputValues2), 0.0001);
    }

    @Test
    public void test3(){
        assertArrayEquals(expected3, shellaSorter.sort(inputValues3), 0.0001);
    }

}