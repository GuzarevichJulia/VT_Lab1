package task6;

/**
 * Created by Юлия on 05.11.2016.
 */
public class SquareMatrix {
    public double[][] create(double[] a){
        int n = a.length;
        if(n > 0) {
            double[][] matrixElement = new double[n][n];
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < n; j++) {
                    if ((i + j) <= n - 1) {
                        matrixElement[i][j] = a[i + j];
                    } else {
                        matrixElement[i][j] = a[(i + j) - n];
                    }
                }
            }
            return matrixElement;
        }
        return null;
    }
}
