public class TicTacToe{
    public static void main(String[] args) {
        System.out.println("\nLet's play tic tac toe\n");

        char[][] board = {
            {'_', '_', '_'},
            {'_', '_', '_'},
            {'_', '_', '_'},
        };

        printBoard(board);


    }
/**
 * 
 * @param board
 */
    public static void printBoard(char[][] board){
        System.out.println(" \t   0 1 2");
        for(int i =0; i < board.length; i++){
            System.out.print("\t" + i + " ");
            // System.out.println("\t");
            for(int j=0; j < board[i].length; j++){
                System.out.print(" " + board[i][j]);
            }
            System.out.print("\n");

        }
    }

}