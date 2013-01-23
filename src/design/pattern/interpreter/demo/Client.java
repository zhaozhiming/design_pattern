package design.pattern.interpreter.demo;

public class Client {
    public static void main(String[] args) {
        Context context = new Context();
        TerminalExpression terminalExpression = new TerminalExpression();
        terminalExpression.interpret(context);

        NonTerminalExpression nonTerminalExpression = new NonTerminalExpression();
        nonTerminalExpression.interpret(context);
    }
}
