package GuessGame;

import java.util.Scanner;

public class Player {
    int number;

    void guessNumber() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Guess the Number: ");
        number = sc.nextInt();
    }
}
