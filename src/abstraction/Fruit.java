package abstraction;

class Juice extends Fruit{
	

void Apple() {
	System.out.println("One glass Apple juice");
}
void Orange() {
	System.out.println("One glass of orange juice");
}
void Grapes() {
	System.out.println("1 kg grapes");
}
void Melon() {
	System.out.println("One bottle melon Vodka");
}
void Banana()
{
	System.out.println("12 piece banana");
}
}
abstract class Fruit {
	abstract void Apple();
	abstract void Orange();
	abstract void Grapes();
	abstract void Melon();
	abstract void Banana();
 
	
	public static void main(String[] args) {
		Fruit a=new Juice();
		a.Apple();
		a.Banana();
		a.Melon();
		a.Grapes();
		a.Orange();

	}

}
