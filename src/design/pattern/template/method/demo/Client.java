package design.pattern.template.method.demo;

public class Client {
    public static void main(String[] args) {
        ConcreteClass1 concreteClass1 = new ConcreteClass1();
        concreteClass1.templateMethod();

        System.out.println();
        ConcreteClass2 concreteClass2 = new ConcreteClass2();
        concreteClass2.templateMethod();
    }
}
