package design.pattern.singleton;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class ClientTest {
    @Test
    public void should_count_web_interview_correct() {
        Client client = new Client();
        int count = client.countWebInterview();
        assertThat(count, is(1));
    }

    @Test
    public void should_count_web_interview_correct_when_in_multiply_thread() throws InterruptedException {
        for (int i = 0; i < 10; i++) {
            new Thread(new WebCountThread()).start();
        }
        Thread.sleep(1000);
        int count = WebCount.getInstance().getCount();
        assertThat(count, is(10));
    }
}
