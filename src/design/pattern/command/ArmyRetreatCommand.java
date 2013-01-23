package design.pattern.command;

public class ArmyRetreatCommand extends RetreatCommand {

    public ArmyRetreatCommand(String locale) {
        super(locale);
        troop = new Army();
    }
}
