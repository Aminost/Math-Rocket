package math.rocket;

import java.awt.Color;

public class Score_HP {

    private final int x;
    private final int y;

    protected boolean scoreHit = false;
    private int s;
    private final WorldofModel wm;

    public Score_HP(int x, int y, WorldofModel wm) {
        this.x = x;
        this.y = y;
        this.wm = wm;

    }

    public void setScoreHit(boolean scoreHit) {
        this.scoreHit = scoreHit;
    }

    public void zeichne_Sc_HP() {

        if (scoreHit == true) {
            s += 10;

        }

        wm.graphik.canvas.setFontSize(10);
        wm.graphik.canvas.drawString("score=" + s, 5, 20);
        wm.graphik.canvas.setColor(Color.green);
        wm.graphik.canvas.fillRect(x, y, 200, 20);
        wm.graphik.canvas.drawRect(x, y, 200, 20);
        wm.graphik.canvas.setColor(Color.red);
        wm.graphik.canvas.fillRect(x, y, 0 + wm.hp, 20);
        scoreHit = false;

    }

    public WorldofModel getWorldofModel() {
        return wm;
    }

}
