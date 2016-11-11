package task3;

/**
 * Created by Юлия on 02.11.2016.
 */
public class Printer {
    public void outputTable(double[][] result){
        if( result != null) {
            System.out.println("   X     Y");
            for (int i = 0; i < result.length; i++) {
                printLine(result[i][0], result[i][1]);
            }
        }
        else {
            System.out.println("Invalid input values");
        }
    }

    private void printLine(double x, double y){
        System.out.println("--------------------------");
        System.out.print(x);
        System.out.print("   ");
        System.out.println(y);
    }
}
