package design.pattern.command;

public class Commander {
    private Command command;

    public void setCommand(Command command) {
        this.command = command;
    }

    public String releaseCommand() {
        return command.execute();
    }
}
