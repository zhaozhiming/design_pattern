package design.pattern.visitor;

public interface User {
    String accept(Visitor visitor);
}
