import java.io.*;
import java.util.*;
public class comp
{
public static void main(String args[])
{
int j= 8 + 33 + 1345 +137 ;
Scanner kb = new Scanner(System.in);
System.out.print("Enter something like 8 + 33 + 1,345 +137 : ");
String s = kb.nextLine( );
Scanner sc = new Scanner(s);
sc.useDelimiter("\\s*\\+\\s*");
int sum = 0;
while(sc.hasNextInt( ))
{
sum = sum + sc.nextInt( );
}
System.out.println("Sum is: " + sum);
}
}