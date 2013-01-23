package design.pattern.iterator;

public interface AchievementReport {
    Iterator createIterator();

    int size();

    Achievement get(int index);

    String print();
}
