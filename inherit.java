class Game {
    protected String level = "RESTART";

    public void over() {
        System.out.println("GAME OVER!");
    }

}

class Ngame extends Game {
    private String restart = "LEVEL";

    public static void main(String[] args) {
        Ngame newgame = new Ngame();
        newgame.over();
        System.out.println(newgame.level + " " + newgame.restart);
    }
}