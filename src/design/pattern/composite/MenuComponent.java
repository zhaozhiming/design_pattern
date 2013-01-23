package design.pattern.composite;

public abstract class MenuComponent {
    protected String name;
    protected String operation;

    protected MenuComponent(String name, String operation) {
        this.name = name;
        this.operation = operation;
    }


    public void addMenuComponent(MenuComponent menuComponent) {
        throw new UnsupportedOperationException("不支持该操作");
    }

    public MenuComponent getMenuComponent(int index) {
        throw new UnsupportedOperationException("不支持该操作");
    }

    public void removeMenuComponent(MenuComponent menuComponent) {
        throw new UnsupportedOperationException("不支持该操作");
    }

    public abstract String open();
}
