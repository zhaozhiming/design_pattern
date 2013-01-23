package design.pattern.composite.demo;

import java.util.ArrayList;
import java.util.List;

public class Composite extends Component {
    private List<Component> components = new ArrayList<Component>();

    protected Composite(String name) {
        super(name);
    }

    @Override
    public void operation() {
        for (Component component : components) {
            component.operation();
        }
    }

    public void add(Component component) {
        components.add(component);
    }

    public void remove(Component component) {
        components.remove(component);
    }

    public Component getChild(int index) {
        return components.get(index);
    }
}
