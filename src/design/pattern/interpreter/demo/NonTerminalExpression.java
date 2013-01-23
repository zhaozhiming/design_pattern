package design.pattern.interpreter.demo;

public class NonTerminalExpression implements AbstractExpression {
    @Override
    public void interpret(Context context) {
        System.out.println("non terminal expression interpret");
    }
}
