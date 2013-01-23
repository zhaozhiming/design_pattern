package design.pattern.decorator.demo;

public class ConcreteComponent extends Component {
    @Override
    public void operation() {
        System.out.println("concrete component operation");
    }
}
