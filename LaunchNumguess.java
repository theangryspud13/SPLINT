package GuessingGame;
import java.lang.invoke.StringConcatException;

public class LaunchNumguess {
    public void NumguessLanch() throws InterruptedException, StringConcatException{
        //object declaration
        StartNumguess start = new StartNumguess();
        GameNumguess game = new GameNumguess();

        //start method call
        start.start();

        //diff method call
        String diff = start.difficulty();

        //diff ID
        byte diffId = start.diffID(diff);

        //sleep call 
        Thread.sleep(1000);


        //get user data and randome byte
        byte userNum = game.getUserNum(diffId);
        byte random = game.getRandom(diffId);

        //checks if the number is correct
        boolean isCorrect = game.guess(userNum, random);
        
        //if the number is slightly off or by a lot, this method will be called
        if(isCorrect == false){
            game.close(userNum, random);
            Thread.sleep(2000);
        }
    }
}
