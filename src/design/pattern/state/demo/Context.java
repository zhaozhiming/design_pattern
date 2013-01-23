package design.pattern.state.demo;

public class Context {
    private State state;
    private State stateA;
    private State stateB;

    public Context() {
        stateA = new ConcreteStateA();
        stateB = new ConcreteStateB();
        state = stateA;
    }

    public void request() {
        state.handle(this);
    }

    public State getStateB() {
        return stateB;
    }

    public void setState(State state) {
        this.state = state;
    }

    public State getStateA() {
        return stateA;
    }

    public State getState() {
        return state;
    }
}
