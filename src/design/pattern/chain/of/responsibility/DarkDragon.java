package design.pattern.chain.of.responsibility;

public class DarkDragon extends Dragon {
    public DarkDragon() {
        this.attack = 2000;
    }

    @Override
    public String defend(Hero hero) {
        if (hero.getAttack() > attack) {
            return "恭喜,你打赢了所有恶龙，可以去解救你的公主了";
        }
        return "游戏结束，回去再修炼吧";
    }
}
