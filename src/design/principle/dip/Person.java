package design.principle.dip;

public class Person {
    private String name;
    private Clothes clothes;

    public Person(String name) {
        this.name = name;
    }

    public Person(Clothes clothes) {
        this.clothes = clothes;
    }

    public void setClothes(Clothes clothes) {
        this.clothes = clothes;
    }

    public void wear() {
        clothes.use();
    }
}
