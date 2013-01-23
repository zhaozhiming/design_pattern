package design.pattern.iterator;

public class Achievement {
    private String name;
    private int amount;

    public Achievement(String name, int amount) {
        this.name = name;
        this.amount = amount;
    }

    public String getName() {
        return name;
    }

    public int getAmount() {
        return amount;
    }
}
