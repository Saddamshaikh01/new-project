package inheritance;

public class Inherit{
	void collage() {
		System.out.println("going to collage next week");
	}
}
class Herit extends Inherit{
	void school() {
		System.out.println("giong to school");
	}
}
class Rit extends Herit{
	void play() {
		System.out.println("non static method");
	}
	public static void main(String[]args) {
		System.out.println("Main method");
		Rit obj=new Rit();
		obj.play();
		obj.school();
		obj.collage();
	}
}



