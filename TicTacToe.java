package homework;

import java.util.Scanner;

public class TicTacToe {

    public static void main(String[] args) {
        String[][] board = new String[3][3];
        Scanner input = new Scanner(System.in);
        board[0][0] = "-";
        board[0][1] = "-";
        board[0][2] = "-";
        board[1][0] = "-";
        board[1][1] = "-";
        board[1][2] = "-";
        board[2][0] = "-";
        board[2][1] = "-";
        board[2][2] = "-";
        System.out.println("\n**** WELCOME TicTacToe ****");

        for (int i = 0; i < 9; ++i) {
            int move;
            if (i % 2 == 0) {
                System.out.println("\nPlayer X, make your move (1-9):");
                move = input.nextInt();
                if (move >= 1 && move <= 9) {
                    if (!setX(move, board)) {
                        --i;
                    }
                } else {
                    System.out.println("Invalid input! Please enter a number between 1 and 9.");
                    --i;
                }
            } else {
                System.out.println("\nPlayer O, make your move (1-9):");
                move = input.nextInt();
                if (move >= 1 && move <= 9) {
                    if (!setO(move, board)) {
                        --i;
                    }
                } else {
                    System.out.println("Invalid input! Please enter a number between 1 and 9.");
                    --i;
                }
            }

            printBoard(board);
            if (checkWinner(board)) {
                break;
            }
        }

    }

    public static boolean setX(int move, String[][] board) {
        switch (move) {
            case 1:
                if (board[0][0].equals("-")) {
                    board[0][0] = "x";
                    return true;
                }
                break;
            case 2:
                if (board[0][1].equals("-")) {
                    board[0][1] = "x";
                    return true;
                }
                break;
            case 3:
                if (board[0][2].equals("-")) {
                    board[0][2] = "x";
                    return true;
                }
                break;
            case 4:
                if (board[1][0].equals("-")) {
                    board[1][0] = "x";
                    return true;
                }
                break;
            case 5:
                if (board[1][1].equals("-")) {
                    board[1][1] = "x";
                    return true;
                }
                break;
            case 6:
                if (board[1][2].equals("-")) {
                    board[1][2] = "x";
                    return true;
                }
                break;
            case 7:
                if (board[2][0].equals("-")) {
                    board[2][0] = "x";
                    return true;
                }
                break;
            case 8:
                if (board[2][1].equals("-")) {
                    board[2][1] = "x";
                    return true;
                }
                break;
            case 9:
                if (board[2][2].equals("-")) {
                    board[2][2] = "x";
                    return true;
                }
                break;
        }
        System.out.println("This spot is taken! Please choose another spot.");
        return false;
    }

    public static boolean setO(int move, String[][] board) {
        switch (move) {
            case 1:
                if (board[0][0].equals("-")) {
                    board[0][0] = "o";
                    return true;
                }
                break;
            case 2:
                if (board[0][1].equals("-")) {
                    board[0][1] = "o";
                    return true;
                }
                break;
            case 3:
                if (board[0][2].equals("-")) {
                    board[0][2] = "o";
                    return true;
                }
                break;
            case 4:
                if (board[1][0].equals("-")) {
                    board[1][0] = "o";
                    return true;
                }
                break;
            case 5:
                if (board[1][1].equals("-")) {
                    board[1][1] = "o";
                    return true;
                }
                break;
            case 6:
                if (board[1][2].equals("-")) {
                    board[1][2] = "o";
                    return true;
                }
                break;
            case 7:
                if (board[2][0].equals("-")) {
                    board[2][0] = "o";
                    return true;
                }
                break;
            case 8:
                if (board[2][1].equals("-")) {
                    board[2][1] = "o";
                    return true;
                }
                break;
            case 9:
                if (board[2][2].equals("-")) {
                    board[2][2] = "o";
                    return true;
                }
                break;
        }
        System.out.println("This spot is taken! Please choose another spot.");
        return false;
    }

    public static boolean checkWinner(String[][] board) {
        if (board[0][0].equals("x") && board[0][1].equals("x") && board[0][2].equals("x") ||
                board[1][0].equals("x") && board[1][1].equals("x") && board[1][2].equals("x") ||
                board[2][0].equals("x") && board[2][1].equals("x") && board[2][2].equals("x") ||
                board[0][0].equals("x") && board[1][0].equals("x") && board[2][0].equals("x") ||
                board[0][1].equals("x") && board[1][1].equals("x") && board[2][1].equals("x") ||
                board[0][2].equals("x") && board[1][2].equals("x") && board[2][2].equals("x") ||
                board[0][0].equals("x") && board[1][1].equals("x") && board[2][2].equals("x") ||
                board[0][2].equals("x") && board[1][1].equals("x") && board[2][0].equals("x")) {
            System.out.println("\nX wins...");
            return true;
        } else if (board[0][0].equals("o") && board[0][1].equals("o") && board[0][2].equals("o") ||
                board[1][0].equals("o") && board[1][1].equals("o") && board[1][2].equals("o") ||
                board[2][0].equals("o") && board[2][1].equals("o") && board[2][2].equals("o") ||
                board[0][0].equals("o") && board[1][0].equals("o") && board[2][0].equals("o") ||
                board[0][1].equals("o") && board[1][1].equals("o") && board[2][1].equals("o") ||
                board[0][2].equals("o") && board[1][2].equals("o") && board[2][2].equals("o") ||
                board[0][0].equals("o") && board[1][1].equals("o") && board[2][2].equals("o") ||
                board[0][2].equals("o") && board[1][1].equals("o") && board[2][0].equals("o")) {
            System.out.println("\nO wins...");
            return true;
        } else {
            boolean draw = true;
            for (int i = 0; i < 3; ++i) {
                for (int j = 0; j < 3; ++j) {
                    if (board[i][j].equals("-")) {
                        draw = false;
                        break;
                    }
                }
                if (!draw) {
                    break;
                }
            }
            if (draw) {
                System.out.println("\nThe game ended in a draw!!!");
                return true;
            } else {
                return false;
            }
        }
    }

    public static void printBoard(String[][] board) {
        for (int i = 0; i <= 2; ++i) {
            System.out.println("");
            for (int j = 0; j <= 2; ++j) {
                System.out.print(board[i][j]);
            }
        }
        System.out.println("");
    }
}
