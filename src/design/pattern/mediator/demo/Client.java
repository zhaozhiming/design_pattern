package design.pattern.mediator.demo;

public class Client {
    public static void main(String[] args) {
        Mediator mediator = new ConcreteMediator();
        ConcreteColleague1 colleague1 = new ConcreteColleague1(mediator);
        ConcreteColleague2 colleague2 = new ConcreteColleague2(mediator);

        mediator.setConcreteColleague1(colleague1);
        mediator.setConcreteColleague2(colleague2);

        colleague1.action1();
        colleague1.executeMethodFrom2();

        System.out.println();
        colleague2.action2();
        colleague2.executeMethodFrom1();

    }
}
