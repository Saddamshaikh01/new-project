package arrayy;

public class Exception1 {

	public static void main(String[] args) {
		System.out.println("Start");
		
		int a=20;
		int b=0;
		
		System.out.println("Hi java");
		try {
		int div=a/b;
		System.out.println(div);
		}
		catch(Exception e) {
			System.out.println(e);
		}
		try {
		String s="Java";
		System.out.println(s.charAt(5));
		}
		catch(Exception e) {
			System.out.println(e);
		}

	}

}
