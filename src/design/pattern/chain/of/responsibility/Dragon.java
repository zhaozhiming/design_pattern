package design.pattern.chain.of.responsibility;

public abstract class Dragon {
    protected Dragon successor;
    protected int attack;

    public void setSuccessor(Dragon successor) {
        this.successor = successor;
    }

    public abstract String defend(Hero hero);
}
