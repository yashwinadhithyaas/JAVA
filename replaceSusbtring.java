import java.util.Scanner;

public class replaceSusbtring {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();
		String oldString = sc.nextLine();
		String newString = sc.nextLine();
		String repString = s.replace(oldString, newString);
		System.out.println(repString);
		sc.close();
	}
}
