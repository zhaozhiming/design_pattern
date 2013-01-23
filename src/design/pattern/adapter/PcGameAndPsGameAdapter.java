package design.pattern.adapter;

import design.pattern.adapter.pc.PcGame;
import design.pattern.adapter.ps.PsGame;

public class PcGameAndPsGameAdapter extends PsGame implements PcGame {
    private PsGame psGame;
    private PcGame pcGame;
    @Override
    public String play() {
        return psGame.playGame();
    }

    @Override
    public String playGame() {
        return pcGame.play();
    }
}
