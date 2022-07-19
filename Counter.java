
public class Counter {
  
  private boolean placed;
  
  public void placeCounter(char player, int position, char[][]board){  
    placed = false;
    if(player == 'r'){
      for(int i=board.length-1; i>=0; i--){
        if(!placed){
          if(board[i][position-1] == 'y'){
            // skip
          }
          else if(board[i][position-1] != 'r'){
            board[i][position-1] = 'r';
            placed = true; 
          }
        }
      }
    }
    else{
      for(int i=board.length-1; i>=0; i--){
        if(!placed){
          if(board[i][position-1] == 'r'){
            // skip
          }
          else if(board[i][position-1] != 'y'){
            board[i][position-1] = 'y'; 
            placed = true;
          } 
        }
      }
    }
  }
}
