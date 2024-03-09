import java.io.CharConversionException;
import java.lang.invoke.StringConcatException;
import java.util.Scanner;

public class Kernal{
    public static char q;
    public static void main(String[] args) throws InterruptedException, CharConversionException, StringConcatException{
        @SuppressWarnings("resource")
        Scanner scn = new Scanner(System.in);
        LaunchNumguess numGuess = new LaunchNumguess();

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

        System.out.println("The game options are: Guess the Number\n(Enter the first letter of the game you would like to play)");
        String gameStr = scn.nextLine();
        gameStr.toLowerCase();

        if(gameStr.length() != 1){
            throw new CharConversionException("please provide the first letter of the game you would like to play");
        }

        char game = gameStr.charAt(0);

        if (game == 'g' || game == 'G'){
            numGuess.NumguessLanch();
        }

    }
}