package design.pattern.flyweight.demo;

import static java.util.Arrays.asList;

public class Client {
    public static void main(String[] args) {
        FlyweightFactory factory = new FlyweightFactory();
        Flyweight flyweight1 = factory.getFlyweight("share1");
        Flyweight flyweight2 = factory.getFlyweight("share1");
        System.out.println(flyweight1 == flyweight2);

        Flyweight flyweight3 = factory.getFlyweight("share2");
        flyweight1.operation("extrinsic state 1");
        flyweight2.operation("extrinsic state 2");
        flyweight3.operation("extrinsic state 3");

        System.out.println("unshared flyweight:");
        Flyweight flyweight4 = factory.getFlyweight(asList("share1", "share2"));
        flyweight4.operation("extrinsic state 4");

    }
}
