package design.pattern.singleton;

public class WebCountThread implements Runnable {
    @Override
    public void run() {
        WebCount webCount = WebCount.getInstance();
        webCount.interview();
    }
}
