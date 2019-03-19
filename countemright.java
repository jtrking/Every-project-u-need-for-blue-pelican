import lang.stride.*;
import java.io.*;
import java.util.*;
public class countemright{
    public static void main(String[] args){
          String a = "", 
          sp[]; 
          Scanner userInput = new Scanner(System.in);    
          while (!a.equals("EXIT")) {
          System.out.println("Type in Sentence and press Enter");
          a = userInput.nextLine();
          a = a.toUpperCase();
           if (!a.equals("EXIT")) {
               a = "" + a + "";
               sp = a.split("S\\s*A");
               int c= sp.length - 1;
               System.out.println("There are " + c + " occurrences.");
          }
          }
     }
}




     



    
