import java.util.Random;
import java.util.Scanner;

public class Main2 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String[] array = {"Rock", "Paper", "Scissors"};
        String computerMove = array[new Random().nextInt(array.length)];

        System.out.println("Welcome to Rock, Paper, Scissors!\n Enter your move: ");
        String move = input.nextLine();

        System.out.println("Your opponents move: " + computerMove);

        if (move.equals(computerMove)) {
            System.out.println("You tied!");
        } else if (move.equals("Rock")) {
            if (computerMove.equals("Paper"))
                System.out.println("You lost!");
            else if (computerMove.equals("Scissors")) {
                System.out.println("You win!");
            }
        } else if (move.equals("Paper")) {
            if (computerMove.equals("Scissors"))
                System.out.println("You lost!");
            else if (computerMove.equals("Rock")) {
                System.out.println("You win!");
            }
        } else if (move.equals("Scissors")) {
            if (computerMove.equals("Rock"))
                System.out.println("You lost!");
            else if (computerMove.equals("Paper")) {
                System.out.println("You win!");
            }
        }
    }
}