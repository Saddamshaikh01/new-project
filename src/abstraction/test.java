package abstraction;

public abstract class test {
	abstract void show1();
	abstract void show2();
	abstract void show3();
	void run() {
		System.out.println("hello class");
	}
	
	public static void main(String[] args) {
		test obj=new demo();
	
		obj.show1();
		obj.show2();
		obj.show3();
		

	}

}
