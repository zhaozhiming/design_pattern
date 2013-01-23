package design.pattern.decorator;

public class SmallHouse extends House {
    public SmallHouse(String address, int price) {
        super(address, price);
    }

    @Override
    public String rent() {
        return "地址:" + address + ",每月房租" + price;
    }
}
