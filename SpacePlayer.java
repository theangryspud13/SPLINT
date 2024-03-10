package Space_RPG;
import java.io.Serializable;
import java.util.Scanner;

public class SpacePlayer implements Serializable {
    public SpaceShip spaceShip;
    public String playerName;
    public int age;
    public int gender;

    public SpacePlayer() {
        // Default constructor
    }

    public SpacePlayer(SpaceShip spaceShip, String playerName, int age, int gender) {
        this.spaceShip = spaceShip;
        this.playerName = playerName;
        this.age = age;
        this.gender = gender;
    }

    public SpacePlayer customization() throws InterruptedException {
        String yn;
        @SuppressWarnings("resource")
        Scanner scn = new Scanner(System.in);

        System.out.println("What shall we call you, captain?");
        String pName = scn.nextLine();
        System.out.println("Welcome, " + pName + ". Am I pronouncing your name right?\n(y/n)");
        yn = scn.nextLine().toLowerCase();

        if (yn.equals("n")) {
            // Recursively call customization until a valid input is received
            return customization();
        }

        System.out.println("We're almost there, what is your age?");
        int playerAge = scn.nextInt();
        scn.nextLine(); // Consume the newline character

        if (playerAge >= 80) {
            System.out.println("Well, I suppose it's never too late!");
        } else if (playerAge >= 50 && playerAge < 80) {
            System.out.println("That will do just fine");
        } else if (playerAge >= 20 && playerAge < 50) {
            System.out.println("Perfect!");
        } else if (playerAge >= 1 && playerAge < 20) {
            System.out.println("Well, it is best to start early!");
        } else {
            System.out.println("That's not a valid age!");
            System.exit(0);
        }

        Thread.sleep(1000);
        System.out.println("Last question, what is your gender?");
        String gen = scn.nextLine().toLowerCase();

        int genInt;

        if (gen.equals("male") || gen.equals("man") || gen.equals("m")) {
            genInt = 1;
        } else if (gen.equals("female") || gen.equals("woman") || gen.equals("w")) {
            genInt = 2;
        } else {
            genInt = 0;
        }

        return new SpacePlayer(null, pName, playerAge, genInt);
    }
}
