package Space_RPG;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.Scanner;

public class SpaceGame implements Serializable {
    private static final long serialVersionUID = 1L;

    Enemy en = new Enemy(null);

    public void intro() throws InterruptedException {
        System.out.println("The year is 2357, an evil alien race of spider-like creatures called Zolioids rule the galaxy.\nIt is up to you, captain, to save humanity!");
        Thread.sleep(1500);
    }
    public void save(String name) {
        SpaceLaucher spl = new SpaceLaucher();
        SpacePlayer ss = spl.getPlayer();

        try (FileOutputStream fos = new FileOutputStream(name + ".sav3");
             ObjectOutputStream os = new ObjectOutputStream(fos)) {
            os.writeObject(ss);
        } catch (IOException e) {
            e.printStackTrace();
            System.out.println("There was a save oopsie");
        }
    }
    public SpacePlayer load(String name) throws IOException, ClassNotFoundException{
        FileInputStream fid = new FileInputStream(name + ".sav3");
        @SuppressWarnings("resource")
        ObjectInputStream ois = new ObjectInputStream(fid);

        SpacePlayer deSer = (SpacePlayer)ois.readObject();
        return deSer;
    }
    public SpaceShip tutorialMission(SpacePlayer sp){
        System.out.println("Assistant: Well, " + sp.playerName + ", it is time to embark on your fist mission!\nWe are entering Zolioid space, be prepaired.");
        printStats(sp.spaceShip);
        boolean tempBool = true;
        en = en.getEnemy(0);
        if(en.ss.name.equals("Cruser")){
            System.out.println("Assistant: A Zolioid cruser is aproaching! this will be a true test of your skill");
            printStats(sp.spaceShip);
        }
        else if(en.ss.name.equals("Frigate")){
            System.out.println("Assistant: A Zolioid frigate is aproaching, this should be a peice of cake.");
            printStats(sp.spaceShip);
        }
        while(tempBool = true){
            System.out.println("Assistant: Scan the enemy by pressing 's' to see the enemy's ship's stats");
            String conf = menuOptions(sp);
            if (conf == null){
                System.out.println("plese enter a valid letter");
            } else if (conf != null){
                tempBool = false;
            }
            if (conf.equals("q")){
                conf = menuOptions(sp);
            }

            if (conf.equals("s")){
                System.out.println("Good, now ");
            }
        }

        
        return null;
    }
    public void printStats(SpaceShip ss){
        @SuppressWarnings("resource")
        Scanner scn = new Scanner(System.in);
        String q = scn.nextLine();
        if (q.equals("q")){
            System.out.println("Health:" + ss.health + ", Attack:" + ss.attack + ", Sheild:" + ss.sheild + ".");
            scn.nextLine();
        }
    }
    public String menuOptions(SpacePlayer sp){
        @SuppressWarnings("resource")
        Scanner scn = new Scanner(System.in);
        String options = scn.nextLine();

        if (options.equals("q")){
            System.out.println("Health:" + sp.spaceShip.health + ", Attack:" + sp.spaceShip.attack + ", Sheild:" + sp.spaceShip.sheild + ".");
            scn.nextLine();
            return "q";
        }
        else if (options.equals("s")){
            System.out.println("Health:" + en.ss.health + ", Attack:" + en.ss.attack + ", Sheild:" + en.ss.sheild + ".");
            return "s";
        }
        else{
            return null;
        }
    }
}
