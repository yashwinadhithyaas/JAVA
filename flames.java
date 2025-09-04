import java.util.Scanner;

public class flames {

	public static String getRelationship(String name1, String name2) {
		name1 = name1.toLowerCase().replaceAll("\\s+", "");
		name2 = name2.toLowerCase().replaceAll("\\s+", "");

		StringBuilder sb1 = new StringBuilder(name1);

		for (int i = 0; i < sb1.length(); i++) {
			char ch = sb1.charAt(i);
			int index = name2.indexOf(ch);
			if (index != -1) {
				sb1.deleteCharAt(i);
				name2 = name2.substring(0, index) + name2.substring(index + 1);
				i--;
			}
		}

		int count = sb1.length() + name2.length();

		String flames = "FLAMES";
		StringBuilder sb = new StringBuilder(flames);

		int idx = 0;
		while (sb.length() > 1) {
			idx = (idx + count - 1) % sb.length();
			sb.deleteCharAt(idx);
		}

		char result = sb.charAt(0);

		switch (result) {
			case 'F':
				return "Friends";
			case 'L':
				return "Love";
			case 'A':
				return "Affection";
			case 'M':
				return "Marriage";
			case 'E':
				return "Enemies";
			case 'S':
				return "Siblings";
			default:
				return "Unknown";
		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("Enter first name: ");
		String name1 = sc.nextLine();

		System.out.print("Enter second name: ");
		String name2 = sc.nextLine();

		String relation = getRelationship(name1, name2);
		System.out.println("Relationship: " + relation);

		sc.close();
	}
}
