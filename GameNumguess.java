import java.lang.invoke.StringConcatException;
import java.util.Random;
import java.util.Scanner;

public class GameNumguess {
    private byte a = 1;
    private byte b;
    public byte getRandom(byte id){
        //gets answer number
        Random ran = new Random();
        int ranInt = ran.nextInt(b + 1);
        byte ranByte = (byte)ranInt;

        return ranByte;
    }
    public boolean guess(byte numGuess, byte answer){
        //checks if the user got the exact answer
        if(numGuess == answer){
            System.out.println("Wow! You got the exact number");
            return true;
        }
        else{
            return false;
        }
    
    }
    public byte getUserNum(byte Id) throws StringConcatException{
        //scanner declaration
        @SuppressWarnings("resource")
        Scanner scn = new Scanner(System.in);

        if(Id == 1){
            this.b = 10;
        }
        else if(Id == 2){
            this.b = 50;
        }
        else if(Id == 3){
            this.b = 100;
        }
        else {
            throw new StringConcatException("Please enter the provided dificulties");
        }

        //ask user
        System.out.println("Guess a number between " + a + " and " + b);
        String inStr = scn.nextLine();

        //try-catch to make sure the number does not exceed the byte number limit
        try{
            Byte.parseByte(inStr);
        } catch (NumberFormatException e){
            System.out.println("Your number was too large!");
        }

        //re-parse of the user number
        byte inByte = Byte.parseByte(inStr);

        //checks if user's number is within the range
        if (inByte > this.b){
            throw new ArithmeticException("Your number is too large!");
        }
        else if (inByte < 1){
            throw new ArithmeticException("your number is too small!");
        }
        return inByte;
    }

    public void close(byte numGuess, byte answer){
        //gets the distance between the user number and the actual number
        byte distance = (byte) Math.abs(numGuess - answer);

        //different responses depending on how close the user number was
        if(distance <= 5){
            System.out.println("So close! you were " + distance + " off. The answer was: " + answer);
        }
        else if(distance <= 15){
            System.out.println("Close! the number was: " + answer);
        }
        else if(distance <= 50){
            System.out.println("Better luck next time, the number was: " + answer);
        }
        else{
            System.out.println("Unlucky! The answer was: " + answer);
        }
    }
}
