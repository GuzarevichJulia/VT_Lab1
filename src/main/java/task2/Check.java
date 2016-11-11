package task2;

/**
 * Created by Юлия on 02.11.2016.
 */
public class Check {
    public boolean getResult(Point point){
        if ((point.getX() >= -4) && (point.getX() <=4)){
            if((point.getY()>=-3) && (point.getY()<=5)){
                return true;
            }
        }
        else if ((point.getX() >= -6) && (point.getX()<=6)){
            if ((point.getY()>=-3) && (point.getY()<=0))
                return true;
        }
        return  false;
    }
}
