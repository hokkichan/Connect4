public class MyConnectFour {

  private char[][] board;

  public MyConnectFour() {
    board = new char[6][7];
    playGame();
  }

  // Constructor methods to create new objects
  Board bd = new Board();
  CheckWin cw = new CheckWin();
  PrintWelcomeMsg pwm = new PrintWelcomeMsg();
  Counter ct = new Counter();
  GetUserInput gui = new GetUserInput();

  private void playGame() {
    System.out.println(pwm.getMsg());
    bd.printBoard(board);
    boolean win = false;
    while (!win) {
      ct.placeCounter('r', gui.returnMove(board), board);
      // Display message for clear notification of whose's turn
      System.out.println("Player's turn");
      bd.printBoard(board);
      if (cw.checkWinner(board, 'r')) {
        win = true;
        // Display message of player winning
        System.out.println("Player (Red): You Have Won!!!");
      } else {
        // Generate a random move that the computer will place the token
        int computerMove = (int) (Math.random() * (7 - 1)) + 1;
        ct.placeCounter('y', computerMove, board);
        // Display message for clear notification of whose's turn
        System.out.println("Computer's turn");
        bd.printBoard(board);
        if (cw.checkWinner(board, 'y')) {
          win = true;
          // Display message of computer winning
          System.out.println("Computer (Yellow) Has Won!!!");
        }
      }

    }
  }
}