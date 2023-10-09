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
            game.get_input_from_user_and_check_mine_count();

        } while (!game.isGameOver);


    }
}
