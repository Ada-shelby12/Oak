import java.util.Random;
import java.util.Scanner;

public class RockPaperScissors {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        String[] options = {"Rock", "Paper", "Scissors"};
        boolean playAgain = true;

        System.out.println("Welcome to Rock, Paper, Scissors!");

        while (playAgain) {
            System.out.println("\nChoose Rock, Paper, or Scissors:");
            System.out.print("Your choice: ");
            String playerChoice = scanner.nextLine().trim().toLowerCase();

            // Validate player's input
            if (!playerChoice.equals("rock") && !playerChoice.equals("paper") && !playerChoice.equals("scissors")) {
                System.out.println("Invalid choice. Please choose Rock, Paper, or Scissors.");
                continue;
            }

            // Generate computer's choice
            String computerChoice = options[random.nextInt(3)];

            System.out.println("Computer chose: " + computerChoice);

            // Determine the winner
            if (playerChoice.equals(computerChoice.toLowerCase())) {
                System.out.println("It's a tie!");
            } else if (
                (playerChoice.equals("rock") && computerChoice.equals("Scissors")) ||
                (playerChoice.equals("paper") && computerChoice.equals("Rock")) ||
                (playerChoice.equals("scissors") && computerChoice.equals("Paper"))
            ) {
                System.out.println("You win!");
            } else {
                System.out.println("You lose!");
            }

            // Ask to play again
            System.out.print("Do you want to play again? (yes/no): ");
            String response = scanner.nextLine().trim().toLowerCase();

            if (response.equals("no")) {
                playAgain = false;
                System.out.println("Thanks for playing! Goodbye!");
            }
        }

        scanner.close();
    }
}
