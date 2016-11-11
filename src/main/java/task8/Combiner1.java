package task8;

import java.util.ArrayList;
/**
 * Created by Юлия on 05.11.2016.
 */
public class Combiner1 {

    public int[] findPositionToInsert(double[] a, double[] b){
        if((a.length>0) && (b.length>0)) {
            double[] resultArray = initialResultArrays(a, b.length);
            ArrayList<Integer> position = getPositionToInsert(resultArray, b, a.length);
            int[] positionResult = new int[position.size()];
            for(int i = 0; i < position.size(); i++){
                positionResult[i] = position.get(i);
            }
            return positionResult;
        }
        return null;
    }

    private double[] initialResultArrays(double[] a, int lengthAnotherArray){
        double[] resultArray = new double[a.length + lengthAnotherArray];
        for(int i = 0; i < a.length; i++){
            resultArray[i] = a[i];
        }
        return  resultArray;
    }

    private ArrayList<Integer> getPositionToInsert(double[] resultArray, double[] b, int lengthA){
        int j = 0;
        ArrayList<Integer> position = new ArrayList<Integer>();
        for (int i = 0; i < b.length; i++){
            boolean flag = true;
            while(flag){
                if(b[i] <= resultArray[0]){
                    position.add(j+1);
                    moveArray(resultArray, j, b[i]);
                    flag = false;
                } else {
                    if ((resultArray[j] <= b[i]) && (b[i] < resultArray[j + 1])) {
                        position.add(j + 2);
                        moveArray(resultArray, j + 1, b[i]);
                        flag = false;
                    } else{
                        if((b[i] >= resultArray[j]) && (resultArray[j+1] == 0)){
                            position.add(j+2);
                            moveArray(resultArray, j + 1, b[i]);
                            flag = false;
                        }
                    }
                }
                j++;
            }
        }
        return  position;
    }

    private void moveArray(double[] array, int i, double insertElement){
        int j;
        for( j = array.length - 1; j > i; j--){
            array[j] = array[j-1];
        }
        array[j] = insertElement;
    }
}
