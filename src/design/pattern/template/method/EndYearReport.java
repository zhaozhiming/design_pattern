package design.pattern.template.method;

public class EndYearReport extends Report {
    public EndYearReport() {
        isSelfEvaluation = true;
    }

    @Override
    protected String selfEvaluation() {
        return "自我总结报告";
    }

    @Override
    public String body() {
        return "汇报这一年工作的具体内容";
    }

}
