class Emp {
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String newName) {
        this.name = newName;
    }
}

public class encap {
    public static void main(String[] args) {
        Emp newName = new Emp();
        newName.setName("George");
        System.out.println(newName.getName());

    }
}