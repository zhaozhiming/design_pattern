package design.pattern.iterator.demo;

public class ConcreteAggregate implements Aggregate {
    private String[] strings;

    public ConcreteAggregate(String[] strings) {
        this.strings = strings;
    }

    @Override
    public int size() {
        return strings.length;
    }

    @Override
    public String get(int index) {
        if (index < 0 || index >= strings.length) {
            return null;
        }
        return strings[index];
    }

    @Override
    public Iterator createIterator() {
        return new ConcreteIterator(this);
    }
}
