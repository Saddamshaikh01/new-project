package polymorphism;

public class Demo2 {
	
	void m1(String a,int h) {
		System.out.println("Hi java "+a +h);
		}
	void m1(int e,String a) {
		System.out.println("hello Python "+e +a);
	}

	public static void main(String[] args) {
		Demo2 obj=new Demo2();
		obj.m1(3, "sad");
		obj.m1("sad2", 70);


	}
	

}
