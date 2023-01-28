package program;

/**
 * Here we are checking the divisibility on given number
 *To check given number divisible or not, Number is 10.
 *by using if else statement we check 
 */
public class Divisiblity_number {

	public static void main(String[] args) {
		/*int num=13;
		
		if(num%10==0) {
			System.out.println("Number is divisible");
		}
		else {
			System.out.println("Number is Not divisible");
		}*/
// if i want print 1 to 50 number which is didvisible by 5 or 3(we can use any number for divisiblity)
//we have to use for loop for print 1 to 50 number
//then we have to use if statement for condion only print number divisible 5 or 3
		
		for(int i=1; i<=50; i++) {
			
			if(i%5==0 || i%3==0) {
				
				System.out.print(" "+i);
			}
		}
		

	}

}
