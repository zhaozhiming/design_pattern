package design.pattern.composite.demo;

public abstract class Component {
    protected String name;

    protected Component(String name) {
        this.name = name;
    }

    public abstract void operation();

}
