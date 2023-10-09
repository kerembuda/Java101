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
            //first we print the board to the user.
            game.print_board(game.user_interface);
            switch (game.get_input_from_user_and_check_mine_count()) {
                //here we check the selected position
                case 9:
                    //if it returns 9, means selected position has a mine and game is over.
                    game.isGameOver = true;
                    break;
                    //if not, we should give the user surrounding mine count.
                case 0:

                case 1:

                case 2:

                case 3:

                case 4:

                case 5:

                case 6:

                case 7:

                case 8:

                default:
                    System.out.println("Something is wrong, please fix me");
                    break;
            }
        } while (!game.isGameOver);

        // System.out.println(game.isGameOver ? "You have lost!" : "You have won!");
    }
}
