import java.util.Scanner;

public class TicTacToe{

    static Scanner scan = new Scanner(System.in);
    
    public static void main(String[] args) {
        System.out.println("\nLet's play tic tac toe\n");

        char[][] board = {
            {'_', '_', '_'},
            {'_', '_', '_'},
            {'_', '_', '_'},
        };

        printBoard(board);

        for(int i = 0; i < 9; i++){
            System.out.print("Turn: ");
            if(i % 2 == 0){
                System.out.print(" X\n");
                int[] possitionX = askUser(board);
                board[possitionX[0]][possitionX[1]] = 'X';
                printBoard(board);
                
            }else{
                System.out.print(" O\n");
                int[] possitionO = askUser(board);
                board[possitionO[0]][possitionO[1]] = 'O';
                printBoard(board);
            }

            if(checkWin(board) == 3){
                System.out.println("X wins!!");
                break;
            }else if(checkWin(board) == -3){
                System.out.println("O wins!!");
                break;
            }else if(i == 8){
                System.out.println("It's a tie!");
            }
        }
        scan.close();
    }
    /**
     * 
     * @param board
     * @return
     */
    public static int checkWin(char[][] board){
        int count = 0;
        //checking for rows to have all the same 
        for(int i =0; i < board.length; i++){
            for(int j = 0; j < board[i].length; j++){
                if(board[i][j] == 'X'){
                    count++;
                }else if(board[i][j] == 'O'){
                    count--;
                }
            }
            if(count == 3 || count == -3){
                return count;
            }else{
                count = 0;
            }
        }
        
        //checking for columns to have all the same 
        for(int i =0; i < board.length; i++){
            for(int j=0; j < board[i].length; j++){
                if(board[j][i] == 'X'){
                    count++;
                }else if(board[j][i] == 'O'){
                    count--;
                }
            }
            if(count == 3 || count == -3){
                return count;
            }else{
                count = 0;
            }
        }

        for(int i =0; i < board.length; i++){
            if(board[i][i] == 'X'){
                count++;
            }else if(board[i][i] == 'O'){
                count--;
            }
        }
        if(count == 3 || count == -3){
            return count;
        }else{
            count = 0;
        }


        for(int i = 0; i < 3; i++){
            if(board[i][2-i] == 'X'){
                count++;
            }else if(board[i][i] == 'O'){
                count--;
            }
        }
        return count;
    }
/**
 * 
 * @param board
 */
    public static void printBoard(char[][] board){
        System.out.println(" \t   0 1 2");
        for(int i =0; i < board.length; i++){
            System.out.print("\t" + i + " ");
            for(int j=0; j < board[i].length; j++){
                System.out.print(" " + board[i][j]);
            }
            System.out.println("\n");
        }
    }

    /**
     * 
     * @param board
     * @return
     */
    public static int[] askUser(char[][]board){
        
        System.out.print(" • pick a row and column number: ");
        int row = scan.nextInt();
        int column = scan.nextInt();
        while(board[row][column] != '_'){
            System.out.print("Spot taken, try again: ");
            row = scan.nextInt();
            column = scan.nextInt();
        }
        int[] spot = {row, column};
        
        return spot;
    }
}