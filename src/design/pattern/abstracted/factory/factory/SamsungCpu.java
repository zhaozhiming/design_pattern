package design.pattern.abstracted.factory.factory;

import design.pattern.abstracted.factory.cpu.Cpu;

public class SamsungCpu implements Cpu {
    @Override
    public String getGHz() {
        return "2.4GHz";
    }
}
