public class GameEngine {
    private int shift = 0;
    private int playerOnePoint = 50;
    private int playerTwoPoint = 50;

    //  Block initializer
    {
        System.out.println("Starting Game");
    }

    //  constructor for random dice throwing with numbers of turns between computer and player
    public GameEngine(int turn){
        gamePlay(turn);
    }

    //  This constructor ends when a player gets the required number (1)
    public GameEngine(Player One, Player Two) {
        gamePlay(One, Two);
    }

    //  This constructor ends when all turns are finished
    public GameEngine(int turn, Player One, Player Two) {
        turn *=  2;
        gamePlay(One, Two, turn);
    }

    //  Checking if addition of dice value and players points goes beyond one -- if yes, add dice value to players points instead
    private int lessThanOne(int dicePoint, int playerPoint){
        int score = playerPoint - dicePoint;
        System.out.println("Point: " + playerPoint + ", Dice Value: " + dicePoint);
        if (score < 1) return playerPoint + dicePoint;
        else return score;
    }

    //  Initializing players gaming experience for random player vs computer constructor
    public void gamePlay(int turn){
        int pOneScore = 0;
        int pTwoScore = 0;
        for (int i = 0; i < turn; i++) {
            Dice player = new Dice();
            Dice computer = new Dice();
            if (player.getDie1() > computer.getDie1()){
                pOneScore++;
                System.out.println("Player roll: " + player.getDie1() + " Computer roll: " + computer.getDie1());
            }
            else if (player.getDie1() < computer.getDie1()) {
                pTwoScore++;
                System.out.println("Player roll: " + player.getDie1() + " Computer roll: " + computer.getDie1());
            }
            else{
                System.out.println("Player roll: " + player.getDie1() + " Computer roll: " + computer.getDie1());
            }
        }
        String winner = pOneScore == pTwoScore? "Its a draw": pOneScore > pTwoScore? "Player wins": "Computer wins";
        System.out.println("\nPlayer Point: " + pOneScore + " Computer Point: " + pTwoScore);
        System.out.println(winner);
    }

    //  Initializing players gaming experience for two players and no - turn constructor
    private void gamePlay(Player one, Player two) {
        while (playerOnePoint > 1 && playerTwoPoint > 1){
            Dice dice;
            if (shift % 2 == 0) {
                dice = new Dice();
                playerOnePoint = lessThanOne(dice.totalDicePoint(), playerOnePoint);
                System.out.print(one.getName() + ": " + playerOnePoint + "\n");
            }
            else {
                dice = new Dice();
                playerTwoPoint = lessThanOne(dice.totalDicePoint(), playerTwoPoint);
                System.out.println(two.getName() + ": " + playerTwoPoint + "\n");
            }
            shift += 1;
        }
        String winner = (playerOnePoint < playerTwoPoint)? one.getName() + " wins.": two.getName() + " wins";
        System.out.println("---------------\n" + winner);
    }

    //  Initializing players gaming experience for two players and turns constructor
    private void gamePlay(Player one, Player two, int turn){
        while (playerOnePoint > 1 && playerTwoPoint > 1 && turn > 0){
            Dice dice;
            if (shift % 2 == 0) {
                dice = new Dice();
                playerOnePoint = lessThanOne(dice.totalDicePoint(), playerOnePoint);
                System.out.print(one.getName() + ": " + playerOnePoint + "\n");
            }
            else {
                dice = new Dice();
                playerTwoPoint = lessThanOne(dice.totalDicePoint(), playerTwoPoint);
                System.out.println(two.getName() + ": " + playerTwoPoint + "\n");
            }
            shift += 1;
            turn -= 1;
        }
        String winner = (playerOnePoint < playerTwoPoint)? one.getName() + " wins.": two.getName() + " wins";
        System.out.println("---------------\n" + winner);
    }

    public int getPlayerOnePoint() {
        return playerOnePoint;
    }

    public int getPlayerTwoPoint() {
        return playerTwoPoint;
    }

}
