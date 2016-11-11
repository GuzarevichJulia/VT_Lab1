package task2;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;

import static org.junit.Assert.*;

/**
 * Created by Юлия on 08.11.2016.
 */
@RunWith(Parameterized.class)
public class CheckTest {

    private int x;
    private int y;
    private boolean expected;
    private static Check check = new Check();

    public CheckTest(int x, int y, boolean expected){
        this.x = x;
        this.y = y;
        this.expected = expected;
    }

    @Parameterized.Parameters
    public static Collection<Object[]> testInputData(){
        Object[][] inputData = {
                {0,0, true},
                {3, -2, true},
                {-5, -1, true},
                {-4, 5, true},
                {-4, -4, false},
                {6, 2, false},
                {-1, 7, false}
        };

        return Arrays.asList(inputData);
    }

    @Test
    public void test(){
        assertEquals(expected,check.getResult(new Point(x, y)));
    }

}