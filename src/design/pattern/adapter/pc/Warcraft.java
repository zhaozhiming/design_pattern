package design.pattern.adapter.pc;

public class Warcraft implements PcGame {
    @Override
    public String play() {
        return "安装游戏\n" + "注册游戏\n" +
                "运行游戏\n" + "使用鼠标和键盘玩游戏\n" + "魔兽世界开始";
    }
}
