package design.pattern.mediator.demo;

public class ConcreteColleague1 extends Colleague {

    protected ConcreteColleague1(Mediator mediator) {
        super(mediator);
    }

    public void action1() {
        System.out.println("concrete colleague 1 action1");
    }

    public void executeMethodFrom2() {
        mediator.executeMethodFrom2();
    }
}
