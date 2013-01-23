package design.pattern.command;

import org.junit.Before;
import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class ClientTest {

    private Commander commander;

    @Before
    public void setUp() throws Exception {
        commander = new Commander();
    }

    @Test
    public void should_army_attack_target_when_given_attack_command() {
        Command command = new ArmyAttackCommand("某个国家");
        commander.setCommand(command);
        String message = commander.releaseCommand();
        assertThat(message, is("陆军部队攻击某个国家"));
    }

    @Test
    public void should_army_retreat_command_when_given_retreat_command() {
        Command command = new ArmyRetreatCommand("某个地点");
        commander.setCommand(command);
        String message = commander.releaseCommand();
        assertThat(message, is("陆军部队撤退到某个地点"));
    }

    @Test
    public void should_navy_attack_target_when_given_attack_command() {
        Command command = new NavyAttackCommand("某个国家");
        commander.setCommand(command);
        String message = commander.releaseCommand();
        assertThat(message, is("海军部队攻击某个国家"));
    }

    @Test
    public void should_navy_retreat_command_when_given_retreat_command() {
        Command command = new NavyRetreatCommand("某个地点");
        commander.setCommand(command);
        String message = commander.releaseCommand();
        assertThat(message, is("海军部队撤退到某个地点"));
    }

    @Test
    public void should_general_attack_when_given_attack_command() {
        Command command = new GeneralAttackCommand("某个国家");
        commander.setCommand(command);
        String message = commander.releaseCommand();
        assertThat(message, is("陆军部队攻击某个国家\n海军部队攻击某个国家\n"));
    }
}
