package Interfacepkg;
interface A
{
	void m1();
}
interface B
{
	void m2();
}
class C implements A,B
{

	@Override
	public void m2() 
	{
		System.out.println("In m1 method");
		
	}

	@Override
	public void m1() 
	{
		System.out.println("In m2 method");
		
	}
	
}

public interface L {
	public static void main(String[]args) {
		C c1=new C();
		c1.m1();
		c1.m2();
	}

}
