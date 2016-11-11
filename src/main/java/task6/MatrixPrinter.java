package task6;

/**
 * Created by Юлия on 05.11.2016.
 */
public class MatrixPrinter {
    public  void display(double[][] matrixElement){
        if(matrixElement != null) {
            for (int i = 0; i < matrixElement[0].length; i++) {
                for (int j = 0; j < matrixElement[0].length; j++) {
                    System.out.print(matrixElement[i][j] + "  ");
                }
                System.out.println();
            }
        }
        return;
    }
}
