import java.io.*;
import java.util.*;
public class montecarlo
    {
    //"throwing" a dart
    public static boolean [] dartThrow(int r, int d){
        boolean [] booleanArray = new boolean[d];
        for(int i = 0; i < d; i++){
        double xCoord = Math.random() * 2;
        double yCoord = Math.random() * 2;
        if((Math.pow(xCoord,2) + Math.pow(yCoord,2)) <= r){
            booleanArray[i] = true;
        }
        else{
            booleanArray [i] = false;
        }
       }
       return booleanArray;
    }

    //calculating pi from throwing results
    public static double piEstimater(boolean [] h, int d){
        int trueCounter = 0;
        for(int i = 0; i < h.length; i++){
            if(h[i] == true){
                trueCounter++;
            }
        }
        return 4 * ((double)trueCounter / d);
    }
    public static void printer(double [] a){
        System.out.println("     Pi Estimation Tool    ");
        System.out.println("---------------------------");
        for(int i = 0; i < a.length; i++){
            System.out.print("Trial [" + i + "]: pi = ");
            System.out.printf("%6f\n", a[i]);
        }
    }

    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int radius = 1;
        int darts;
        int trials;

        System.out.println("Enter the number of darts to calculate for: ");
        darts = in.nextInt();
        System.out.println("Enter the number of trials to calculate for: ");
        trials = in.nextInt();

        double [] arrayOfEstimates = new double [trials];
        int i = 0;
        for(double a : arrayOfEstimates){
           boolean [] hitCounter = dartThrow(radius, darts);
           double piEstimate = piEstimater(hitCounter, darts);
           arrayOfEstimates[i] = piEstimate;
           i++;
        }

        printer(arrayOfEstimates);
    }

}
