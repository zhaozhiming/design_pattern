package design.pattern.singleton;

public class WebCount {
    private int count;

    private static class Holder{
        private static WebCount webCount = new WebCount();
    }

    private WebCount() {
    }

    public static WebCount getInstance() {
        return Holder.webCount;
    }

    public void interview() {
        count++;
    }

    public int getCount() {
        return count;
    }
}
