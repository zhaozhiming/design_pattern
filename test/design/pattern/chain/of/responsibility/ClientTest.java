package design.pattern.chain.of.responsibility;

import org.junit.Before;
import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class ClientTest {

    private Dragon babyDragon;
    private Dragon largeDragon;

    @Before
    public void setUp() throws Exception {
        babyDragon = new BabyDragon();
        largeDragon = new LargeDragon();
    }

    @Test
    public void should_return_game_over_message_when_first_boss_win() {
        String message = babyDragon.defend(new Hero(100));
        assertThat(message, is("游戏结束，回去再修炼吧"));
    }

    @Test
    public void should_return_second_boss_message_when_win_first_boss() {
        babyDragon.setSuccessor(largeDragon);

        String message = babyDragon.defend(new Hero(600));
        assertThat(message, is("打赢小龙，可以挑战巨龙\n游戏结束，回去再修炼吧"));
    }

    @Test
    public void should_return_success_message_when_win_all_boss() {
        Dragon darkDragon = new DarkDragon();
        babyDragon.setSuccessor(largeDragon);
        largeDragon.setSuccessor(darkDragon);

        String message = babyDragon.defend(new Hero(5000));
        assertThat(message, is("打赢小龙，可以挑战巨龙\n" +
                "打赢巨龙，可以挑战暗黑龙\n" +
                "恭喜,你打赢了所有恶龙，可以去解救你的公主了"));
    }
}
