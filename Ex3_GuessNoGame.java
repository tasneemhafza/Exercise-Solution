package Exercise;
import java.util.*;

//Question:-
/* Create a class Game, which allows a user to play "Guess the Number"
            game once. Game should have the following methods:
            1. Constructor to generate the random number
            2. takeUserInput() to take a user input of number
            3. isCorrectNumber() to detect whether the number entered by the user is true
            4. getter and setter for noOfGuesses
            Use properties such as noOfGuesses(int), etc to get this task done!
            */

class Game{
    public int number;
    public int inputNumber;
    public int noOfGuesses = 0;

    public int getNoOfGuesses() {
        return noOfGuesses;
    }

    public void setNoOfGuesses(int noOfGuesses) {
        this.noOfGuesses = noOfGuesses;
    }

    Game(){
        Random rand = new Random();
        this.number = rand.nextInt(100);
    }
    void takeUserInput(){
        System.out.print("Guess the number between 0 to 100: ");
        Scanner sc = new Scanner(System.in);
        inputNumber = sc.nextInt();
    }
    
    boolean isCorrectNumber(){
        noOfGuesses++;
        if (inputNumber==number){
            System.out.format("Yes you guessed it right, it was %d\nYou guessed it in %d attempts", number, noOfGuesses);
            return true;
        }
        else if(inputNumber<number){
            System.out.println("too low... Try again!");
        }
        else if(inputNumber<number-2 || inputNumber<number+2 ){
            System.out.println("Pretty close, try again!");
        }
        else if(inputNumber>number){
            System.out.println("Too high... Try again!");
        }
        return false;
    }

}

public class Ex3_GuessNoGame {
    public static void main(String[] args) {
        Game g = new Game();
        boolean b= false;
        while(!b){
        g.takeUserInput();
        b = g.isCorrectNumber();
        }
    }
}
