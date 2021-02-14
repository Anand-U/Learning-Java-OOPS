package learningpackage;

public class CastingDemo {

	public static void main(String[] args) {
		// TODO Implicit Type Casting  from Int to Int,double,Long
		
		int IntegerValue =80;
		float FloatValue= IntegerValue;
		double DoubleValue= IntegerValue;
		long LongValue= IntegerValue;
		System.out.println(+IntegerValue);	
		System.out.println(+FloatValue);
		System.out.println(+DoubleValue);
		System.out.println(+LongValue);
		
		// TODO Implicit Type Casting  from Int to Float,double,Long
		
		byte byteValue = 10;
		float FloatValue1=byteValue;
		double DoubleValue1= byteValue;
		long LongValue1= byteValue;
		System.out.println(+byteValue);	
		System.out.println(+FloatValue1);
		System.out.println(+DoubleValue1);
		System.out.println(+LongValue1);
		
		// TODO Implicit Type Casting  from Short to Float,double,Long
		
				short shortValue = 40;
				float FloatValue2=shortValue;
				double DoubleValue2= shortValue;
				long LongValue2= shortValue;
				System.out.println(+shortValue);	
				System.out.println(+FloatValue2);
				System.out.println(+DoubleValue2);
				System.out.println(+LongValue2);
	}
	

}
