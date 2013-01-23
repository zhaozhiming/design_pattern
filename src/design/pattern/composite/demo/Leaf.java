package design.pattern.composite.demo;

public class Leaf extends Component {
    protected Leaf(String name) {
        super(name);
    }

    @Override
    public void operation() {
        System.out.println(name + ": operation");
    }
}
