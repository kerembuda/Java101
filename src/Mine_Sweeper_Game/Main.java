package Mine_Sweeper_Game;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        MineSweeper game = new MineSweeper();
        int[][] board = game.create_board();
        board = game.generate_mines(board);

        game.print_board(board);
    }
}
