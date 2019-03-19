
public class basicallyspeaking { 
public static void main(String[] args) { 
// print table header 
System.out.println( "Decimal\tBinary\tOctal\tHex\tASCII"); 
for (int j=65; j<=90; j++) { 
System.out.print(j+"\t"); 
System.out.print( decimalInt2Binary(j)+"\t"); 
System.out.print( decimalInt2Octal(j)+"\t"); 
System.out.print( decimalInt2Hex(j)+"\t"); 
System.out.println( decimal2Ascii(j)); 
} // end for 
} // end main() 
public static String decimalInt2Binary(int num) { 
return Integer.toBinaryString( num); 
} // end decimalInt2Binary() 
public static String decimalInt2Octal(int num) { 
return Integer.toOctalString( num); 
} // end decimalInt2Octal()
public static String decimalInt2Hex(int num) { 
return Integer.toHexString( num); 
} // end decimalInt2Hex() 
public static char decimal2Ascii(int num) { 
return (char) num; 
} // end decimal2Ascii() 
} // end class Tester
