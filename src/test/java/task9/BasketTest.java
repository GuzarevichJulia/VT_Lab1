package task9;

import org.junit.Test;

import java.awt.*;

import static org.junit.Assert.*;

/**
 * Created by Юлия on 10.11.2016.
 */
public class BasketTest {

    Basket basket = new Basket();
    private double expectedWeight = 960;
    private int expectedBlueBallCount = 2;

    Basket basket2 = new Basket();
    private double expectedWeight2 = 520;
    private int expectedBlueBallCount2 = 0;

    @Test
    public void test() {
        basket.add(new Ball(300, Color.RED));
        basket.add(new Ball(500, Color.blue));
        basket.add(new Ball(60, Color.YELLOW));
        basket.add(new Ball(100, Color.BLUE));
        assertEquals(expectedWeight,basket.getWeight(), 0.000001);
        assertEquals(expectedBlueBallCount,basket.getColorBallCount(Color.BLUE));
    }

    @Test
    public void test2() {
        basket2.add(new Ball(320, Color.RED));
        basket2.add(new Ball(200, Color.pink));
        assertEquals(expectedWeight2,basket2.getWeight(), 0.000001);
        assertEquals(expectedBlueBallCount2,basket2.getColorBallCount(Color.BLUE));
    }

}