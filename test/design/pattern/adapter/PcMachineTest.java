package design.pattern.adapter;

import design.pattern.adapter.pc.Warcraft;
import design.pattern.adapter.ps.PsGame;
import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class PcMachineTest {

    @Test
    public void should_run_ps_game_correct_on_pc_machine() {
        PcMachine pcMachine = new PcMachine(new PsGameAdapter(new PsGame()));
        String message = pcMachine.playGame();
        assertThat(message, is("插入游戏光盘\n" + "加载游戏\n" +
                "运行游戏\n" + "使用手柄来玩游戏"));
    }

    @Test
    public void should_run_pc_game_correct_on_pc_machine() {
        PcMachine pcMachine = new PcMachine(new Warcraft());
        String message = pcMachine.playGame();
        assertThat(message, is("安装游戏\n" + "注册游戏\n" +
                "运行游戏\n" + "使用鼠标和键盘玩游戏\n" + "魔兽世界开始"));
    }

    @Test
    public void should_run_ps_game_class_adapter_correct() {
        PcMachine pcMachine = new PcMachine(new PsGameClassAdapter());
        String message = pcMachine.playGame();
        assertThat(message, is("类适配器:" + "插入游戏光盘\n" + "加载游戏\n" +
                "运行游戏\n" + "使用手柄来玩游戏"));
    }

}
