package design.pattern.interpreter;

public class IntegerExpression implements Expression {
    @Override
    public int interpret(CalcContext context) {
        return context.getValue(this);
    }

    @Override
    public String getExpression(CalcContext context) {
        return Integer.toString(context.getValue(this));
    }
}
