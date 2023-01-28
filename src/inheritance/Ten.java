package inheritance;

public class Ten 
{
	void good() 
	{
		System.out.println("i am learning");
	}

}
 class Eleven1 extends Ten{
	void bad()
	{
		System.out.println("I am bad");
	}
	public static void main(String[]args) {
		System.out.println("i am going to show magic");
		Eleven1 obj=new Eleven1();
		obj.bad();
		obj.good();
}
	
}


