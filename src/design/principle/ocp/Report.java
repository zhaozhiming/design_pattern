package design.principle.ocp;

public class Report {
    private String content;
    private Format format;

    public Report(String content) {
        this.content = content;
    }

    public void setFormat(Format format) {
        this.format = format;
    }

    public void print() {
        if (format == null) {
            throw new RuntimeException("报告格式不正确，无法打印");
        }

        format.use(content);
    }
}
