package design.pattern.memento;

import org.junit.Before;
import org.junit.Test;

import static java.util.Arrays.asList;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class ClientTest {

    private OperationSystem system;

    @Before
    public void setUp() throws Exception {
        system = new OperationSystem("windows", 3,
                asList("intel", "asus"));
    }

    @Test
    public void should_return_system_info_correct() {
        String message = system.getSystemInfo();
        assertThat(message, is("系统类型是:windows, 磁盘分区数:3, " +
                "硬件驱动信息:[intel, asus]"));
    }

    @Test
    public void should_change_system_info_correct() {
        system.changeSystemInfo("linux", 4, asList("amd", "gigabyte", "kingston"));
        String message = system.getSystemInfo();
        assertThat(message, is("系统类型是:linux, 磁盘分区数:4, " +
                "硬件驱动信息:[amd, gigabyte, kingston]"));
    }

    @Test
    public void should_restore_system_info_correct() {
        system.createSystemMemento();

        system.changeSystemInfo("linux", 4, asList("amd", "gigabyte", "kingston"));
        system.restore();
        String message = system.getSystemInfo();
        assertThat(message, is("系统类型是:windows, 磁盘分区数:3, " +
                "硬件驱动信息:[intel, asus]"));

    }


}
