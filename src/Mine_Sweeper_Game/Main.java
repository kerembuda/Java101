package Mine_Sweeper_Game;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {


        Scanner input = new Scanner(System.in);
        System.out.print("Please enter table height: ");
        int boardRow = input.nextInt();
        System.out.print("Please enter table width: ");
        int boardColumn = input.nextInt();

        MineSweeper game = new MineSweeper(boardRow, boardColumn);

        do {
            switch (game.get_input_from_user_and_check_mine_count()) {
                case 9:
                    game.isGameOver = true;
                    break;
                default:


            }
        } while (!game.isGameOver);

        // System.out.println(game.isGameOver ? "You have lost!" : "You have won!");
    }
}
