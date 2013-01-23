package design.principle.srp;

public class User {
    private String name;
    private int age;

    public User(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void changeUserInfo(String name, int age) {
        this.name = name;
        this.age = age;
    }
}
