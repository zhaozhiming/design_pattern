package design.pattern.interpreter;

public class SubExpression extends SignExpression {

    public SubExpression(Expression leftExpression, Expression rightExpression) {
        super(leftExpression, rightExpression);
        expressionFormat = "%d-%d=%d";
    }

    @Override
    public int interpret(CalcContext context) {
        return leftExpression.interpret(context)
                - rightExpression.interpret(context);
    }

}
