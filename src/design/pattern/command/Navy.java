package design.pattern.command;

public class Navy implements Troop {
    @Override
    public String attack(String target) {
        return "海军部队攻击" + target;
    }

    @Override
    public String retreat(String locale) {
        return "海军部队撤退到" + locale;
    }
}
