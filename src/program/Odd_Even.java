/**
 * 
 */
package program;

/*Here we find the given number is odd or even number.
 *the way of find the number is odd or even is any number divisible by 2 and reminder is zero
 *the number is even and the number is not divisible by 2 and reminder is somthing the number is odd.
 *by using if else statement we can find the given number is odd or even
 */
public class Odd_Even {

	  public static void main(String[] args) {
		/*int num=13;
		if(num%2==0) {
			System.out.println("Number is even");
		}
		else {
			System.out.println("Number is odd");
		*/
// if we want to print odd even number, then we use for loop
	for(int i=1; i<=50; i++) {
		if(i%2==0) {
			System.out.println("number is even="+i);
		}
		else {
			System.out.println("number is odd="+i);
		}
	
	}
	
  }

}
