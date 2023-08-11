package Boxing_Game;

public class Main {
    public static void main(String[] args) {
        Fighter f1 = new Fighter("Hasbulla", 9, 100,50, 45,13);
        Fighter f2 = new Fighter("Yiğit",10,125,55, 15, 40);

        Match UFC = new Match(f1,f2);
        UFC.game_run();

        //dodge and block chance is by 0-100%, weights are fly/light/medium/heavy
    }


}
