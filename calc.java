import java.util.Scanner;

public class calc {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        float x = sc.nextFloat();
        char op = sc.next().charAt(0);
        float y = sc.nextFloat();
        switch (op) {
            case '+':
                System.out.println(x + y);
                break;
            case '-':
                System.out.println(x - y);
                break;
            case '*':
                System.out.println(x * y);
                break;
            case '/':
                if (y != 0) {
                    System.out.println(x / y);
                } else {
                    System.out.println("Error");
                }
            default:
                System.out.println("Error");
                break;
        }
        sc.close();
    }
}