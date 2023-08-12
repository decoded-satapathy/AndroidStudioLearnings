// package javaBasics;
import java.util.*;
public class numberGuesser {
    
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Random rd = new Random();

        System.out.println("Hello and welcome to this game of Number guesser"+
        "\nIn this game you need to guess an randomly generated number in 5 tries,"+ 
        "if you fail, it's game over.");
        
        System.out.println("Would you be kind enough to enter your name: ");

        String usrName = new String();
        usrName = sc.next();
        System.out.print("Hello "+usrName+" ");

        System.out.println("Would you like to play ?? [y/n]");
        char choice = sc.next().charAt(0);
        int i=0;
        int numberToBeGuessed=0;
        if(choice == 'y'){
            numberToBeGuessed = rd.nextInt(21);
            System.out.println("The randomly generated number is between 0 to 20 (both inlcusive)");

            for(i=0 ; i<5 ; i++){
                System.out.println("Enter your guess: ");
                int guessedNumber = sc.nextInt();

                if(guessedNumber == numberToBeGuessed){
                    System.out.println("Congratulations!! You guessed the number in "+(i+1)+ " tries");
                    i =5;
                    break;
                }
                else if(i==4){
                    break;
                }
                
                else if (guessedNumber>numberToBeGuessed){
                    System.out.println("Wrong answer!\nHint:Guess lower");
                    System.out.println("Tries Remaining : "+(4-i));
                }
                else{
                    System.out.println("Wrong answer!\nHint:Guess higher");
                    System.out.println("Tries Remaining : "+(4-i));
                }
            }
            
        }
        if(i==4){
            System.out.println("Game over!!");
            System.out.println("The number was "+numberToBeGuessed);
        }
        System.out.println("Thank you for playing this game with us");

        sc.close();
    }
}
