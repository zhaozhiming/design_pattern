package design.pattern.command;

public class Army implements Troop {

    @Override
    public String attack(String target) {
        return "陆军部队攻击" + target;
    }

    @Override
    public String retreat(String locale) {
        return "陆军部队撤退到" + locale;
    }
}
