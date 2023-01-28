package overriding;

class abc{
	void shaikh() {
		System.out.println("i am good");
	}
}

class abcd extends abc{
	void shaikh() {
		System.out.println("i am not good");
		super.shaikh();
	}
}

public class Saddam {

	public static void main(String[] args) {
		abcd a=new abcd();
		a.shaikh();
		
		
		

	}

}
