package design.pattern.command;

public class AttackCommand implements Command {
    protected String target;
    protected Troop troop;

    public AttackCommand(String target) {
        this.target = target;
    }

    @Override
    public String execute() {
        return troop.attack(target);
    }
}
