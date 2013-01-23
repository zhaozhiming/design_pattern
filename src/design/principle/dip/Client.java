package design.principle.dip;

public class Client {
    public static void main(String[] args) {
        Person person = new Person("张三");

        Clothes shirt = new Shirt();
//        person.setClothes(shirt);
        person = new Person(shirt);
        person.wear();

        Clothes trousers = new Trousers();
        person.setClothes(trousers);
        person.wear();
    }
}
