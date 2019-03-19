
import java.io.*;
import java.util.*;

public class HOWFARTOLINE
{
    public static void main(String args[])
    {
        Scanner kbReader = new Scanner(System.in);
        
        System.out.println("Enter an A Value");
        DistToLine.A = kbReader.nextDouble();
        
        System.out.println("Enter a B Value");
        DistToLine.B = kbReader.nextDouble();
        
        System.out.println("Enter a C Value");
        DistToLine.C = kbReader.nextDouble();
        
        System.out.println("Enter an X Value");
        double x = kbReader.nextDouble();
        
        System.out.println("Enter a Y Value");
        double y = kbReader.nextDouble();
        
        double j = DistToLine.getDist(x,y);
        
        System.out.println("The Distance to The Line is " + j);
    }
}
