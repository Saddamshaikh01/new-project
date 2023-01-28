package program;
/**
 * write the program sum of 1 to 10 numbers.
 * By using for loop
 */

public class Sum_1_10 {

	public static void main(String[] args) {
		
		int sum=0;
		
		for(int i=1; i<=10; i++) {
			 sum= sum + i;
		}
		System.out.println(sum);

	}

}
