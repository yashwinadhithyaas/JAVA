import java.util.Scanner;
import java.util.Stack;

public class Calculator {
    // apply operator on two numbers
    private static double apply(double a, double b, char op) {
        switch (op) {
            case '+':
                return a + b;
            case '-':
                return a - b;
            case '*':
                return a * b;
            case '/':
                return a / b;
        }
        return 0;
    }

    // precedence of operators
    private static int prec(char op) {
        if (op == '+' || op == '-')
            return 1;
        if (op == '*' || op == '/')
            return 2;
        return 0;
    }

    public static double evaluate(String exp) {
        Stack<Double> values = new Stack<>();
        Stack<Character> ops = new Stack<>();

        for (int i = 0; i < exp.length(); i++) {
            char c = exp.charAt(i);

            if (c == ' ')
                continue;

            if (Character.isDigit(c)) {
                StringBuilder sb = new StringBuilder();
                while (i < exp.length() &&
                        (Character.isDigit(exp.charAt(i)) || exp.charAt(i) == '.')) {
                    sb.append(exp.charAt(i++));
                }
                i--; // step back
                values.push(Double.parseDouble(sb.toString()));
            } else {
                while (!ops.isEmpty() && prec(ops.peek()) >= prec(c)) {
                    double b = values.pop(), a = values.pop();
                    values.push(apply(a, b, ops.pop()));
                }
                ops.push(c);
            }
        }

        while (!ops.isEmpty()) {
            double b = values.pop(), a = values.pop();
            values.push(apply(a, b, ops.pop()));
        }

        return values.pop();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNextLine()) {
            String in = sc.nextLine();
            if (in.equalsIgnoreCase("exit"))
                break;
            try {
                System.out.println(evaluate(in));
            } catch (Exception e) {
                System.out.println("error");
            }
        }
        sc.close();
    }
}