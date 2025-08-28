import java.util.Scanner;

public class fact {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter num: ");
        int num = scanner.nextInt();
        int facto = 1;
        for (int i = 1; i <= num; i++) {
            facto *= i;
        }
        System.out.println(num + "!" + "=" + facto);
        scanner.close();
    }
}