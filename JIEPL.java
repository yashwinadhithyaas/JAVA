public class JIEPL {
	public static void main(String[] args) {
		String sentence = "Java Is Easy Programming Language";
		String[] words = sentence.split(" ");
		for (String word : words) {
			System.out.print(word.charAt(0));
		}
	}
}