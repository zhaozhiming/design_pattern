package design.pattern.command;

public class RetreatCommand implements Command {
    protected String locale;
    protected Troop troop;

    public RetreatCommand(String locale) {
        this.locale = locale;
    }

    @Override
    public String execute() {
        return troop.retreat(locale);
    }
}
