import java.util.Scanner;

public class TicTac {
    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);
        String name = scanner.next();

        int num1 = scanner.nextInt();
        int num2 = scanner.nextInt();

        int sum = num1 + num2;

        System.out.println("Hello, " + name);
        System.out.println("Sum is " + sum);

        // prints a tic tac toe game

        System.out.println("O X X");
        System.out.println("O X O");
        System.out.println("X O X");

        // prints numbers from 0 - 9 backwardly
        System.out.print(9 + " ");
        System.out.print(8 + " ");
        System.out.print(7 + " ");
        System.out.print(6 + " ");
        System.out.print(5 + " ");
        System.out.print(4 + " ");
        System.out.print(3 + " ");
        System.out.print(2 + " ");
        System.out.print(1 + " ");
        System.out.println(0 + " ");

        // print some formatted sentence
        System.out.println("WE NEED TO");
        System.out.println();
        System.out.println("LEARN JAVA");
        System.out.println();
        System.out.println("AS QUICKLY AS POSSIBLE");

        // formatted texts
        System.out.print("**");
        System.out.println();
        System.out.println("**");
        System.out.println("**");

        System.out.println("*********");
        System.out.println(" **");
        System.out.println(" **");
        System.out.println("** **");
        System.out.println("** **");
        System.out.print(" ********");

    }
}
