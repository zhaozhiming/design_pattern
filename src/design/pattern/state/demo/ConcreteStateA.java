package design.pattern.state.demo;

public class ConcreteStateA implements State {
    @Override
    public void handle(Context context) {
        System.out.println("concrete state A handle");
        context.setState(context.getStateB());
    }

    @Override
    public String toString() {
        return "state A";
    }
}
