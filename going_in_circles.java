import lang.stride.*;
import java.io.*;
import java.util.*;
public class going_in_circles
{
   
   public static void main(String args[])
    {
    double a = Math.PI;
    Scanner kbReader =  new Scanner(System.in);
    System.out.print("Radius of your circle is ");
    double i = kbReader.nextInt();
    System.out.println(Math.sqrt(i/a));
       
    }
}
