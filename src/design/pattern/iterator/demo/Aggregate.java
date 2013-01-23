package design.pattern.iterator.demo;

public interface Aggregate {
    int size();

    String get(int index);

    Iterator createIterator();
}
