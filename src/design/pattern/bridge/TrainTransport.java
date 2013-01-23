package design.pattern.bridge;

public class TrainTransport implements Transport {
    @Override
    public String transport() {
        return "使用火车运输货物";
    }
}
