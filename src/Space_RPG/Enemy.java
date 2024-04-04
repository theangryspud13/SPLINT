package Space_RPG;

import java.util.Random;
public class Enemy {

    public SpaceShip ss;
    int maxH, minH, minS, maxS, minA, maxA;

    public Enemy(SpaceShip ss){
        this.ss = ss;
    }
    public Enemy getEnemy(int checkpoint){
        Random ran = new Random();
        int ranInt = ran.nextInt(4);
        byte ranByte = (byte)ranInt;
        if (ranByte == 0){
            ranByte = 1;
        }

        if (ranByte == 3){
            Enemy en = medeiumEnemy(checkpoint);
            return en;
        }
        else {
            Enemy en = easyEnemy(checkpoint);
            return en;
        }
    }
    public Enemy easyEnemy(int checkpoint){
        if (checkpoint == 0){
            maxH = 20;
            minH = 10;
            maxS = 10;
            int health = (int) (Math.random() * (maxH - minH + 1) + minH);
            int sheild = (int) (Math.random() * (maxS - minS + 1) + minS);
            int attack = 1;
            SpaceShip ss = new SpaceShip(health, attack, sheild, "Frigate");
            Enemy en = new Enemy(ss);
            return en;
        }
        return null;
    }
    public Enemy medeiumEnemy(int checkpoint){
        if (checkpoint == 0){
            maxH = 30;
            minH = 20;
            maxS = 15;
            minS = 5;
            int health = (int) (Math.random() * (maxH - minH + 1) + minH);
            int sheild = (int) (Math.random() * (maxS - minS + 1) + minS);
            int attack = 2;
            SpaceShip ss = new SpaceShip(health, attack, sheild, "Cruser");
            Enemy en = new Enemy(ss);
            return en;
        }
        return null;
    }
}