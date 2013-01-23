package design.pattern.visitor.demo;

import java.util.ArrayList;
import java.util.List;

public class ObjectStructure {
    private List<Element> elements = new ArrayList<Element>();

    public void addElement(Element element) {
        elements.add(element);
    }

    public void visit(Visitor visitor) {
        for (Element element : elements) {
            element.accept(visitor);
        }
    }
}
