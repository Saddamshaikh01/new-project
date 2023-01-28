package polymorphism;

public class B extends A {
	
	void show() {
		System.out.println("i am in B class");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		B obj2=new B();
		obj2.show();
		A obj=new A();
		obj.show();
		

	}


}
