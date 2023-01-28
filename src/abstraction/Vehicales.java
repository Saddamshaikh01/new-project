package abstraction;

public abstract class Vehicales {
		
	abstract public void price();
	abstract public void noOfWheels();
	abstract public void ABS();
	abstract public void CBS();
	abstract public void TractionControl();

	
	public static void main(String[] args) {
		RoyalEnfield v= new RoyalEnfield();
		v.price();
		v.noOfWheels();
		v.ABS();
		v.CBS();
		v.TractionControl();
		

	}

}
