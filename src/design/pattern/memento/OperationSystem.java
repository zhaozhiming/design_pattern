package design.pattern.memento;

import java.util.List;

public class OperationSystem implements Cloneable {

    private String type;
    private int diskCount;
    private List<String> drives;
    private OperationSystem systemBackup;

    public OperationSystem(String type, int diskCount, List<String> drives) {
        this.type = type;
        this.diskCount = diskCount;
        this.drives = drives;
    }

    public String getSystemInfo() {
        return String.format("系统类型是:%s, 磁盘分区数:%d, 硬件驱动信息:%s",
                type, diskCount, drives.toString());
    }

    public void createSystemMemento() {
        try {
            this.systemBackup = clone();
        } catch (CloneNotSupportedException e) {
            throw new RuntimeException("备份系统失败");
        }
    }

    public void changeSystemInfo(String type, int diskCount, List<String> drives) {
        this.type = type;
        this.diskCount = diskCount;
        this.drives = drives;
    }

    public void restore() {
        this.type = systemBackup.type;
        this.diskCount = systemBackup.diskCount;
        this.drives = systemBackup.drives;
    }

    @Override
    protected OperationSystem clone() throws CloneNotSupportedException {
        return (OperationSystem) super.clone();
    }
}
