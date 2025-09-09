import java.util.Scanner;

public class lengthBetweenVowels {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String sentence = sc.nextLine();
		String[] lengthString = sentence.split("[aeiouAEIOU]");
		int sum = 0;
		int leng = 0;
		System.out.println("Lengths between vowels are: ");
		for (String l : lengthString) {
			leng = l.length();
			sum += l.length();
			System.out.println(leng);
		}
		System.out.println("Sum of all lengths: ");
		System.out.println(sum);
		sc.close();
	}
}