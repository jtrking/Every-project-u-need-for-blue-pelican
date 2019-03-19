

import lang.stride.*;
import java.io.*;
import java.util.*;
public class Calculator
{
    public static void Calculator()
    {System.out.println("Make your arithmetic selection from the choices below:\n”");
System.out.println(" A. Addition");
System.out.println(" S. Subtraction");
System.out.println(" M. Multiplication");
System.out.println(" D. Division\n");
System.out.print(" Your choice? ");
Scanner kbReader = new Scanner(System.in);
String choice = kbReader.nextLine( );
char ch = choice.charAt(0); 
System.out.print("\nEnter first operand. " );
double op1 = kbReader.nextDouble( );
System.out.print("\nEnter second operand ." );
double op2 = kbReader.nextDouble( );
System.out.println(" ");
switch (ch)
{
case 'A': //addition
case 'a': //Notice we are providing for both capital A and little a.
System.out.println(op1 + " plus " + op2 + " = " + (op1 + op2) );
break;
case 'S': //subtraction
case 's':
System.out.println(op1 + " minus " + op2 + " = " + (op1 - op2) );
break;
case 'M': //multiplication
case 'm':
System.out.println(op1 + " times " + op2 + " = " + (op1 * op2) );
break;
case 'D': //division
case 'd':
System.out.println(op1 + "divided by " + op2 + " = " + (op1 / op2) );
break;
default:
System.out.println("Hey dummy, enter only a A, S, M, or D!");
}
}
}


