package week1.day1.assignments;

public class PrimeNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int input = 13;
		boolean flag = false;

		for (int i = 2; i <= (input / 2); i++) {
			if (input % i == 0) {
				flag = true;
				break;
			}
		}

		if (flag == false)
			System.out.println("The Number is Prime");

		else
			System.out.println("The Number is Non-Prime");

	}

}
