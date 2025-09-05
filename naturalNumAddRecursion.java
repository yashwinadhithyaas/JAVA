import java.util.Scanner;

public class naturalNumAddRecursion {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		int sum = addRecursion(num);
		System.out.println("Sum: " + sum);
		sc.close();
	}

	public static int addRecursion(int n) {
		if (n != 0) {
			return n + addRecursion(n - 1);
		} else {
			return n;
		}
	}
}
