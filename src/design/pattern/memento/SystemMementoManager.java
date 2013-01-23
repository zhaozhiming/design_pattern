package design.pattern.memento;

public class SystemMementoManager {
    private SystemMemento systemMemento;

    public void setSystemMemento(SystemMemento systemMemento) {
        this.systemMemento = systemMemento;
    }

    public SystemMemento getSystemMemento() {
        return systemMemento;
    }
}
