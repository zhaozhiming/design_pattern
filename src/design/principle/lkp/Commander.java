package design.principle.lkp;

public class Commander {
    private Spy spy;

    public void getEnemyInfo() {
//        spy.getEnemy().getMessage();
        spy.getEnemyMessage();
    }
}
