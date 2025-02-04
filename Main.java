import java.util.Scanner;

class Node{
    String data;
    Node next;

    Node(String data){
        this.data = data;
        this.next = null;
    }
}

public class Main {

    public static void main(String []args){
        Scanner input = new Scanner(System.in);

        Node first = new Node("Rock");
        Node second = new Node("Paper");
        Node third = new Node("Scissors");

        first.next = second;
        second.next = third;
        third.next = first;

        int opposition = (int) ((Math.random() * 2) +1);

     System.out.println("Welcome to rock, paper, scissors! Input your guess of rock, paper, or scissors, and let's see who wins!\nEnter here:");
     String guess = input.nextLine();

        System.out.println("Your opposition rolled: " +  first);
    }
}
//an experiment in the works to use a circularly linked list for rock paper scissors to reduce lines of code