package design.pattern.bridge;

public class AirTransport implements Transport {
    @Override
    public String transport() {
        return "使用飞机运输货物";
    }
}
