package overriding;

public class B extends A {
	void show() {
		System.out.println("hi class B");
		super.show();
	}

	public static void main(String[] args) {
		B obj1=new B();
		obj1.show();
		
		
		

	}

}
