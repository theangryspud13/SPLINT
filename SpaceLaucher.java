package Space_RPG;

import java.io.IOException;
import java.io.Serializable;
import java.util.Scanner;

public class SpaceLaucher implements Serializable{
    public SpacePlayer sp = new SpacePlayer(null, null, 0, 0);
    public int checkpoint;
    public void spaceLaunch() throws InterruptedException, ClassNotFoundException, IOException{
        SpaceGame spg = new SpaceGame();
        @SuppressWarnings("resource")
        Scanner scn = new Scanner(System.in);
        Enemy en = new Enemy(null);
        en.easyEnemy(checkpoint);
        System.out.println("Welcome to the Ultimate Space RPG\n(press enter to coninue)");
        scn.nextLine();
        Thread.sleep(500);
        System.out.println("would you like to start a new game or load a previous save? \n(y for load / n to start a new game)");

        String yn = scn.nextLine();
        if (yn.equals("y")) {
            System.out.println("What was the name of your previous charicter?");
            String name = scn.nextLine();
            sp = spg.load(name);
        }
        else {
            spg.intro();
            sp = sp.customization();
            spg.save(sp.playerName);
            SpaceShip ss = new SpaceShip(0, 0, 0, null);
            sp.spaceShip = ss.sSIntro();
        }
        System.out.println(sp);
    }
    public SpacePlayer getPlayer(){
        return sp;
    }
}
