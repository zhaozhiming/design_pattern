package design.pattern.decorator;

public abstract class House {
    protected String address;
    protected int price;

    public House(String address, int price) {
        this.address = address;
        this.price = price;
    }

    protected House() {
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public abstract String rent();
}
