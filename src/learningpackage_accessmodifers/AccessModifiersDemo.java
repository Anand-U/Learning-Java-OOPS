package learningpackage_accessmodifers;

public class AccessModifiersDemo {

	public static void main(String[] args) {
		// Implementing to access Public,Private,default and protected Data members and Data Functions
		
		//Data function
		accessallmodifiers AM=new accessallmodifiers();
		
		//Accessing public data members
		System.out.println("BankName is :: "+AM.Bankname);
		System.out.println("BankAsset is :: "+AM.Bankasset);
		
		//Accessing private data members
		
		System.out.println("Account Number is :: "+AM.getaccountnumber());
		System.out.println("Account PIN is :: "+AM.getaccountPin());
		
		//Accessing protected members
		System.out.println("Bank Vision is :: "+AM.Bankvision);

		//Accessing defaulted members
				System.out.println("customer Count is :: "+AM.Customercount);
				System.out.println("customer Number is :: "+AM.Customernumbers);
				
	}
	
}
	
	class  accessallmodifiers{
		
		//data Members
		private int Accountnumber=404667;
		private int Accountpin=1989;
		public String Bankname="HDFC Bank";
		public String Bankasset="Gold";
		protected String Bankvision="To be number one bank in the world ";
		float Customercount=1000;
		float Customernumbers=200;
		
		
		public int getaccountnumber( )
		{
			
			return Accountnumber;
			
		}
		public int getaccountPin( )
		{
			
			return Accountpin;
			
		}
		
	}


