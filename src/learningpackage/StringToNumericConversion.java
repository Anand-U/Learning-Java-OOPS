package learningpackage;

import java.util.Scanner;

public class StringToNumericConversion {
	
	public static void main(String[] args) 
	{
	
	Scanner strinput=new Scanner(System.in);
	System.out.println("Enter String Value::");
	String strvalue = strinput.nextLine();
	
    //Converting String value accepted from Console to Numeric Values
	
	int intvalue=Integer.parseInt(strvalue);
	float floatvalue=Float.parseFloat(strvalue);
	long longvalue=Long.parseLong(strvalue);
	double doublevalue=Double.parseDouble(strvalue);
	byte bytevalue=Byte.parseByte(strvalue);
	short shortvalue=Short.parseShort(strvalue);
	
	System.out.println("Integer Value::" +intvalue);
	System.out.println("float Value::" +floatvalue);
	System.out.println("Long Value::" +longvalue);
	System.out.println("double Value::" +doublevalue);
	System.out.println("byte Value::" +bytevalue);
	System.out.println("Short Value::" +shortvalue);
	
	
	}

}
