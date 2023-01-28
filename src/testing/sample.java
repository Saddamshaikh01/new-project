package testing;

public class sample {
	sample(){
		System.out.println("i am zero const.");
	}
	sample(int a, String b){
		this();
		System.out.println("Type number:123 \nMy name is: "+ a +b);
	}
	sample(double s){
		this(10,"saddam");
		System.out.println("double vale is: "+ s);
		
	}

	public static void main(String[] args) {
		System.out.println("i love s/w testing");
		sample obj=new sample(0.02);
		
		

	}

}
