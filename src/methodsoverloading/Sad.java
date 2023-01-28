package methodsoverloading;

public class Sad {
	 void mthdoverloading(int a) {
		System.out.println("hello saddam"+" "+ a);
	}
	 void mthdoverloding(String b,int c) {
		System.out.println("My father name is: " + b +" "+ c);
	}
	 void mthdoverloding(int z, double x) {
		System.out.println("which is located in Maharshtra: "+z +", "+ x);
	}

	public static void main(String[] args) {
		System.out.println("Hello India");
		Sad obj=new Sad();
		obj.mthdoverloading(100);
		obj.mthdoverloding("shaikh", 10);
		obj.mthdoverloding(20,0.01);
		//mthdoverloding("Amanulla", 120);
		//mthdoverloding(10, 0.01);
		

	}

}
