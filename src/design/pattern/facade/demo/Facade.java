package design.pattern.facade.demo;

import design.pattern.facade.demo.sub.system.*;

public class Facade {
    private ModuleA moduleA;
    private InterfaceB interfaceB;
    private SuperClassC classC;

    public Facade() {
        moduleA = new ModuleA();
        interfaceB = new InterfaceBImpl();
        classC = new SubClassC();
    }

    public void run() {
        moduleA.methodA();
        interfaceB.methodB();
        classC.methodC();
    }
}
