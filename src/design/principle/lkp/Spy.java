package design.principle.lkp;

public class Spy {
    public Enemy getEnemy() {
        return new Enemy();
    }

    public String getEnemyMessage() {
        return new Enemy().getMessage();
    }
}
