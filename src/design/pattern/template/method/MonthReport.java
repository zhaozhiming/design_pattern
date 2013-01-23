package design.pattern.template.method;

public class MonthReport extends Report {
    public MonthReport() {
        isSelfEvaluation = true;
    }

    @Override
    protected String selfEvaluation() {
        return "自我总结内容";
    }

    @Override
    protected String body() {
        return "汇报这个月的工作情况";
    }
}
