package Interfacepkg;
interface Qrt{
	void m11();
}
interface Srt{
	void m11();
}
class Catt implements Qrt,Srt{


	@Override
	public void m11() {
		System.out.println("In m11 method");
		
	}
	
}

public interface Main {
	public static void main(String[]args) {
		Catt c1=new Catt();
		c1.m11();
		
	}

}
