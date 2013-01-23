package design.pattern.memento.demo;

public class Client {
    public static void main(String[] args) {
        Originator originator = new Originator("new");
        System.out.println(originator.getState());

        Memento memento = originator.createMemento();
        Caretaker caretaker = new Caretaker();
        caretaker.setMemento(memento);

        originator.setState("old");
        System.out.println(originator.getState());

        originator.setMemento(caretaker.getMemento());
        System.out.println(originator.getState());
    }
}
