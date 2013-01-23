package design.pattern.state;

public class FixedState implements BugState {

    @Override
    public String handle(BugManager bugManager) {
        return null;
    }

    @Override
    public String toString() {
        return "修复完成状态";
    }
}
