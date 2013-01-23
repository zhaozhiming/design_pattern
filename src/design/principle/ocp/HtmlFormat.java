package design.principle.ocp;

public class HtmlFormat implements Format {
    @Override
    public void use(String content) {
        System.out.println("<html>");
        System.out.println(content);
        System.out.println("</html>");
    }
}
