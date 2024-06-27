package LowLevelDesignPractice.DesignTicTacToeGame;

import LowLevelDesignPractice.DesignTicTacToeGame.Model.Board;
import LowLevelDesignPractice.DesignTicTacToeGame.Model.Piece;
import LowLevelDesignPractice.DesignTicTacToeGame.Model.PieceType;
import LowLevelDesignPractice.DesignTicTacToeGame.Model.Player;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Scanner;

public class TicTacToeGame {
  Deque<Player> players;
  Board[][] board;

  Board boardClass;

  int numberOfPlayers;
  int boardSize;

  TicTacToeGame(){
    this.players=new ArrayDeque<>();
    System.out.println("enter number of Players");
    Scanner sc=new Scanner(System.in);
    this.numberOfPlayers= sc.nextInt();
    System.out.println("enter board size");
    this.boardSize= sc.nextInt();
    this.boardClass=new Board(boardSize);
    for(int i=1; i<=numberOfPlayers; i++){
      System.out.println("enter Player "+i+" details");
      System.out.println("Player name : ");
      String name=sc.next();

      System.out.println("Player piece Type chosen : ");
      String pieceType=sc.next();

      Player obj;
      if(pieceType.equalsIgnoreCase("X")){
        obj=new Player(name, new Piece(PieceType.X));
      }else{
        obj=new Player(name, new Piece(PieceType.O));
      }
      players.offer(obj);
    }
    this.board=new Board[boardSize][boardSize];
    new TicTacToeGame(players, board);
  }

  TicTacToeGame(Deque<Player> players, Board[][] board){
    this.players=players;
    this.board=board;
  }
  public void playGame(){
    Scanner sc=new Scanner(System.in);
    while(!players.isEmpty()){
      Player player=players.poll();
      boardClass.printBoard();
      System.out.println("hello "+ player.getPlayerName());
      System.out.println("enter row ");
      int row=sc.nextInt();
      System.out.println("enter col ");
      int col=sc.nextInt();
      Boolean isTie=boardClass.isTie();
      if(Boolean.TRUE.equals(isTie)){
        System.out.println("TIE");
        break;
      }
      Boolean flag=boardClass.assignBoard(row, col, player);
      if(Boolean.FALSE.equals(flag)){
        System.out.println("this position is not empty enter again");
        boardClass.printBoard();
        players.addFirst(player);
        continue;
      }
        boolean f=boardClass.checkWinner(row, col, player);
        if(f){
          System.out.println(player.getPlayerName()+" WON ");
          break;
        }
        players.addLast(player);
    }
  }
}
