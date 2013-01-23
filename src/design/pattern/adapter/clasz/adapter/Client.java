package design.pattern.adapter.clasz.adapter;

public class Client {
    private Target target;

    public Client(Target target) {
        this.target = target;
    }

    public void run() {
        target.request();
    }

    public static void main(String[] args) {
        Client client = new Client(new Adapter());
        client.run();
    }
}
