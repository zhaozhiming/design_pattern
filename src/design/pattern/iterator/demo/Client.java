package design.pattern.iterator.demo;

public class Client {
    public static void main(String[] args) {
        String[] strings = {"a", "b", "c", "d"};
        Aggregate aggregate = new ConcreteAggregate(strings);
        Iterator iterator = aggregate.createIterator();
        while (iterator.hasNext()) {
            System.out.print(iterator.next() + ",");
        }
    }
}
