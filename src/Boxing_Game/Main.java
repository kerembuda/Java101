package Boxing_Game;

public class Main {
    public static void main(String[] args) {
        Fighter f1 = new Fighter("Hasbulla", 10, 100,50, 45,10);
        Fighter f2 = new Fighter("Yiğit",20,125,55, 15, 50);

        Match UFC = new Match(f1,f2);
        UFC.game_run();

        //dodge and block chance is by 0-100%, block reduces the damage if occurs.
        //weights are fly/light/medium/heavy
    }


}
