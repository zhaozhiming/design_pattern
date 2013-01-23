package design.pattern.abstracted.factory.factory;

import design.pattern.abstracted.factory.Phone;
import design.pattern.abstracted.factory.cpu.Cpu;
import design.pattern.abstracted.factory.model.Model;
import design.pattern.abstracted.factory.os.OperatingSystem;

public abstract class PhoneFactory {
    public Phone create() {
        Model model = createModel();
        Cpu cpu = createCpu();
        OperatingSystem os = createOs();
        return new Phone(model, cpu, os);
    }

    protected abstract OperatingSystem createOs();

    protected abstract Cpu createCpu();

    protected abstract Model createModel();
}
