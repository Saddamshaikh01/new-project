package Interfacepkg;

public interface ATM extends SBI,Bank_name{
	void Deposite();
	void Withdrwal();
	void ATM_Number();
	
	public static void main(String[] args) {
		 System.out.println("Thank you for banking with Axis bank");
		 ATM obj=new customer();
		 obj.Axis_bank();
		 obj.AccountBalance();
		 obj.ATM_Number();
		 obj.Deposite();
		 obj.HDFC();
		 obj.Kotack_Bank();
		 obj.Withdrwal();
		 obj.Transaction();
	}

}

