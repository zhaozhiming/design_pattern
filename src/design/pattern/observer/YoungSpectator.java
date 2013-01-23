package design.pattern.observer;

public class YoungSpectator implements Spectator {
    private String name;

    public YoungSpectator(String name) {
        this.name = name;
    }

    @Override
    public String update(Show show) {
        return String.format("%s收看的节目:%s,节目的频道变更为%s,时间变更为%s",
                name, show.getName(), show.getChannel(), show.getTime());
    }
}
