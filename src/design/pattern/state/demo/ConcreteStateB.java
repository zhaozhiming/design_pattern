package design.pattern.state.demo;

public class ConcreteStateB implements State {
    @Override
    public void handle(Context context) {
        System.out.println("concrete state B handle");
        context.setState(context.getStateA());
    }


    @Override
    public String toString() {
        return "state B";
    }
}
