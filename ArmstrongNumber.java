package week1.day1.assignments;

public class ArmstrongNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int input = 153;
		int calculated = 0, remainder, original;
		original = input;
		
		while (input > 0) {
			remainder = input%10;
			input = input/10;
			calculated += Math.pow(remainder, 3);
		}
		
		if (calculated == original) {
			System.out.println("The Input Number is Armstrong");
		}

	}

}
