package Boxing_Game;

import java.util.Objects;
public class Match {
    Fighter f1;
    Fighter f2;
    String weightCategory;
    boolean isWeightRight = false;
    int coin;

    Match(Fighter f1, Fighter f2, String weightCategory) {
        this.f1 = f1;
        this.f2 = f2;
        this.weightCategory = weightCategory;
    }

    public boolean isWeightRight() {
        if (Objects.equals(this.f1.weightCategory, this.f2.weightCategory)) {
            return isWeightRight = true;
        } else return isWeightRight = false;
    }

    public int coinFlip() {
        return coin = (int) (Math.random() * 2);
    }

    void game_run() {
        coinFlip();
        if (isWeightRight) {
            if (coin == 0) {
                //first fighter goes first
                while (f1.health > 0 && f2.health > 0) {
                    f2.health = f1.hit(f2);
                    break;
                }
            }
            if (coin == 1) {
                //second fighter goes first
                while (f1.health > 0 && f2.health > 0) {
                    //xxxxxxxxxxxxxxxxxxxx
                }
            }
        } else {
            //if weights are different
            System.out.println("Fighter weight categories doesn't match!");
        }
    }
}
