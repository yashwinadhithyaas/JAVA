import java.util.Scanner;

public class factorialRecursion {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		int fact = factrecursion(num);
		System.out.println(num + "!" + " = " + fact);
		sc.close();
	}

	public static int factrecursion(int n) {
		if (n >= 1) {
			return n * factrecursion(n - 1);
		} else {
			return 1;
		}
	}
}