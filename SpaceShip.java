package Space_RPG;

import java.io.Serializable;
import java.util.Scanner;

public class SpaceShip implements Serializable{
    public float health;
    public int attack;
    public int sheild;
    public String name;
    public SpaceShip(float health, int attack, int sheild, String name){
        this.health = health;
        this.attack = attack;
        this.sheild = sheild;
        this.name = name;
    }
    public SpaceShip sSIntro() throws InterruptedException{
        @SuppressWarnings("resource")
        Scanner scn = new Scanner(System.in);
        System.out.println("Assistant: The most important part of any captain is their ship. \nA genorus, albeit dead, Zoliod was kind enough to donate his ship.\n(press enter to continue to the next dioloug)");
        scn.nextLine();
        System.out.println("Assistant: The dead Zoliod's ship's statistics are: Health: 50, Attack: 3, Shield:50");
        SpaceShip ss = new SpaceShip(50f, 3, 50, null);
        scn.nextLine();
        System.out.println("Assistent: To acsses your ship's stats, type 'q' when prompted with a question/choise");
        String q = scn.nextLine();
        if (q.equals("q")){
            System.out.println("Health:" + ss.health + ", Attack:" + ss.attack + ", Sheild:" + ss.sheild + ".");
            scn.nextLine();
        }
        System.out.println("Assistant: well, every ship deserves a good name, what shall yours be?");
        String name = scn.nextLine();
        ss.name = name;
        return ss;
    }
}
