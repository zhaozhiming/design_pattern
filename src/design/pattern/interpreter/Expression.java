package design.pattern.interpreter;

public interface Expression {
    int interpret(CalcContext context);

    String getExpression(CalcContext context);
}
