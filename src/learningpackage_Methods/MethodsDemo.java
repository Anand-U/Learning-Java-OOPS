package learningpackage_Methods;

public class MethodsDemo {

	public static void main(String[] args) {
		
		multiplication(20,10);
		Division(100,50);
		

	}
	public static double multiplication(int mul1, int mul2)
	{
		double mulresult=mul1*mul2;
		System.out.println("Multiplication result :: " +mulresult);
		return(mulresult);
		
	}
	public static double Division(int mul1, int mul2)
	{
		double divresult=mul1/mul2;
		System.out.println("Division result :: " +divresult);
		return(divresult);
		
	}
}
