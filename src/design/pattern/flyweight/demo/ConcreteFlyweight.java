package design.pattern.flyweight.demo;

public class ConcreteFlyweight implements Flyweight {
    private String intrinsicState = "intrinsicState";

    @Override
    public void operation(String extrinsicState) {
        System.out.println("concrete flyweight : " + intrinsicState
                + " - " + extrinsicState);
    }
}
