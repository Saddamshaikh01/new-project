package inheritance;

public class One {
	void zero() 
	{
		System.out.println("i am zero method");
		
	}
}
 class two extends One
 {
	 void one() 
	 {
		 System.out.println("i am two method");
	 }
 }
 class three extends two
 {
	 void four() 
	 {
		 System.out.println("i am four method");
	 }
static void main(String[]args) {
	 System.out.println("start the inheritance");
	 three obj=new three();
	 obj.one();
	 obj.zero();
	 obj.four();
	 
	 
 }	 
 }
 
