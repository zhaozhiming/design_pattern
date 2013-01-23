package design.pattern.composite;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertThat;

public class ClientTest {
    @Test(expected = UnsupportedOperationException.class)
    public void should_throw_exception_when_menu_item_add_menu_component() {
        MenuComponent menuComponent = new MenuItem("菜单", "运行菜单功能");
        menuComponent.addMenuComponent(new MenuItem("子菜单", "运行菜单功能"));
    }

    @Test
    public void should_add_menu_component_correct_when_menu_add_menu_component() {
        MenuComponent menuComponent = new Menu("菜单", "打开子菜单");
        MenuComponent subMenu = new MenuItem("子菜单", "运行菜单功能");
        menuComponent.addMenuComponent(subMenu);

        MenuComponent actualMenu = menuComponent.getMenuComponent(0);
        assertThat(actualMenu, is(subMenu));
    }

    @Test(expected = UnsupportedOperationException.class)
    public void should_throw_exception_when_menu_item_remove_menu_component() {
        MenuComponent menuComponent = new MenuItem("菜单", "运行菜单功能");
        menuComponent.removeMenuComponent(new MenuItem("子菜单", "运行菜单功能"));
    }

    @Test
    public void should_remove_menu_component_correct_when_menu_remove_menu_component() {
        MenuComponent menuComponent = new Menu("菜单", "打开子菜单");
        MenuComponent subMenu = new MenuItem("子菜单", "运行菜单功能");
        menuComponent.addMenuComponent(subMenu);
        menuComponent.removeMenuComponent(subMenu);

        MenuComponent actualMenu = menuComponent.getMenuComponent(0);
        assertNull(actualMenu);
    }

    @Test
    public void should_open_menu_correct_when_menu_item_open() {
        MenuComponent menuItem = new MenuItem("菜单项", "运行菜单功能");
        String message = menuItem.open();
        assertThat(message, is("菜单项:运行菜单功能"));
    }

    @Test
    public void should_open_menu_correct_when_menu_open() {
        MenuComponent menu = new Menu("菜单", "打开子菜单");
        menu.addMenuComponent(new MenuItem("子菜单", "运行菜单功能"));

        String message = menu.open();
        String expectMessage = "菜单:打开子菜单\n"
                + "子菜单:运行菜单功能\n";
        assertThat(message, is(expectMessage));
    }
}
