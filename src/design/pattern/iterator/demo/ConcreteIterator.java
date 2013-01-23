package design.pattern.iterator.demo;

public class ConcreteIterator implements Iterator {
    private Aggregate aggregate;
    private int index;

    public ConcreteIterator(Aggregate aggregate) {
        this.aggregate = aggregate;
    }

    @Override
    public boolean hasNext() {
        return index < aggregate.size()
                && aggregate.get(index) != null;
    }

    @Override
    public String next() {
        return aggregate.get(index++);
    }
}
