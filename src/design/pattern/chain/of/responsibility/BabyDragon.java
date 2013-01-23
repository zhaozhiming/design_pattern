package design.pattern.chain.of.responsibility;

public class BabyDragon extends Dragon {
    public BabyDragon() {
        this.attack = 500;
    }

    @Override
    public String defend(Hero hero) {
        if (hero.getAttack() > attack && successor != null) {
            return "打赢小龙，可以挑战巨龙\n" + successor.defend(hero);
        }
        return "游戏结束，回去再修炼吧";
    }
}
