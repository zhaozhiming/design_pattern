package design.pattern.memento;

import java.util.List;

public class SystemMemento {
    private String type;
    private int diskCount;
    private List<String> drives;

    public SystemMemento(String type, int diskCount, List<String> drives) {
        this.type = type;
        this.diskCount = diskCount;
        this.drives = drives;
    }

    public String getType() {
        return type;
    }

    public int getDiskCount() {
        return diskCount;
    }

    public List<String> getDrives() {
        return drives;
    }
}
