package task9;

import java.awt.*;

/**
 * Created by Юлия on 06.11.2016.
 */
public class Ball {

    private double weight;
    private Color color;

    public Ball(double weight, Color color){
        this.weight = weight;
        this.color = color;
    }

    public void setWeight(double weight)
    {
        this.weight = weight;
    }

    public void setColor(Color color)
    {
        this.color = color;
    }

    public double getWeight(){
        return weight;
    }

    public Color getColor(){
        return color;
    }
}
