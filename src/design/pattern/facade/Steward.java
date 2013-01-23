package design.pattern.facade;

public class Steward {
    private Gift gift;
    private NewYearDinner newYearDinner;
    private Car car;
    private Kitchen kitchen;
    private Litter litter;
    private Sundries sundries;

    public Steward() {
        gift = new Gift();
        newYearDinner = new NewYearDinner();
        car = new Car();

        kitchen = new Kitchen();
        litter = new Litter();
        sundries = new Sundries();
    }

    public String prepareForNewYear() {
        StringBuilder message = new StringBuilder();
        message.append(gift.buy())
                .append(newYearDinner.cook())
                .append(car.rent());

        return message.toString();
    }

    public String cleanForNewYear() {
        StringBuilder message = new StringBuilder();
        message.append(kitchen.clean())
                .append(litter.drop())
                .append(sundries.clearUp());
        return message.toString();
    }
}
