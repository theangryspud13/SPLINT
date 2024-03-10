package GuessingGame;
import java.util.Scanner;

public class StartNumguess {
    public void start() throws InterruptedException{
        //scanner declaration for enter key
        @SuppressWarnings("resource")
        Scanner scn = new Scanner(System.in);
        
        //ask the user
        System.out.println("Welcome to the Number Guessing Game \n(press enter to continue)\n");

        //waits for enter key
        scn.nextLine();

        //sleep call
        Thread.sleep(1000);
    }
    public String difficulty(){
        //scanner declaration
        @SuppressWarnings({ "resources", "resource" })
        Scanner scn = new Scanner(System.in);
        

        //ask user
        System.out.println("what difficulty would you like?\n(easy, medium, hard)");
        String diff = scn.nextLine();

        diff = diff.toLowerCase();

        return diff;
    }
    public byte diffID(String diff){
        if(diff.equals("easy")){
            return 1;
        }
        else if(diff.equals("medium")){
            return 2;
        }
        else if(diff.equals("hard")){
            return 3;
        }
        else{
            return 0;
        }
    }
    public void diffKern(byte id){
        
    }
}
