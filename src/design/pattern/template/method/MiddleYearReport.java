package design.pattern.template.method;

public class MiddleYearReport extends Report {
    @Override
    protected String selfEvaluation() {
        return null;
    }

    @Override
    public String body() {
        return "汇报上半年工作的具体内容";
    }
}
