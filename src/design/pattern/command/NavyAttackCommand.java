package design.pattern.command;

public class NavyAttackCommand extends AttackCommand {

    public NavyAttackCommand(String target) {
        super(target);
        this.troop = new Navy();
    }

}
