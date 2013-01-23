package design.pattern.interpreter.demo;

public class TerminalExpression implements AbstractExpression {
    @Override
    public void interpret(Context context) {
        System.out.println("terminal expression interpret");
    }
}
