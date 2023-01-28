
package program;

/**
 * here we are find the given three number,which is the largest number out of three.
 * by using && or || operator and greater than or less than operator.
 * we use if statement
 *The number is 40,10,60
 */
public class MaxNumber_outof_three {

	public static void main(String[] args) {
		int a=40, b=10, c=30;
		if(a>b && a>c) {
			System.out.println(a);
		}
		else if(b>c) {
				System.out.println(b);
			}
			else {
				System.out.println(c);
			}
		

	}

}
