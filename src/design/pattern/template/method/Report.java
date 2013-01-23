package design.pattern.template.method;

public abstract class Report {
    protected boolean isSelfEvaluation;

    public String generate() {
        StringBuilder report = new StringBuilder();
        report.append(head()).append("\n");
        report.append(body()).append("\n");
        report.append(footer());

        if (isSelfEvaluation) {
            report.append("\n");
            report.append(selfEvaluation());
        }

        return report.toString();
    }

    protected abstract String selfEvaluation();

    protected abstract String body();

    private String head() {
        return "尊敬的领导:";
    }

    private String footer() {
        return "在今后的工作中争取更好的成绩";
    }
}
