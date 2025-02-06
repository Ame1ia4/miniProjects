import java.util.Scanner;

public class Perudo {

        public static void main (String []args) {
            Scanner input = new Scanner(System.in);
            int P1Dice = 6;
            int faceMatch = 0;

            System.out.println("Welcome player 1 to single player Perudo! You have 6 die to begin with.");
            System.out.println("You rolled: ");

            int[] array1 = new int[6];
            int[] array2 = new int[6];
            int[] array3 = new int[6];

            for (int i = 0; i < P1Dice; i++) {
                int outcomeP1 = (int) (Math.random() * 6) + 1;
                array1[i] = outcomeP1;
                System.out.print(array1[i] + " ");
            }

            while (P1Dice > 0) {
                System.out.println("\nEnter your guess for the maximum number of repeated face value rolls.\nDice: ");
                int dice = input.nextInt();
                System.out.println("Face value: ");
                int faces = input.nextInt();

                System.out.println("Player 2 rolled: ");
                for (int i = 0; i < P1Dice; i++) {
                    int outcomeP1 = (int) (Math.random() * 6) + 1;
                    array2[i] = outcomeP1;
                    System.out.print(array2[i] + " ");
                }

                System.out.println("\nPlayer 3 rolled: ");
                for (int i = 0; i < P1Dice; i++) {
                    int outcomeP1 = (int) (Math.random() * 6) + 1;
                    array3[i] = outcomeP1;
                    System.out.print(array3[i] + " ");
                }

                for (int i = 0; i < 6; i++) {
                    if (array1[i] == faces){
                        faceMatch++;
                    }
                    if (array2[i] == faces){
                        faceMatch++;
                    }
                    if (array3[i] == faces) {
                        faceMatch++;
                    }
                }

                if (faceMatch < dice){
                    System.out.println("\nYou lost. There were " + faceMatch + " die with face value of " + faces);
                    P1Dice--;
                }
                else if (faceMatch > dice ) {
                    System.out.println("\nYou won!");
                }

            }
        }
    }

    //make it so 1 dice get deducted when you guess wrong
//make it so that guess is dice and faces rather than maximum no.
//make it so that p2 and 3 are math random
//max and min p1,2,3 rolls



