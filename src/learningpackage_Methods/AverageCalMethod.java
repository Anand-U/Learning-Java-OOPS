package learningpackage_Methods;

import java.util.Scanner;

public class AverageCalMethod {

	public static void main(String[] args) {
		// Accept 4 numbers from user using Scanner class
		
		Scanner inputs=new Scanner(System.in);
		System.out.println("Enter First Number::");
		int Firstnumber =inputs.nextInt();
		System.out.println("Enter Second Number::");
		int Secondnumber =inputs.nextInt();
		System.out.println("Enter third Number::");
		int Thirdnumber =inputs.nextInt();
		System.out.println("Enter Fourth Number::");
		int Fourthnumber =inputs.nextInt();
		AverageCalculation(Firstnumber, Secondnumber, Thirdnumber, Fourthnumber);
		

	}
	
	static float AverageCalculation(int Firstnumber, int Secondnumber,int Thirdnumber, int Fourthnumber)
	{
		float avgresult=(Firstnumber+Secondnumber+Thirdnumber+Fourthnumber)/4;
		System.out.println("Average of 4 number is :: " +avgresult);
		return avgresult;
	}

}
