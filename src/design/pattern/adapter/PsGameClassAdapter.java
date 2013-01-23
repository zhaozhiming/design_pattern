package design.pattern.adapter;

import design.pattern.adapter.pc.PcGame;
import design.pattern.adapter.ps.PsGame;

public class PsGameClassAdapter extends PsGame implements PcGame {
    @Override
    public String play() {
        return "类适配器:" + this.playGame();
    }
}
