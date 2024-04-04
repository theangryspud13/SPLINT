import java.io.CharConversionException;
import java.io.IOException;
import java.lang.invoke.StringConcatException;
import java.util.Scanner;
import javax.management.RuntimeErrorException;
import GuessingGame.LaunchNumguess;
import Space_RPG.SpaceLaucher;

public class Kernal{

    @SuppressWarnings("resource")
    public static void main(String[] args) throws InterruptedException, StringConcatException, ClassNotFoundException, IOException{
        Scanner scn = new Scanner(System.in);
        LaunchNumguess numGuess = new LaunchNumguess();
        SpaceLaucher spcLaunch = new SpaceLaucher();
        byte c = 0;
        while (c == 0){

            System.out.println("          _____                    _____                    _____            _____                    _____                _____          \r\n" + //
                            "         /\\    \\                  /\\    \\                  /\\    \\          /\\    \\                  /\\    \\              /\\    \\         \r\n" + //
                            "        /::\\    \\                /::\\    \\                /::\\____\\        /::\\    \\                /::\\____\\            /::\\    \\        \r\n" + //
                            "       /::::\\    \\              /::::\\    \\              /:::/    /        \\:::\\    \\              /::::|   |            \\:::\\    \\       \r\n" + //
                            "      /::::::\\    \\            /::::::\\    \\            /:::/    /          \\:::\\    \\            /:::::|   |             \\:::\\    \\      \r\n" + //
                            "     /:::/\\:::\\    \\          /:::/\\:::\\    \\          /:::/    /            \\:::\\    \\          /::::::|   |              \\:::\\    \\     \r\n" + //
                            "    /:::/__\\:::\\    \\        /:::/__\\:::\\    \\        /:::/    /              \\:::\\    \\        /:::/|::|   |               \\:::\\    \\    \r\n" + //
                            "    \\:::\\   \\:::\\    \\      /::::\\   \\:::\\    \\      /:::/    /               /::::\\    \\      /:::/ |::|   |               /::::\\    \\   \r\n" + //
                            "  ___\\:::\\   \\:::\\    \\    /::::::\\   \\:::\\    \\    /:::/    /       ____    /::::::\\    \\    /:::/  |::|   | _____        /::::::\\    \\  \r\n" + //
                            " /\\   \\:::\\   \\:::\\    \\  /:::/\\:::\\   \\:::\\____\\  /:::/    /       /\\   \\  /:::/\\:::\\    \\  /:::/   |::|   |/\\    \\      /:::/\\:::\\    \\ \r\n" + //
                            "/::\\   \\:::\\   \\:::\\____\\/:::/  \\:::\\   \\:::|    |/:::/____/       /::\\   \\/:::/  \\:::\\____\\/:: /    |::|   /::\\____\\    /:::/  \\:::\\____\\\r\n" + //
                            "\\:::\\   \\:::\\   \\::/    /\\::/    \\:::\\  /:::|____|\\:::\\    \\       \\:::\\  /:::/    \\::/    /\\::/    /|::|  /:::/    /   /:::/    \\::/    /\r\n" + //
                            " \\:::\\   \\:::\\   \\/____/  \\/_____/\\:::\\/:::/    /  \\:::\\    \\       \\:::\\/:::/    / \\/____/  \\/____/ |::| /:::/    /   /:::/    / \\/____/ \r\n" + //
                            "  \\:::\\   \\:::\\    \\               \\::::::/    /    \\:::\\    \\       \\::::::/    /                   |::|/:::/    /   /:::/    /          \r\n" + //
                            "   \\:::\\   \\:::\\____\\               \\::::/    /      \\:::\\    \\       \\::::/____/                    |::::::/    /   /:::/    /           \r\n" + //
                            "    \\:::\\  /:::/    /                \\::/____/        \\:::\\    \\       \\:::\\    \\                    |:::::/    /    \\::/    /            \r\n" + //
                            "     \\:::\\/:::/    /                                   \\:::\\    \\       \\:::\\    \\                   |::::/    /      \\/____/             \r\n" + //
                            "      \\::::::/    /                                     \\:::\\    \\       \\:::\\    \\                  /:::/    /                           \r\n" + //
                            "       \\::::/    /                                       \\:::\\____\\       \\:::\\____\\                /:::/    /                            \r\n" + //
                            "        \\::/    /                                         \\::/    /        \\::/    /                \\::/    /                             \r\n" + //
                            "         \\/____/                                           \\/____/          \\/____/                  \\/____/                              ");
            System.out.println("Welcom to Spud's Programming Library for Interactive Narratives and Text-based adventures (SPLINT)\n");

            Thread.sleep(1500);

            System.out.println("The game options are: Guess the Number or Space Adventure\n(Enter the first letter of the game you would like to play)");
            String gameStr = scn.nextLine();

            if(gameStr.length() != 1){
                throw new CharConversionException("please provide the first letter of the game you would like to play");
            }

            char game = gameStr.charAt(0);

            if (game == 'g' || game == 'G'){
                numGuess.NumguessLanch();
            }
            else if(game == 's' || game == 'S'){
                spcLaunch.spaceLaunch();
            }
            
            System.out.println("Would you like to return to the menu? \n(y/n)");
            String yn = scn.nextLine();

            if (yn.equals("y")){
                c = 0;
            }
            else if (yn.equals("n")){
                System.exit(0);
            }
            else {
                throw new RuntimeErrorException(null, "Please select yes or no");
            }
        }
    }
}
