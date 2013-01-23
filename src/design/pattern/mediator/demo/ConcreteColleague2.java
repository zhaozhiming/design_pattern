package design.pattern.mediator.demo;

public class ConcreteColleague2 extends Colleague {

    protected ConcreteColleague2(Mediator mediator) {
        super(mediator);
    }

    public void action2() {
        System.out.println("concrete colleague 2 action2");
    }

    public void executeMethodFrom1() {
        mediator.executeMethodFrom1();
    }
}
