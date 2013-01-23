package design.pattern.flyweight.demo;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class FlyweightFactory {
    private Map<String, Flyweight> flyweights = new HashMap<String, Flyweight>();

    public Flyweight getFlyweight(String key) {
        if (flyweights.containsKey(key)) {
            return flyweights.get(key);
        }

        Flyweight flyweight = new ConcreteFlyweight();
        flyweights.put(key, flyweight);
        return flyweight;
    }

    public Flyweight getFlyweight(List<String> keys) {
        UnsharedConcreteFlyweight unsharedConcreteFlyweight = new UnsharedConcreteFlyweight();
        for (String key : keys) {
            Flyweight flyweight = getFlyweight(key);
            unsharedConcreteFlyweight.addFlyweight(flyweight);
        }
        return unsharedConcreteFlyweight;
    }
}
