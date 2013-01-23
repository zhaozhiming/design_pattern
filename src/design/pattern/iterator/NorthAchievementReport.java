package design.pattern.iterator;

public class NorthAchievementReport implements AchievementReport {
    private Achievement[] achievements;

    public NorthAchievementReport(Achievement[] achievements) {
        this.achievements = achievements;
    }

    @Override
    public Iterator createIterator() {
        return new AchievementReportIterator(this);
    }

    @Override
    public int size() {
        return achievements.length;
    }

    @Override
    public Achievement get(int index) {
        if (0 <= index && index < achievements.length) {
            return achievements[index];
        }
        return null;
    }

    @Override
    public String print() {
        StringBuilder report = new StringBuilder();
        report.append("北区业绩报告:\n");
        Iterator iterator = createIterator();
        int totalAmount = 0;
        while (iterator.hasNext()) {
            Achievement achievement = iterator.next();
            report.append("名称 : ").append(achievement.getName())
                    .append(", 金额 : ").append(achievement.getAmount())
                    .append("\n");
            totalAmount += achievement.getAmount();
        }
        report.append("总销售额 : ").append(totalAmount);
        return report.toString();
    }
}
