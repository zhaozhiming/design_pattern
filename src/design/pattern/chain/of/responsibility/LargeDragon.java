package design.pattern.chain.of.responsibility;

public class LargeDragon extends Dragon {
    public LargeDragon() {
        this.attack = 1000;
    }

    @Override
    public String defend(Hero hero) {
        if (hero.getAttack() > attack && successor != null) {
            return "打赢巨龙，可以挑战暗黑龙\n" + successor.defend(hero);
        }
        return "游戏结束，回去再修炼吧";
    }
}
