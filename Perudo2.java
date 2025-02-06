import java.util.Scanner;
public class Perudo2 {

        public static void main(String[] args) {
            Scanner input = new Scanner(System.in);
            int P1Dice = 6;
            int faceMatch;

            System.out.println("Welcome player 1 to single-player Perudo! You have 6 dice to begin with.");

            while (P1Dice > 0) {
                int[] array1 = new int[P1Dice];
                int[] array2 = new int[P1Dice];
                int[] array3 = new int[P1Dice];

                System.out.println("\nYou rolled: ");
                for (int i = 0; i < P1Dice; i++) {
                    array1[i] = (int) (Math.random() * 6) + 1;
                    System.out.print(array1[i] + " ");
                }

                System.out.println("\n\nEnter your guess for how many dice match a face value.");
                System.out.print("Number of dice: ");
                int dice = input.nextInt();
                System.out.print("Face value: ");
                int faces = input.nextInt();

                System.out.println("Player 2 rolled: ");
                for (int i = 0; i < P1Dice; i++) {
                    array2[i] = (int) (Math.random() * 6) + 1;
                    System.out.print(array2[i] + " ");
                }

                System.out.println("\nPlayer 3 rolled: ");
                for (int i = 0; i < P1Dice; i++) {
                    array3[i] = (int) (Math.random() * 6) + 1;
                    System.out.print(array3[i] + " ");
                }

                // Count matching dice
                faceMatch = 0;
                for (int i = 0; i < P1Dice; i++) {
                    if (array1[i] == faces) faceMatch++;
                    if (array2[i] == faces) faceMatch++;
                    if (array3[i] == faces) faceMatch++;
                }

                System.out.println("\nTotal dice with a face value of " + faces + ": " + faceMatch);

                if (faceMatch < dice) {
                    System.out.println("\nYou lost! You have lost a dice.");
                    P1Dice--;
                } else {
                    System.out.println("\nYou won!");
                }

                // Check if the game should end
                if (P1Dice == 0) {
                    System.out.println("Game over! You have no dice left.");
                }
            }
        }
    }
