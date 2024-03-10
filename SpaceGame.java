package Space_RPG;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class SpaceGame implements Serializable {
    private static final long serialVersionUID = 1L;

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
    public SpaceShip tutorialMission(){
        System.out.println();
        return null;
    }
}
