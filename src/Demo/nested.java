package Demo;

public class nested {

	public static void main(String[] args) {
		int a=90;
		int b=70;
		int c=30;
		if(c>a || c>b)
		{
			System.out.println("c is greater");
		}
		else if(b>a && b>c)
		{
			System.out.println("b is greater");
		}
		else if(a>b || a>c)
		{
			System.out.println("a is greater");
		}
	}
}