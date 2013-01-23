package design.pattern.abstracted.factory.cpu;

import design.pattern.abstracted.factory.factory.PhoneFactory;
import design.pattern.abstracted.factory.factory.SamsungCpu;
import design.pattern.abstracted.factory.model.Model;
import design.pattern.abstracted.factory.model.SamsungModel;
import design.pattern.abstracted.factory.os.OperatingSystem;
import design.pattern.abstracted.factory.os.SamsungOperatingSystem;

public class SamsungPhoneFactory extends PhoneFactory {
    @Override
    protected OperatingSystem createOs() {
        return new SamsungOperatingSystem();
    }

    @Override
    protected Cpu createCpu() {
        return new SamsungCpu();
    }

    @Override
    protected Model createModel() {
        return new SamsungModel();
    }
}
