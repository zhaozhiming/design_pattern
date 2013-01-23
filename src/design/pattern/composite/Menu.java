package design.pattern.composite;

import java.util.ArrayList;
import java.util.List;

public class Menu extends MenuComponent {
    private List<MenuComponent> menuComponents = new ArrayList<MenuComponent>();

    public Menu(String name, String operation) {
        super(name, operation);
    }

    @Override
    public void addMenuComponent(MenuComponent menuComponent) {
        menuComponents.add(menuComponent);
    }

    @Override
    public MenuComponent getMenuComponent(int index) {
        return (menuComponents.size() != 0) ?
                menuComponents.get(index) : null;
    }

    @Override
    public void removeMenuComponent(MenuComponent menuComponent) {
        menuComponents.remove(menuComponent);
    }

    @Override
    public String open() {
        StringBuilder message = new StringBuilder();
        message.append(name).append(":").append(operation).append("\n");
        for (MenuComponent menuComponent : menuComponents) {
            message.append(menuComponent.open()).append("\n");
        }
        return message.toString();
    }
}
