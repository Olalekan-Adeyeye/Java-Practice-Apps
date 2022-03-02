public class Main {
    public static void main(String[] args) {
       Player one = new Player("Barry Allen");
       Player two = new Player("Jude Judas");

       GameEngine pVsCom = new GameEngine(10);
        System.out.println();
       GameEngine firstToOne = new GameEngine(one, two);
        System.out.println();
       GameEngine firstToOneGame = new GameEngine(5, one, two);
    }
}
