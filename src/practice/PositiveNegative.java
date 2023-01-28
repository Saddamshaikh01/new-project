package practice;
//find out the given number is positive or negative
//here we use the nested if else statement
public class PositiveNegative {

	public static void main(String[] args) {
		int num=10;
		
		if(num>0) {
			System.out.println("positive");
		}
		else
			if(num<0) {
				System.out.println("negative");
			}
			else
				System.out.println("zero");
	
	}

}
