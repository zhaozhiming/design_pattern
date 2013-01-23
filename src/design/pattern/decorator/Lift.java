package design.pattern.decorator;

public class Lift extends HouseDecorator {

    protected Lift(House house) {
        super(house);
    }

    @Override
    public String rent() {
        int rentPrice = house.getPrice();
        house.setPrice(rentPrice + 100);

        return "有电梯," + super.rent();
    }
}
