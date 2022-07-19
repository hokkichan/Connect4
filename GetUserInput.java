import java.io.BufferedReader;
import java.io.InputStreamReader;

public class GetUserInput {

  private BufferedReader input;
  private int move;

  // Capture user input with BrfferedReader
  public String getInput() {
    input = new BufferedReader(new InputStreamReader(System.in));
    String toReturn = null;
    try {
      toReturn = input.readLine();
    } catch (Exception e) {
      System.out.println("Error: " + e);
    }
    return toReturn;
  }

  public int returnMove(char[][] board) {
    String userInput = getInput();
    // Try to parse user input as string to integer
    try {
      move = Integer.parseInt(userInput);
      // Check whether the integer is valid with reference to board size
      if (move < 1 || move > board[0].length) {
        System.out.println("Error. Please enter an integer between 1 and " + board[0].length + ".");
        returnMove(board);
      }
      // Catch error for non-integer input
    } catch (NumberFormatException e) {
      System.out.println("Error. Please enter an integer.");
      returnMove(board);
    }
    return move;
  }
}
