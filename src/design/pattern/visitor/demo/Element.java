package design.pattern.visitor.demo;

public interface Element {
    void accept(Visitor visitor);
}
