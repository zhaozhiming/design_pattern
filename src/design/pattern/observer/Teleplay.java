package design.pattern.observer;

public class Teleplay extends Show {

    private String channel;
    private String time;

    public Teleplay(String name) {
        super(name);
    }

    @Override
    public String changeShowInfo(String channel, String time) {
        this.channel = channel;
        this.time = time;
        return notifySpectators();
    }

    @Override
    public String getChannel() {
        return channel;
    }

    @Override
    public String getTime() {
        return time;
    }
}
