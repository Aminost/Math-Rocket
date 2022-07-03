package math.rocket;

import de.hsulm.sote2.ecanvas.EasyCanvas;
import java.awt.Color;

public class WorldofModel {

    Graphik graphik;
    int score = 0;
    int hp = 0;
    final Score_HP sh;
    boolean run=true;

    public WorldofModel(Graphik graphik) {
        this.graphik = graphik;
        this.sh = new Score_HP(300, 20, this);

    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }

    public void control() {
        int rx = graphik.rockets.get(0).getX();
        int ry = graphik.rockets.get(0).getY() - 50;
        int bx = graphik.boxes.get(0).getXreponse();
        int bx1 = graphik.boxes.get(1).getUnrpos1();
        int bx2 = graphik.boxes.get(2).getUnrpos2();
        int by = graphik.boxes.get(0).getY();
        if (rx >= bx - 100 && rx <= bx + 30) {
            if (ry >= by && ry - 2 <= by) {

                sh.setScoreHit(true);
                score++;
                System.out.println(score);
                graphik.mathes.setHit(true);
                graphik.boxes.get(0).setBoxhit(true);

            }
        } else if (rx >= bx1 - 100 && rx <= bx1 + 30) {
            if (ry >= by && ry - 2 <= by) {
                hp += 10;

            }
        } else if (rx >= bx2 - 100 && rx <= bx2 + 30) {
            if (ry >= by && ry - 2 <= by) {
                hp += 10;

            }
        }
    }
     

    void Zeichne() {

        sh.zeichne_Sc_HP();
    }
    public void gameover(){
        if (hp>=200){
            run =false;
            graphik.canvas.setFontSize(300);
            graphik.canvas.setColor(Color.red);
            graphik.canvas.drawString("Game Over", 300, 400);
        }
    }

}
