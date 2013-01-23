package design.pattern.mediator.demo;

public class ConcreteMediator extends Mediator {
    @Override
    protected void executeMethodFrom1() {
        concreteColleague1.action1();
    }

    @Override
    protected void executeMethodFrom2() {
        concreteColleague2.action2();
    }
}
