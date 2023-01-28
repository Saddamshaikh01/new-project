package inheritance;

public class Subclass1 extends SuperClass1 {
	void sub_print() {
		System.out.println("Sub print");
	}
	void sub_show() {
		System.out.println("Sub show");
	}
	void super_print() {
		System.out.println("Super print");
	}
	

	public static void main(String[] args) {
		SuperClass1 b=new SuperClass1();
		Subclass1 a=(Subclass1) b;
		a.sub_print();
		a.sub_show();
		a.super_print();
		a.super_show();
		
		
		
		

	}

}
