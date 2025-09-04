import java.util.Scanner;

public class reverseSentence {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String sentence = sc.next();
		String reversed = reverse(sentence);
		System.out.println("The reversed sentence is: " + reversed);
		sc.close();
	}

	public static String reverse(String sentence) {
		if (sentence.isEmpty())
			return sentence;

		return reverse(sentence.substring(1)) + sentence.charAt(0);
	}
}