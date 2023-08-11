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
                while (f1.health > 0 && f2.health > 0) {
                    f2.health = f1.hit(f2);
                    System.out.println(f2.name + " " +f2.health);
                    f1.health = f2.hit(f1);
                    System.out.println(f1.name + " " +f1.health);
                }
            }
            if (coin == 1) {
                //second fighter goes first
                while (f1.health > 0 && f2.health > 0) {
                    //xxxxxxxxxxxxxxxxxxxx
                    break;
                }
            }
        } else {
            //if weights are different
            System.out.println("Fighter weight categories doesn't match!");
        }
    }
}
