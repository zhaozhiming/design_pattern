package design.pattern.observer;

import org.junit.Before;
import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class ClientTest {

    private Show show;
    private Spectator spectator;

    @Before
    public void setUp() throws Exception {
        show = new Teleplay("北京青年");
        spectator = new YoungSpectator("张三");
        show.addSpectator(spectator);
    }

    @Test
    public void should_show_add_spectator_correct() {
        assertThat(show.getSpectatorsCount(), is(1));
    }

    @Test
    public void should_show_remove_spectator_correct() {
        show.removeSpectator(spectator);
        assertThat(show.getSpectatorsCount(), is(0));
    }

    @Test
    public void should_notify_one_spectator_correct() {
        String message = show.notifySpectators();
        assertThat(message, is("张三收看的节目:北京青年,节目的频道变更为null,时间变更为null\n"));
    }

    @Test
    public void should_notify_spectators_when_show_info_change() {
        String message = show.changeShowInfo("02", "8:00 pm");
        assertThat(message, is("张三收看的节目:北京青年,节目的频道变更为02,时间变更为8:00 pm\n"));
    }

    @Test
    public void should_notify_all_spectators_when_show_info_change() {
        Spectator otherSpectator = new YoungSpectator("李四");
        show.addSpectator(otherSpectator);
        String message = show.changeShowInfo("02", "8:00 pm");
        assertThat(message, is("张三收看的节目:北京青年,节目的频道变更为02,时间变更为8:00 pm\n" +
                "李四收看的节目:北京青年,节目的频道变更为02,时间变更为8:00 pm\n"));
    }
}
