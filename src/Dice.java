public class Dice {
   private int die1, die2;

    public Dice() {
        setDie1();
        setDie2();
    }

    public int getDie1() {
        return die1;
    }

    private void setDie1() {
        this.die1 = (int)(Math.random() * 6) + 1;
    }

    public int getDie2() {
        return die2;
    }

    private void setDie2() {
        this.die2 = (int)(Math.random() * 6) + 1;
    }

    public int totalDicePoint(){
        return getDie1() + getDie2();
    }
}
