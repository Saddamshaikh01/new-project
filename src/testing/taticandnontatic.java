package testing;

public class taticandnontatic {
	static int a=10;
	double b=0.01;
	
	static void love() {
		System.out.println("I love India");
	}
	void fun() {
		System.out.println("i love maharshtra");
	}
	public static void main(String[] args) {
		taticandnontatic m1=new taticandnontatic();
		m1.fun();
		System.out.println(m1.b);
		love();
		System.out.println(a);
		
		

	}

}
