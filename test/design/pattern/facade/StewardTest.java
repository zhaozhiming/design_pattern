package design.pattern.facade;

import org.junit.Before;
import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class StewardTest {

    private Steward steward;

    @Before
    public void setUp() throws Exception {
        steward = new Steward();
    }

    @Test
    public void should_use_steward_prepare_something_for_new_year() {
        String message = steward.prepareForNewYear();
        String expectMessage = "购置年货\n"
                + "准备年夜饭\n"
                + "租车旅游\n";
        assertThat(message, is(expectMessage));
    }

    @Test
    public void should_use_steward_clean_house_for_new_year() {
        String message = steward.cleanForNewYear();
        String exceptMessage = "打扫厨房\n"
                + "扔掉垃圾\n"
                + "整理杂物\n";
        assertThat(message, is(exceptMessage));
    }
}
