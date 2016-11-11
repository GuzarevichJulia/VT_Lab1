package task4;

import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.*;

/**
 * Created by Юлия on 08.11.2016.
 */
public class PrimesSearcherTest {

    @Test
    public void find() throws Exception {
        ArrayList<Integer> expected = new ArrayList<Integer>();
        expected.add(3);
        expected.add(43);
        expected.add(97);
        int[] inputData = {8, 3 , 86, 4, 43, 55, 97, 100};
        ArrayList<Integer> actual = (new task4.PrimesSearcher()).find(inputData);
        assertArrayEquals(expected.toArray(), actual.toArray());
    }
}