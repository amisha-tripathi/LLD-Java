package LowLevelDesignPractice.SnakAndLadder;

import java.util.ArrayDeque;

public class Game {
  Board board;
  Dice dice;
  ArrayDeque<Player> dq;

  Player winner;

  Game(){
    board=new Board(10, 5, 4);
    dice=new Dice(1);
    winner=null;
    Player p1=new Player(1, 0);
    Player p2=new Player(1, 0);
    dq.offer(p1);
    dq.offer(p2);
  }

  public void StartGame(){
    while(winner==null){
      //find player turn.
      Player currPlayer=dq.getFirst();
      dq.offerLast(currPlayer);

      //rolling dice:
      int dicenumber=dice.rolledDiceNumber();
      currPlayer.currPos+=dicenumber;
      //now find on this currPosition cell is SnakeAndLadderJump object null or not and accordingly move to that cell and update currposition to that.
      //just check if this new position is the winner.
    }
  }

}
