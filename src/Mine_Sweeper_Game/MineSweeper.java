package Mine_Sweeper_Game;

import java.util.Random;
import java.util.Scanner;

public class MineSweeper {
    int board_height;
    int board_width;
    int[][] empty_board;
    int[][] armed_board;


    public MineSweeper(int board_height, int board_width) {
        this.board_height = board_height;
        this.board_width = board_width;
        this.empty_board = new int[this.board_height][this.board_width];
        this.armed_board = generate_mines(this.empty_board);
    }


    public int[][] generate_mines(int[][] empty_board) {

        //we take empty board, generate random locations for mines to be armed.
        //it gives back armed board.
        int height = empty_board.length;
        int width = empty_board[0].length;

        int[][] armed_board = copy_array(empty_board);

        int table_slots_count = height * width;
        int mine_count = (int) (table_slots_count * 0.25);
        Random random = new Random();
        int mine_counter = 0;

        while (mine_counter <= mine_count) {
            int mine_arm_location = random.nextInt(table_slots_count);
            if (armed_board[(int) mine_arm_location / width][(mine_arm_location % width)] == 0) {
                armed_board[(int) mine_arm_location / width][(mine_arm_location % width)] = 9;
                mine_counter++;
            }
        }
        return armed_board;
    }

    public void print_board(int[][] board) {
        for (int[] row : board) {
            for (int col : row) {
                System.out.print(col + " ");
            }
            System.out.println();
        }
    }

    public int[][] copy_array(int[][] arr) {
        int[][] copied_array = new int[arr.length][arr[0].length];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                copied_array[i][j] = arr[i][j];
            }
        }
        return copied_array;
    }


    public int get_Mine_Count_Around(int x, int y) {




        int current_location = this.armed_board[x][y];


    return counter;
    }

    public int get_x() {
        Scanner input = new Scanner(System.in);
        System.out.print("Please select the row. " + " 0 - " + (this.board_height) + " : ");
        int x = input.nextInt();
        return x;
    }

    public int get_y() {
        Scanner input = new Scanner(System.in);
        System.out.print("Please select the column. " + " 0 - " + (this.board_width) + " : ");
        int y = input.nextInt();
        return y;
    }
}

