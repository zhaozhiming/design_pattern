package design.pattern.iterator;

public class AchievementReportIterator implements Iterator {
    private AchievementReport achievementReport;
    private int index;

    public AchievementReportIterator(AchievementReport AchievementReport) {
        achievementReport = AchievementReport;
    }

    @Override
    public boolean hasNext() {
        return index < achievementReport.size()
                && achievementReport.get(index) != null;
    }

    @Override
    public Achievement next() {
        return achievementReport.get(index++);
    }
}
