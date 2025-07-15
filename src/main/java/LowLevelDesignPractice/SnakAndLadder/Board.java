package LowLevelDesignPractice.SnakAndLadder;

public class Board {
  Cell[][] cells;
  int snakes;
  int ladder;

  Board(int boardSize, int snakes, int ladder){
    cells=new Cell[boardSize][boardSize];
    this.snakes=snakes;
    this.ladder=ladder;
  }

  private void addSnakesToBoard(){
    //write a while loop until snake size is greater than >0
    // calculate snakehead->generate random number.
    //calculate snaketail->generate random number.
   // useSnakeandladderjum object and assign it to that cell.

  }
  private void addLadderToBoard(){
    //same as above.
  }
}
