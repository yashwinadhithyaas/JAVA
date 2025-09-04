import java.util.Scanner;

public class powerOfNumber {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int base = sc.nextInt();
		int expo = sc.nextInt();
		int result = 1;
		while (expo != 0) {
			result *= base;
			--expo;
		}
		System.out.println(result);
		sc.close();
	}
}