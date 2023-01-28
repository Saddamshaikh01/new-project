package Interfacepkg;

public class customer implements ATM {

	public static void main(String[] args) {
		

	}

	@Override
	public void AccountBalance() {
		System.out.println("Your Bank balance is: Rs.10000");
		
	}
	public void Transaction() {
		System.out.println("Your transaction limit is: 5");
		
	}
	public void Failed_payment() {
		System.out.println("Payments may take up to 3 Business days to appear in your bank");
		
	}
	public void HDFC() {
		System.out.println("No account");
		
	}
	public void Axis_bank() {
		System.out.println("Your account in Axix bank");
		
	}
	public void Kotack_Bank() {
		System.out.println("No account");
		
	}
	public void Deposite() {
		System.out.println("Amount deposited INR 5000.00");
		
	}
	public void Withdrwal() {
		System.out.println("Your withdrawal request for 1000.00 is processed");
		
	}

	public void ATM_Number() {
		System.out.println("ATM number is: 9923XXXXX");
		
	}

}
