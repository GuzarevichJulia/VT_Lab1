package task9;

import java.util.ArrayList;
import java.awt.*;
/**
 * Created by Юлия on 06.11.2016.
 */
public class Basket {

    private double weight;
    private ArrayList<Ball> balls = new ArrayList<Ball>();

    public void add(Ball ball){
        if (ball != null){
            balls.add(ball);
            weight = weight + ball.getWeight();
        }
    }

    public double getWeight(){
        return weight;
    }

    public int getColorBallCount(Color color){
        int count = 0;
        for(Ball ball : balls){
            if (ball.getColor() == color){
                count++;
            }
        }
        return count;
    }
}
