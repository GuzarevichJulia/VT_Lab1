package task4;

import static java.lang.Math.sqrt;
import java.util.ArrayList;

/**
 * Created by Юлия on 04.11.2016.
 */
public class PrimesSearcher {
    public ArrayList<Integer> find(int[] numbers){
        ArrayList<Integer> result = new ArrayList<Integer>();
        for(int i = 0; i < numbers.length; i++){
            if(isPrime(numbers[i])){
                result.add(numbers[i]);
            }
        }
        return result;
    }

    private boolean isPrime(int number){
        if((number <= 0) || (number == 1)){
            return false;
        }
        for(int i = 2; i <= sqrt(number); i++){
            if((number%i) == 0){
                return false;
            }
        }
        return true;
    }
}
