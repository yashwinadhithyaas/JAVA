class Fruits {
    public void color() {
        System.out.println("Fruits come in different colors");
    }
}

class Apple extends Fruits {
    public void color() {
        System.out.println("Apple is red");
    }
}

class Orange extends Fruits {
    public void color() {
        System.out.println("Orange is orange");
    }
}

class Banana extends Fruits {
    public void color() {
        System.out.println("Banana is yellow");
    }
}

public class poly {
    public static void main(String[] args) {
        Fruits mycolor = new Fruits();
        Fruits myapp = new Apple();
        Fruits myoran = new Orange();
        Fruits myban = new Banana();
        mycolor.color();
        myapp.color();
        myoran.color();
        myban.color();
    }
}