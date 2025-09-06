import java.util.Scanner;
import java.util.Random;
class Game{
private int number; //The random number to guess
private int noOfGuesses; // Count the Guesses made

//Constructor to generate a random number
public Game(){
Random rand = new Random();
number = rand.nextInt(100) + 1;// Random number between 1 and 100
noOfGuesses = 0;
}
public int takeUserInput(){
Scanner sc = new Scanner(System.in);
System.out.print("Enter Your Guess (1-100): ");
int userInput = sc.nextInt();
noOfGuesses++;
return userInput;
}
//Method to check if guessed number is correct
public boolean isCorrect(int userGuess){
if(userGuess == number){
System.out.println("Congratulations! You guessed the number in " 
+ noOfGuesses + "Attempts");
return true;}
else if (userGuess < number){
    System.out.print("Too low....try again!");
}
else{
System.out.print("Too high....try again!");
}
return false;
}

//Getter for numberOfGuesses
public int getNoOfGuesses(){
return noOfGuesses;
}
}
public class NumberGuessingGame{
 public static void main(){
    Game game = new Game();
    boolean isCorrect = false;
    while(!isCorrect){
    int userGuess = game.takeUserInput();
    isCorrect = game.isCorrect(userGuess);
    }
}
}