package design.principle.ocp;

public class CustomFormat implements Format {
    @Override
    public void use(String content) {
        System.out.println("<custom>");
        System.out.println(content);
        System.out.println("</custom>");
    }
}
