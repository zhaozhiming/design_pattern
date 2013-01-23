package design.pattern.interpreter;

import java.util.HashMap;
import java.util.Map;

public class CalcContext {
    private Map<Expression, Integer> expressions = new HashMap<Expression, Integer>();

    public void assign(Expression expression, int value) {
        expressions.put(expression, value);
    }

    public int getValue(Expression expression) {
        return expressions.get(expression);
    }
}
