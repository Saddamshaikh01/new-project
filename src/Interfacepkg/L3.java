package Interfacepkg;

public interface L3 extends L1,L2 {
	void m1();
	void m4();
	
 public static void main(String[] args) {
	 System.out.println("hi");
	 
	 L3 obj=new Test();
	 obj.m1();
	 obj.m2();
	 obj.m3();
	 obj.m4();
		

	}
	
	

}
