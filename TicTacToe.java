package TicTacToe;

import java.util.Scanner;

public class TicTacToe {
    public static void main(String[] args) {
        char[][]board=new char[3][3];
        for(int row=0;row<board.length;row++){
            for(int col=0;col<board[row].length;col++){
                board[row][col]=' ';
            }
        }
        char player='X';
        boolean gameOver=false;
        Scanner sc=new Scanner(System.in);
        while(!gameOver){
            printBoard(board);
            System.out.println("Player "+player+" Enter: ");
            int row=sc.nextInt();
            int col=sc.nextInt();
            if(board[row][col]==' '){
                //place the element
                board[row][col]=player;
                gameOver=hadWon(board,player);
                if(gameOver){
                    System.out.println("Player "+player+" has won");
                }else{
                    if(player=='X'){
                        player='O';
                    }else{
                        player='X';
                    }
                }
            }else{
                System.out.println("Invalid move. Try Again !");
            }
        }
    }
    public static boolean hadWon(char[][]board,char player){

        return true;
    }
    public static void printBoard(char[][]board){

    }
}
