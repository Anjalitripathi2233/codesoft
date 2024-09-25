
import java.util.Random;
import java.util.Scanner;

public class RandomGuess {


    static String BrightRed = "\u001b[31;1m";
    static String Yellow = "\u001b[33m";  
    static String Green = "\u001b[32m";
    static String BrightWhite = "\u001b[37;1m";
    static String BrightMagenta = "\u001b[35;1m";
    static String Reset = "\u001b[0m";    
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

           System.out.println(BrightMagenta + "\n\n\t\t---------------WELCOME TO RANDOM GAME---------------" + Reset);
            System.out.println(BrightRed + "\n\n\nRules of the Game:" + Reset);
            System.out.println(BrightWhite + "\t1.Guess a Number in range 1 To 100.");
            System.out.println("\t2.You have 5 life to guess correct answer.");
            System.out.println("\t3.Each right guess Award's you with a point\n\n" + Reset);

        int score = 0;
        boolean playAgain = true;

        while (playAgain) {
            int targetNumber = random.nextInt(10) + 1;
            int attempts = 0;
            int maxAttempts = 5;

            System.out.println(BrightWhite + "\nMachine have generated a number between 1 and 100. Can you guess it?" + Reset);

            while (attempts < maxAttempts) {
                System.out.print("\nEnter your guess: ");
                int userGuess = scanner.nextInt();
                scanner.nextLine();

                attempts++;

                if (userGuess == targetNumber) {
                    System.out.println(Green + "Congratulations! You guessed the number " + targetNumber + " in " + attempts + " attempts.");
                    score++;
                    break;
                } else if (userGuess < targetNumber) {
                    System.out.println(BrightRed + "Too low! Try again." + Reset);
                } else {
                    System.out.println(BrightRed + "Too high! Try again." + Reset);
                }
            }

            if (attempts >= maxAttempts) {
                System.out.println("\nSorry, you've run out of attempts. The correct number was " + targetNumber + "." + Reset);
            }

            System.out.print(Yellow + "\nDo you want continue plaing? (yes/no): ");
            String playAgainInput = scanner.nextLine();
            playAgain = playAgainInput.equalsIgnoreCase("yes");
        }

        System.out.print(Yellow+ "\nGame over! "+Reset);
        System.out.println(Green+ "\t\t\t\tYour score: " +score);

        scanner.close();
    }
}