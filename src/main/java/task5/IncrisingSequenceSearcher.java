package task5;

/**
 * Created by Юлия on 05.11.2016.
 */
public class IncrisingSequenceSearcher {

    public  int findMinNumberElementsToThrow(int[] element){
        if(element.length > 0) {
            int[] lengthSequence = createNewArray(element.length);
            int[] incrisingSequenceLength = getIncrisingSequenceLength(element, lengthSequence);
            int maxIncrisingSequenceLength = getMax(incrisingSequenceLength);
            return element.length - maxIncrisingSequenceLength;
        }
        return 0;
    }

    private int[] createNewArray(int count){
        int[] array = new int[count];
        for(int i = 0; i < count; i++){
            array[i] = 1;
        }
        return array;
    }

    private int[] getIncrisingSequenceLength(int[] element, int[] lengthSequence){
        for(int i = 1; i <element.length; i++){
            for (int j = 0; j < i; j++){
                if ((element[i] > element[j]) && (lengthSequence[i] < lengthSequence[j]+1)){
                    lengthSequence[i] = lengthSequence[j] + 1;
                }
            }
        }
        return lengthSequence;
    }

    private int getMax(int[] incrisingSequenceLength){
        int max = incrisingSequenceLength[0];
        for (int i = 1; i < incrisingSequenceLength.length; i++){
            if (incrisingSequenceLength[i] > max){
                max = incrisingSequenceLength[i];
            }
        }
        return max;
    }

}
