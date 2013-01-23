package design.pattern.adapter.demo;

public class BothWayAdapter extends Adaptee implements Target {
    private Adaptee adaptee;
    private Target target;

    @Override
    public void request() {
        adaptee.specificRequest();
    }

    @Override
    void specificRequest() {
        target.request();
    }
}
