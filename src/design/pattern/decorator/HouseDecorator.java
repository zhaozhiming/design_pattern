package design.pattern.decorator;

public class HouseDecorator extends House {
    protected House house;

    public HouseDecorator(House house) {
        this.house = house;
    }

    @Override
    public String rent() {
        return house.rent();
    }
}
