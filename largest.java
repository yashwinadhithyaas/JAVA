import java.util.Scanner;

public class largest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter number: ");
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();
        if ((a > b) && (a > c)) {
            System.out.println("a is greater");
        } else if ((b > c) && (b > a)) {
            System.out.println("b is greater");
        } else if ((c > a) && (c > b)) {
            System.out.println("c is greater");
        } else {
            System.out.println("All are equal");
        }
        scanner.close();
    }
}
