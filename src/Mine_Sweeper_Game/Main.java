package Mine_Sweeper_Game;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Please enter table height: ");
        int boardRow = input.nextInt();
        System.out.print("Please enter table width: ");
        int boardColumn = input.nextInt();

        MineSweeper game = new MineSweeper(boardRow,boardColumn);

        int x = game.get_x();
        int y = game.get_y();

        if ((x > game.board_height && x < 0) && (y > game.board_width && y < 0)) {

        }

        game.get_Mine_Count_Around(x,y);
        System.out.println(game.get_Mine_Count_Around(x,y));
    }
}
