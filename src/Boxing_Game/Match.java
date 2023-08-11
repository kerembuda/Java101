package Boxing_Game;

import java.util.Objects;

public class Match {
    Fighter f1;
    Fighter f2;
    String weightCategory;
    boolean isWeightRight = false;
    int coin;

    Match(Fighter f1, Fighter f2) {
        this.f1 = f1;
        this.f2 = f2;
    }

    public boolean isWeightRight() {
        if (Objects.equals(this.f1.weightCategory, this.f2.weightCategory)) {
            return isWeightRight = true;
        } else return isWeightRight = false;
    }

    public int coinFlip() {
        return coin = (int) (Math.random() * 2);
    }

    public void game_run() {
        int coin = coinFlip();
        if (isWeightRight()) {
            if (coin == 0) {
                //first fighter goes first
                System.out.println(this.f1.name + " goes first!");
                while (f1.health > 0 && f2.health > 0) {
                    f2.health = f1.hit(f2);
                    System.out.println(f2.name + " is left with " + f2.health + " health");
                    if (isGameOver()) {
                        break;
                    }
                    f1.health = f2.hit(f1);
                    System.out.println(f1.name + " is left with " + f1.health + " health");
                    if (isGameOver()) {
                        break;
                    }
                }
            }
            if (coin == 1) {
                //second fighter goes first
                System.out.println(this.f2.name + " goes first!");
                while (f1.health > 0 && f2.health > 0) {
                    f1.health = f2.hit(f1);
                    System.out.println(f1.name + " is left with " + f1.health+ " health");
                    if (isGameOver()) {
                        break;
                    }
                    f2.health = f1.hit(f2);
                    System.out.println(f2.name + " is left with " + f2.health+ " health");
                    if (isGameOver()) {
                        break;
                    }
                }
            }
        } else {
            //if weights are different
            System.out.println("Fighter weight categories doesn't match!");
        }
    }


    public boolean isGameOver() {
        if (this.f1.health == 0) {
            System.out.println("K.O.!!!\n" + this.f2.name + " has defeated " + this.f1.name + " and won the game!");
            return true;
        }
        if (this.f2.health == 0) {
            System.out.println("K.O.!!!\n" + this.f1.name + " has defeated " + this.f2.name + " and won the game!");
            return true;
        }
        return false;
    }
}
