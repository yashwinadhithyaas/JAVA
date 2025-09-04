import java.util.Scanner;

public class primeOrNot {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		boolean s = false;
		if (num == 0 || num == 1) {
			s = true;
		}
		for (int i = 2; i <= num / 2; ++i) {
			if (num % i == 0) {
				s = true;
				break;
			}
		}
		if (!s) {
			System.out.println("It's a prime number");
		} else {
			System.out.println("It's not a prime number");
		}
		sc.close();
	}
}
