package design.pattern.flyweight.demo;

import java.util.ArrayList;
import java.util.List;

public class UnsharedConcreteFlyweight implements Flyweight {
    private List<Flyweight> flyweights = new ArrayList<Flyweight>();

    @Override
    public void operation(String extrinsicState) {
        for (Flyweight flyweight : flyweights) {
            flyweight.operation(extrinsicState);
        }
    }

    public void addFlyweight(Flyweight flyweight) {
        flyweights.add(flyweight);
    }
}
