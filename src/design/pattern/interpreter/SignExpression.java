package design.pattern.interpreter;

public abstract class SignExpression implements Expression {
    protected Expression leftExpression;
    protected Expression rightExpression;
    protected String expressionFormat;

    public SignExpression(Expression leftExpression, Expression rightExpression) {
        this.leftExpression = leftExpression;
        this.rightExpression = rightExpression;
    }

    @Override
    public String getExpression(CalcContext context) {
        return String.format(expressionFormat,
                leftExpression.interpret(context),
                rightExpression.interpret(context),
                interpret(context));
    }
}
