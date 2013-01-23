package design.pattern.template.method;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class ClientTest {
    @Test
    public void should_return_end_of_year_report_correct() {
        Report report = new EndYearReport();
        String reportContent = report.generate();
        assertThat(reportContent, is("尊敬的领导:\n" +
                "汇报这一年工作的具体内容\n" +
                "在今后的工作中争取更好的成绩\n"
                + "自我总结报告"));
    }

    @Test
    public void should_return_middle_of_year_report_correct() {
        Report report = new MiddleYearReport();
        String reportContent = report.generate();
        assertThat(reportContent, is("尊敬的领导:\n汇报上半年工作的具体内容\n在今后的工作中争取更好的成绩"));
    }

    @Test
    public void should_return_month_work_report_correct() {
        Report report = new MonthReport();
        String reportContent = report.generate();
        assertThat(reportContent, is("尊敬的领导:\n" +
                "汇报这个月的工作情况\n" +
                "在今后的工作中争取更好的成绩\n"
                + "自我总结内容"));
    }
}
