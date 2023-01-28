package inheritance;

class A
{
	void methodA() 
	{
		System.out.println("Love you muchuuk");
	}
}
class B extends A
{
	void methodB()
	{
		System.out.println("Muchuk muchuk muchuk");
	}
}
class C extends A
{
	void methodC()
	{
		System.out.println("muchuktonde");
	}
}
class D extends A
{
	void methodD()
	{
		System.out.println("hello");
	}
}

public class Hierarachal
{

	public static void main(String[] args) {
		System.out.println("I am going to call muchuktonde dukkarrrr");
		B ob1=new B();
		C ob2=new C();
		D ob3=new D();
		
		ob1.methodB();
		ob1.methodA();
		
		ob2.methodC();
		ob2.methodA();
		
		ob3.methodD();
		ob3.methodA();
		
		
	
		

	}

}
