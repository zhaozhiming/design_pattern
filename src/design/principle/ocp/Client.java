package design.principle.ocp;

public class Client {
    public static void main(String[] args) {
        Report report = new Report("这是个测试文件");
        report.setFormat(new HtmlFormat());
        report.print();
    }
}
