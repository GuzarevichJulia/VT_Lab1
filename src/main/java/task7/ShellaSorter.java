package task7;

/**
 * Created by Юлия on 05.11.2016.
 */
public class ShellaSorter {
    public double[] sort(double[] a){
        int i = 0;
        while(i  < a.length - 1){
            if(a[i] > a[i+1]){
                swap(a, i);
                if(i > 0){
                    i--;
                }
            } else {
                i++;
            }
        }
        return a;
    }

    private void swap(double[] a, int i){
        double temp = a[i];
        a[i] = a[i+1];
        a[i+1] = temp;
    }
}
