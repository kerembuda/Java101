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
        game.print_board(game.armed_board);

        do {
            //first we print the board to the user.
            game.print_board(game.user_interface);

            //eğer "-" olmayan üyeler - mine count = 0 ise break edip oyun kazanılmalı!!!!
            game.count_spaces(game.user_interface);
            System.out.println(game.remaining_spots + " tiles left to choose.");
            if (game.remaining_spots == 0) {
                System.out.println("Congratulations! You have won!");
                break;
            }
            switch (game.get_input_from_user_and_check_mine_count()) {
                //here we check the selected position
                case 9:
                    //if it returns 9, means selected position has a mine and game is over.
                    game.isGameOver = true;
                    System.out.println("Defeat! Game over!");
                    break;
                //if not, we should give the user surrounding mine count.
                case 0:
                    game.user_interface[game.x][game.y] = "|0|";
                    break;
                case 1:
                    game.user_interface[game.x][game.y] = "|1|";
                    break;
                case 2:
                    game.user_interface[game.x][game.y] = "|2|";
                    break;
                case 3:
                    game.user_interface[game.x][game.y] = "|3|";
                    break;
                case 4:
                    game.user_interface[game.x][game.y] = "|4|";
                    break;
                case 5:
                    game.user_interface[game.x][game.y] = "|5|";
                    break;
                case 6:
                    game.user_interface[game.x][game.y] = "|6|";
                    break;
                case 7:
                    game.user_interface[game.x][game.y] = "|7|";
                    break;
                case 8:
                    game.user_interface[game.x][game.y] = "|8|";
                    break;
                default:
                    System.out.println("Something is wrong, please fix me");
                    break;
            }
        } while (!game.isGameOver);
    }
}
