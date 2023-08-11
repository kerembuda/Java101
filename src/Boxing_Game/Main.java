package Boxing_Game;

public class Main {
    public static void main(String[] args) {
        Fighter f1 = new Fighter("Hasbulla", 7, 100,50, 10,5);
        Fighter f2 = new Fighter("Yiğit",15,150,55, 5, 8);

        Match UFC = new Match(f1,f2);
        UFC.game_run();
    }


}
