// Abstract class
abstract class Fruits {
    public abstract void color(); // abstract method

    public abstract void getPersonalInformation();

    public void taste() { // regular method
        System.out.println("It tastes good!");
    }
}

// Subclass
class Apple extends Fruits {
    public void color() {
        System.out.println("Apple is red");
    }

    public void getPersonalInformation() {
        System.out.println("Apple is red");
    }

}

public class simple {

    // int av =10;
    // void methodName(){}
}

class abst {
    public static void main(String[] args) {
        Apple myApple = new Apple(); // Create Apple object
        myApple.color(); // call overridden method
        myApple.taste(); // call inherited method
    }
}
