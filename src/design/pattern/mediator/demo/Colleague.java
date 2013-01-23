package design.pattern.mediator.demo;

public abstract class Colleague {
    protected Mediator mediator;

    protected Colleague(Mediator mediator) {
        this.mediator = mediator;
    }
}
