package design.pattern.prototype;

public class Position implements Cloneable {
    private String name;

    public Position(String name) {
        this.name = name;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}
