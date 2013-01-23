package design.pattern.command;

import java.util.List;

import static java.util.Arrays.asList;

public class GeneralAttackCommand implements Command {
    private String target;
    private List<Troop> troops;

    public GeneralAttackCommand(String target) {
        this.target = target;
        troops = asList(new Army(), new Navy());
    }

    @Override
    public String execute() {
        StringBuilder message = new StringBuilder();
        for (Troop troop : troops) {
            message.append(troop.attack(target)).append("\n");
        }
        return message.toString();
    }
}
