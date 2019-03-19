import lang.stride.*;
import java.io.*;
import java.util.*;
public class evenorodd
{
   
   public static void main(String args[])
    {
    System.out.print("Enter an integer: ");
    Scanner kbReader =  new Scanner(System.in);
    int x= kbReader.nextInt();
    if(x%2==0)
    System.out.println("The integer "+x+ " is even.");
    else
    System.out.println("The integer " +x+ " is odd");
    }
}

