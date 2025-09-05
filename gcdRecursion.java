import java.util.Scanner;

public class gcdRecursion {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int n = gcd(a, b);
		System.out.println("GCD of " + a + " & " + b + " is: " + n);
		sc.close();
	}

	public static int gcd(int a, int b) {
		if (b != 0) {
			return gcd(b, a % b);
		} else {
			return a;
		}
	}
}