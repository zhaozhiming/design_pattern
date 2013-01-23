package design.pattern.observer;

import java.util.ArrayList;
import java.util.List;

public abstract class Show {
    protected String name;
    protected List<Spectator> spectators = new ArrayList<Spectator>();

    protected Show(String name) {
        this.name = name;
    }

    public void addSpectator(Spectator spectator) {
        spectators.add(spectator);
    }

    public int getSpectatorsCount() {
        return spectators.size();
    }

    public void removeSpectator(Spectator spectator) {
        spectators.remove(spectator);
    }

    public String notifySpectators() {
        StringBuilder message = new StringBuilder();
        for (Spectator spectator : spectators) {
            message.append(spectator.update(this)).append("\n");
        }
        return message.toString();
    }

    public String getName() {
        return name;
    }

    public abstract String changeShowInfo(String channel, String time);

    public abstract String getChannel();

    public abstract String getTime();
}
