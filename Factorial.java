package week1.day1.assignments;

public class Factorial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int input = 5, fact = 1;
		
		for(int i = 1; i <= input; i++) {
			fact *= i;
		}
		
		System.out.println("Factorial of Given Input is : " + fact);

	}

}
