import java.util.Scanner;

public class sumOfMulti {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int sum = 0;
		for (int i = 1; i < a; i++) {

			sum += (b * i);
		}
		System.out.println(sum);
		sc.close();
	}
}