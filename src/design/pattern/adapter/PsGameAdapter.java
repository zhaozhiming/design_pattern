package design.pattern.adapter;

import design.pattern.adapter.pc.PcGame;
import design.pattern.adapter.ps.PsGame;

public class PsGameAdapter implements PcGame {

    private PsGame psGame;

    public PsGameAdapter(PsGame psGame) {
        this.psGame = psGame;
    }

    @Override
    public String play() {
        return psGame.playGame();
    }
}
