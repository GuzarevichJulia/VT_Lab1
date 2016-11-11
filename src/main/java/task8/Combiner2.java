package task8;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * Created by Юлия on 05.11.2016.
 */
public class Combiner2 {
    public int[] findPositionToInsert(double[] a, double[] b){
        ArrayList<Integer> position = new ArrayList<Integer>();
        int index;
        for(int i = 0; i < b.length; i++){
            index = Arrays.binarySearch(a, b[i]);
            if(index >= 0 ){
                position.add(index + 1);
            }else {
                position.add(-(index)-1);
            }
        }
        int[] positionResult = new int[position.size()];
        for(int i = 0; i < position.size(); i++){
            positionResult[i] = position.get(i);
        }
        return positionResult;
    }
}
