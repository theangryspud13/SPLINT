package Space_RPG;

public class Enemy {

    public SpaceShip ss;
    int maxH, minH, minS, maxS, minA, maxA;

    public Enemy(SpaceShip ss){
        this.ss = ss;
    }
    public Enemy easyEnemy(int checkpoint){
        if (checkpoint == 0){
            maxH = 20;
            minH = 10;
            maxS = 10;
            int health = (int) (Math.random() * (maxH - minH + 1) + minH);
            int sheild = (int) (Math.random() * (maxS - minS + 1) + minS);
            int attack = 1;
            SpaceShip ss = new SpaceShip(health, attack, sheild, "Small Frigate");
            Enemy en = new Enemy(ss);
            return en;
        }
        return null;
    }
}