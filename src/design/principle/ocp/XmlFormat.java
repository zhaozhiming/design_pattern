package design.principle.ocp;

public class XmlFormat implements Format {
    @Override
    public void use(String content) {
        System.out.println("<xml>");
        System.out.println(content);
        System.out.println("</xml>");
    }
}
