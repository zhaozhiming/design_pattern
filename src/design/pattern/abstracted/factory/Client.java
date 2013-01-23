package design.pattern.abstracted.factory;

import design.pattern.abstracted.factory.factory.PhoneFactory;

public class Client {

    private PhoneFactory phoneFactory;

    public Client(PhoneFactory phoneFactory) {
        this.phoneFactory = phoneFactory;
    }

    public Phone createPhone() {
        return phoneFactory.create();
    }
}
