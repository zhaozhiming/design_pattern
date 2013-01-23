package design.pattern.adapter.clasz.adapter;

public class Adapter extends Target implements Adaptee {

    @Override
    public void request() {
        specificRequest();
    }

    @Override
    public void specificRequest() {
    }
}
