package design.pattern.singleton;

public class Client {
    public int countWebInterview() {
        WebCount webCount = WebCount.getInstance();
        webCount.interview();
        return webCount.getCount();
    }
}
