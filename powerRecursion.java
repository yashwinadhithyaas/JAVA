import java.util.Scanner;

public class powerRecursion {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int n = powerOfNumber(a, b);
		System.out.println(a + "^" + b + " = " + n);
		sc.close();
	}

	public static int powerOfNumber(int a, int b) {
		if (b != 0) {
			return a * (powerOfNumber(a, b - 1));
		} else {
			return 1;
		}

	}
}