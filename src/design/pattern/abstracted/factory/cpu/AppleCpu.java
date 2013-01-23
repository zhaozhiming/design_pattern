package design.pattern.abstracted.factory.cpu;

public class AppleCpu implements Cpu {
    @Override
    public String getGHz() {
        return "2GHz";
    }
}
