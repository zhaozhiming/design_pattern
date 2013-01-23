package design.pattern.abstracted.factory.factory;

import design.pattern.abstracted.factory.cpu.AppleCpu;
import design.pattern.abstracted.factory.cpu.Cpu;
import design.pattern.abstracted.factory.model.AppleModel;
import design.pattern.abstracted.factory.model.Model;
import design.pattern.abstracted.factory.os.AppleOperatingSystem;
import design.pattern.abstracted.factory.os.OperatingSystem;

public class ApplePhoneFactory extends PhoneFactory {

    @Override
    protected OperatingSystem createOs() {
        return new AppleOperatingSystem();
    }

    @Override
    protected Cpu createCpu() {
        return new AppleCpu();
    }

    @Override
    protected Model createModel() {
        return new AppleModel();
    }
}
