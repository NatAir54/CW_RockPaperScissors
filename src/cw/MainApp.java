package cw;

/* Rock Paper Scissors
* Let's play! You have to return which player won! In case of a draw return Draw!.
* Examples(Input1, Input2 --> Output):
* "scissors", "paper" --> "Player 1 won!"
* "scissors", "rock" --> "Player 2 won!"
* "paper", "paper" --> "Draw!"
 */

public class MainApp {
    public static void main(String[] args) {
        System.out.println(rps("rock", "scissors"));
        System.out.println(rps("scissors", "paper"));
        System.out.println(rps("paper", "rock"));
        System.out.println(rps("scissors", "rock"));
        System.out.println(rps("paper", "scissors"));
        System.out.println(rps("rock", "paper"));
        System.out.println(rps("scissors", "scissors"));
        System.out.println(rps("paper", "paper"));
        System.out.println(rps("rock", "rock"));
    }

    public static String rps(String p1, String p2) {
        if (p1.equals(p2)) {
            return "Draw!";
        }

        String result = "";

        if (p1.equals("scissors")) {
            result = p2.equals("paper") ? "Player 1 won!" : "Player 2 won!";
        }

        if (p1.equals("rock")) {
            result = p2.equals("scissors") ? "Player 1 won!" : "Player 2 won!";
        }

        if (p1.equals("paper")) {
            result = p2.equals("rock") ? "Player 1 won!" : "Player 2 won!";
        }
        return result;
    }
}
