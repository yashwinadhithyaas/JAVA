import java.util.Scanner;

class test

{

	int day, month, year;

}

public class date {
	public static void main(String[] args) {// Write your code here
		Scanner sc = new Scanner(System.in);
		test newDate = new test();
		newDate.day = sc.nextInt();
		newDate.month = sc.nextInt();
		newDate.year = sc.nextInt();
		System.out.println(newDate.day + "/" + newDate.month + "/" + newDate.year);
		System.out.println(42 % 3);
		sc.close();
	}
}