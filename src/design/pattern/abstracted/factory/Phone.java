package design.pattern.abstracted.factory;

import design.pattern.abstracted.factory.cpu.Cpu;
import design.pattern.abstracted.factory.model.Model;
import design.pattern.abstracted.factory.os.OperatingSystem;

public class Phone {
    private Model model;
    private Cpu cpu;
    private OperatingSystem operatingSystem;

    public Phone(Model model, Cpu cpu, OperatingSystem operatingSystem) {
        this.model = model;
        this.cpu = cpu;
        this.operatingSystem = operatingSystem;
    }

    public Model getModel() {
        return model;
    }

    public Cpu getCpu() {
        return cpu;
    }

    public OperatingSystem getOperatingSystem() {
        return operatingSystem;
    }
}
