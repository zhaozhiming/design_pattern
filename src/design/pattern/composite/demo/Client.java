package design.pattern.composite.demo;

public class Client {
    public static void main(String[] args) {
        Component root = new Composite("root");

//        root.add(new Leaf("leaf1"));
//        root.add(new Leaf("leaf2"));
//        root.add(new Leaf("leaf3"));

        root.operation();
    }

    public void invoke(Component component) {
        if (component instanceof Composite) {
            Component child = ((Composite) component).getChild(0);
        } else if (component instanceof Leaf) {
            throw new UnsupportedOperationException("不支持该操作");
        }
    }
}
