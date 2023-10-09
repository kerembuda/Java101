package Mine_Sweeper_Game;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class MineSweeper {
    //We have height,width,positions, boards, win status and turn count.
    int board_height;
    int board_width;
    int x;
    int y;
    int[][] empty_board;
    int[][] armed_board;
    boolean isGameOver;
    int total_turn_count;
    String[][] user_interface;

    public MineSweeper(int board_height, int board_width) {
        //it takes only the height and width and creates game board.
        this.board_height = board_height;
        this.board_width = board_width;
        this.empty_board = new int[this.board_height][this.board_width];

        this.user_interface = new String[this.board_height][this.board_width];
        this.armed_board = generate_mines(this.empty_board);

        this.isGameOver = false;
        this.total_turn_count = board_height * board_width;

        //Here we convert our armed board to string array for user interface.
        for (int i = 0; i < this.board_height; i++) {
            for (int j = 0; j < this.board_width; j++) {
                this.user_interface[i][j] = "|-|";
            }
        }
    }

    public int[][] generate_mines(int[][] empty_board) {

        //we take empty board, generate random locations for mines to be armed/placed.
        //it gives back armed board, and also does not change the empty one, so you can use it for later.
        int height = empty_board.length;
        int width = empty_board[0].length;


        int[][] armed_board = copy_array(empty_board);

        int table_slots_count = height * width;
        int mine_count = (int) (table_slots_count * 0.25);
        //It places quarter amount of mines. Places one more if it is odd. (4 mines for 9 slots)
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

    public void print_board(String[][] board) {
        //Prints the given array in the form of game board.
        for (String[] row : board) {
            for (String col : row) {
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
        System.out.print("Please select the row. " + " 1 - " + (this.board_height) + " : ");
        int x = input.nextInt();
        return x-1;
    }

    public int get_y() {
        //Here we can take Y from the user.
        //Do not use this independently. Must be used in get_input_from_user_and_check_mine_count.
        Scanner input = new Scanner(System.in);
        System.out.print("Please select the column. " + " 1 - " + (this.board_width) + " : ");
        int y = input.nextInt();
        return y-1;
    }

    public int get_input_from_user_and_check_mine_count() {
        //here we take individual coordinates from user also checking if it's in the range
        //After getting the correct locations from user, we count the surrounding mines.

        int counter = 0;
        do {
            this.x = get_x();
            if ((this.x < 0 || this.x > board_height)) {
                System.out.println("Please enter a valid position!");
            }
        } while ((this.x < 0 || this.x > board_height));

        do {
            this.y = get_y();
            if ((this.y < 0 || this.y > board_width)) {
                System.out.println("Please enter a valid position!");
            }
        } while ((this.y < 0 || this.y > board_width));

        //if the selected location contains mine, game is over.
        //if not, we check surrounding tiles.
        if (check_if_mine(this.x, this.y)) {
            return 9;
        } else {
            //placeholder
            return 0;
        }

    }

    public boolean check_if_mine(int x, int y) {
        //Here we check if the selected point is mine or not.
        if (this.armed_board[x][y] == 9) {
            return true;
        }
        return false;
    }
}

