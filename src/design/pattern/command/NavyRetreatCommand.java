package design.pattern.command;

public class NavyRetreatCommand extends RetreatCommand {

    public NavyRetreatCommand(String locale) {
        super(locale);
        troop = new Navy();
    }

}
