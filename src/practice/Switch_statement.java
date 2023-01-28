package practice;

public class Switch_statement {

	public static void main(String[] args) {
		int number=12;
		
		switch(number) {
		case 1:
		case 3:
		case 5:
		case 7:
		case 8:
		case 10:
		case 12:
			System.out.println("31 days");
			break;
		case 4:
		case 6:
		case 2:
		case 11:
			System.out.println("30 days");
			break;
			default:
				System.out.println("invalid number");
		}

	}

}
