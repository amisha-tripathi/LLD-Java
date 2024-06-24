package LowLevelDesignPractice.DesignTicTacToeGame.Model;

import java.util.Arrays;

public class Board {
  int size;
  Piece[][] board;
  public Board(int size){
    this.board=new Piece[size][size];
  }
  public Boolean assignBoard(int r, int c, Player p){
    if(board[r][c]==null){
      board[r][c]=p.piece;
      return true;
    }else{
      return false;
    }
  }
  public Boolean checkWinner(int r, int c, Player p){
    boolean colFlag=true;
    boolean rowFlag=true;
    for(int i=0; i< board.length; i++){
      if(board[i][c]==null) colFlag=false;
      else if(board[i][c].pieceType!=p.getPiece().pieceType) colFlag=false;
    }
    for(int j=0; j<board[0].length; j++){
      if(board[r][j]==null) rowFlag=false;
      else if(board[r][j].pieceType!=p.getPiece().pieceType) rowFlag=false;
    }
    return colFlag || rowFlag;
  }

  public void printBoard(){
    for(int i=0; i<board.length; i++){
      for (int j=0; j<board[0].length; j++) {
        if(board[i][j]==null)
          System.out.print(board[i][j]);
        else System.out.print(board[i][j].pieceType);
      }
      System.out.println();
    }
  }

  public Boolean isTie() {
    for(int i=0; i< board.length; i++){
      for(int j=0; j<board[0].length; j++){
        if(board[i][j]==null){
          return false;
        }
      }
    }
    return true;
  }
}
