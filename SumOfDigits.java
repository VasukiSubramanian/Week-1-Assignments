package week1.day1.assignments;

public class SumOfDigits {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int input = 345;
		int sum = 0;
		while (input != 0) {
			sum = sum + (input % 10);
			input = input / 10;
		}
		System.out.println("Sum of digits is : " + sum);

	}

}
