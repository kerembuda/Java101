package Mine_Sweeper_Game;

import java.util.Random;
import java.util.Scanner;

public class MineSweeper {
    //We have height,width, boards and win status
    int board_height;
    int board_width;
    int[][] empty_board;
    int[][] armed_board;
    boolean isGameOver;

    public MineSweeper(int board_height, int board_width) {
        //it takes only the height and width and creates game board.
        this.board_height = board_height;
        this.board_width = board_width;
        this.empty_board = new int[this.board_height][this.board_width];
        this.armed_board = generate_mines(this.empty_board);
        this.isGameOver = false;
    }


    public int[][] generate_mines(int[][] empty_board) {

        //we take empty board, generate random locations for mines to be armed/placed.
        //it gives back armed board, and also does not change the empty one, so you can use it for later.
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
        //Prints the given array in the form of game board.
        for (int[] row : board) {
            for (int col : row) {
                System.out.print(col + " ");
            }
            System.out.println();
        }
    }

    public int[][] copy_array(int[][] arr) {
        //Manual copy array method.
        int[][] copied_array = new int[arr.length][arr[0].length];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                copied_array[i][j] = arr[i][j];
            }
        }
        return copied_array;
    }


    public int get_x() {
        //Here we can take X from the user.
        //Do not use this independently. Must be used in get_input_from_user_and_check_mine_count.
        Scanner input = new Scanner(System.in);
        System.out.print("Please select the row. " + " 0 - " + (this.board_height) + " : ");
        int x = input.nextInt();
        return x;
    }

    public int get_y() {
        //Here we can take Y from the user.
        //Do not use this independently. Must be used in get_input_from_user_and_check_mine_count.
        Scanner input = new Scanner(System.in);
        System.out.print("Please select the column. " + " 0 - " + (this.board_width) + " : ");
        int y = input.nextInt();
        return y;
    }

    public int get_input_from_user_and_check_mine_count() {
        //here we take individual coordinates from user also checking if it's in the range
        int x = 0;
        int y = 0;
        int counter = 0;
        do {
            x = get_x();
        } while (!(x <= 0 && x > board_height));

        do {
            y = get_y();
        } while (!(y < 0 && y > board_width));






    }
}

