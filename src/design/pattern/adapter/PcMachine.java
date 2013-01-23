package design.pattern.adapter;

import design.pattern.adapter.pc.PcGame;

public class PcMachine {
    private PcGame pcGame;

    public PcMachine(PcGame pcGame) {
        this.pcGame = pcGame;
    }

    public String playGame() {
        return pcGame.play();
    }
}
