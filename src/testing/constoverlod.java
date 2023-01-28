package testing;

public class constoverlod {
	constoverlod(int a){
		System.out.println("My first number is: " + a);
	}
	constoverlod(int b,String c){
		System.out.println("my number is: \nMy string name is:  " + b + c);
	}
	constoverlod(double s,int e){
		System.out.println("My double vale is: \nnumber is: "+ s +e);
	}
	

	public static void main(String[] args) {
		System.out.println("i am constructor");
		new constoverlod(17);
		new constoverlod(12,"Saddam");
		new constoverlod(0.01,143);
		
		
		

	}

}
