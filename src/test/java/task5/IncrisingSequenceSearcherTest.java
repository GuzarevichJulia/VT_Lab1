package task5;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by Юлия on 10.11.2016.
 */
public class IncrisingSequenceSearcherTest {

    private int[] sequence1 = {1,2,3,4,5,68,7};
    private int expected1 = 1;
    private int[] sequence2 = {9,8,7,6,5,2,3};
    private int expected2 = 5;
    private int[] sequence3 = {2,3,7,1,6,4,5,9,0};
    private int expected3 = 4;
    private int[] sequence4 = {};
    private int expected4 = 0;
    private static IncrisingSequenceSearcher incrisingSequenceSearcher = new IncrisingSequenceSearcher();


    @Test
    public void test1(){
        assertEquals(expected1, incrisingSequenceSearcher.findMinNumberElementsToThrow(sequence1));
    }

    @Test
    public void test2(){
        assertEquals(expected2, incrisingSequenceSearcher.findMinNumberElementsToThrow(sequence2));
    }

    @Test
    public void test3(){
        assertEquals(expected3, incrisingSequenceSearcher.findMinNumberElementsToThrow(sequence3));
    }

    @Test
    public void test4(){
        assertEquals(expected4, incrisingSequenceSearcher.findMinNumberElementsToThrow(sequence4));
    }

}