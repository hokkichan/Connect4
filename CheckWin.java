
public class CheckWin {

  private boolean hasWon = false;

  public boolean checkWinner(char[][] board, char token) {

    int count = 0;
    // check horizontal
    for (int i = 0; i < board.length; i++) {
      for (int j = 0; j < board[i].length; j++) {
        if (board[i][j] == token) {
          count = count + 1;
          if (count >= 4) {
            hasWon = true;
          }
        } else {
          count = 0;
        }
      }
    }
    // check vertical
    count = 0;
    for (int i = 0; i < board[0].length; i++) {
      for (int j = 0; j < board.length; j++) {
        if (board[j][i] == token) {
          count = count + 1;
          if (count >= 4) {
            hasWon = true;
          }
        } else {
          count = 0;
        }
      }
    } // check diagonal
    count = 0;
    for (int i = 1; i < board[0].length+1; i++) {
      for (int j = 1; j < board.length+1 ; j++) {
        if (board[j-1][i - 1] == token) {
          count = count + 1;
          if (count >= 4) {
            hasWon = true;
          }
        } else {
          count = 0;
        }
      }
    }
    count = 0;
    for (int i = 1; i < board[0].length-1; i++) {
      for (int j = 1; j < board.length-1; j++) {
        if (board[j - 1][i + 1] == token) {
          count = count + 1;
          if (count >= 4) {
            hasWon = true;
          }
        } else {
          count = 0;
        }
      }
    }
    return hasWon;
  }
}
