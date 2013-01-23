package design.pattern.composite;

public class MenuItem extends MenuComponent {
    public MenuItem(String name, String operation) {
        super(name, operation);
    }

    @Override
    public String open() {
        return name + ":" + operation;
    }
}
