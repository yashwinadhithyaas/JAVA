import java.util.Scanner;

public class notmain {
    // THIS IS A COMMENT
    public static void main(String[] args) {
        System.out.println(Math.max(5, 10));
        System.out.println(Math.min(30, 21));
        System.out.println(Math.sqrt(20));
        System.out.println(Math.abs(-0.4510));

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();

        if (number % 2 == 0) {
            System.out.println(number + " is even");
        } else {
            System.out.println(number + " is odd");
        }
        scanner.close();
        notmain obj = new notmain();
        obj.names();
        notmain obj2 = new notmain();
        obj2.nums();
        notmain obj3 = new notmain();
        obj3.concat();
        notmain obj4 = new notmain();
        obj4.example();
        notmain obj5 = new notmain();
        obj5.myswitch();
        notmain obj6 = new notmain();
        obj6.example2();
    }

    public void names() {
        String[] name = { "Yashwin", "Kannan", "Ajay" };
        for (String n : name) {
            System.out.println(n);
        }
    }

    public void nums() {
        int a = 3;
        int e = 5;
        float b = 4.66f;
        char c = 'C';
        double d = 5.99999933334d;
        float x = a + b;
        double y = a / b;
        int z = a * a;
        int f = 5 % 3;
        float myflt = a;
        int myint = (int) d;
        System.out.println(myint);
        System.out.println(myflt);
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        System.out.println(d);
        System.out.println(e);
        System.out.println(x);
        System.out.println(y);
        System.out.println(z);
        System.out.println(f);

    }

    public void concat() {
        String fname = "James";
        String lname = "Bond";
        String num = "007";
        System.out.println(fname + " " + lname);
        System.out.println(fname + " " + lname + " " + num);

    }

    public void example() {
        int age = 40;
        boolean True = true;
        boolean False = false;
        if (age <= 40) {
            System.out.println(True);

        } else if (age >= 40) {
            System.out.println(True);
        } else {
            System.out.println(False);
        }

    }

    public void myswitch() {
        int day = 12;
        switch (day) {
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("Thursday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            case 6:
                System.out.println("Saturday");
                break;
            case 7:
                System.out.println("Sunday");
                break;
            default:
                System.out.println("What day is it today?");
                break;

        }

    }

    public void example2() {
        int i = 0;
        while (i < 10) {
            System.out.println(i);
            i++;
            if (i == 8) {
                break;
            } else if (i == 5) {
                continue;
            } else {
                continue;
            }
        }

    }
}