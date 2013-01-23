package design.pattern.command;

public class ArmyAttackCommand extends AttackCommand {

    public ArmyAttackCommand(String target) {
        super(target);
        troop = new Army();
    }
}
