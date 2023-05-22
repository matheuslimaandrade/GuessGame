package GuessGame;

public class GuessGame {
    Player p1;
    Player p2;
    Player p3;

    void startGame() {
        p1 = new Player();
        p2 = new Player();
        p3 = new Player();

        int guessNumberP1;
        int guessNumberP2;
        int guessNumberP3;

        boolean p1IsRight = false;
        boolean p2IsRight = false;
        boolean p3IsRight = false;

        int numberToGuess = (int) (Math.random() * 10);
        System.out.println("Guess a number between 1 and 9!");

        while (true) {
            p1.guessNumber();
            p2.guessNumber();
            p3.guessNumber();

            guessNumberP1 = p1.number;
            System.out.println("Player 1 guess number is: " + p1.number);
            guessNumberP2 = p2.number;
            System.out.println("Player 2 guess number is: " + p2.number);
            guessNumberP3 = p3.number;
            System.out.println("Player 3 guess number is: " + p3.number);

            if (guessNumberP1 == numberToGuess) {
                p1IsRight = true;
            } if (guessNumberP2 == numberToGuess) {
                p2IsRight = true;
            } if (guessNumberP3 == numberToGuess) {
                p3IsRight = true;
            }

            if (p1IsRight || p2IsRight || p3IsRight) {
                System.out.println(" ");
                System.out.println("We have a winner :)");
                System.out.println(" ");
                System.out.println("Player 1 wins?: " + p1IsRight);
                System.out.println("Player 2 wins?: " + p2IsRight);
                System.out.println("Player 3 wins?: " + p3IsRight);
                System.out.println(" ");
                System.out.println("End game :)");
                break;
            } else {
                System.out.println("We don't have a winner, try again :(");
            }
        }
    }
}
