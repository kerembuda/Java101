package Mine_Sweeper_Game;

import java.util.Random;
import java.util.Scanner;

public class MineSweeper {
    public int[][] create_board() {
        //Here we take column/row size from the user.
        Scanner input = new Scanner(System.in);
        System.out.print("Please enter table height: ");
        int boardRow = input.nextInt();
        System.out.print("Please enter table width: ");
        int boardColumn = input.nextInt();
        return new int[boardRow][boardColumn];
    }

    public int[][] generate_mines(int[][] empty_board) {

        //we take empty board, generate random locations for mines to be armed.
        //it gives back armed board.

        int height = empty_board.length;
        int width = empty_board[0].length;
        int table_slots_count = height * width;
        int mine_count = (int) (table_slots_count * 0.25);
        Random random = new Random();
        int mine_counter = 0;

        while (mine_counter <= mine_count) {
            int mine_arm_location = random.nextInt(table_slots_count);
            if (empty_board[(int) mine_arm_location / width][(mine_arm_location % width)] == 0) {
                empty_board[(int) mine_arm_location / width][(mine_arm_location % width)] = 9;
                mine_counter++;
            }
        }
        return empty_board;
    }

    public void print_board(int[][] board) {
        for (int[] row: board) {
            for (int col: row) {
                System.out.print(col + " ");
            }
            System.out.println();
        }
    }


}

