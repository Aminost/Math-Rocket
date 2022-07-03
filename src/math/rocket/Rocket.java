package math.rocket;

import de.hsulm.sote2.ecanvas.EasyCanvas;
import java.awt.Color;
import java.awt.Graphics2D;

import java.awt.Image;
import java.awt.event.KeyEvent;

import javax.swing.ImageIcon;

public class Rocket {

   protected int x, y;
    private int dir = 1;
    private final int i = 10;
    private final Graphik graphik;
    private final Image background=new ImageIcon("galaxy.png").getImage();

    private final Image Rocket = new ImageIcon("rocket.png").getImage();

    public Rocket(int x, int y, Graphik graphik) {
        this.x = x;
        this.y = y;
        this.graphik = graphik;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    protected void zeichne(Graphik gf) {
         gf.canvas.drawImage(background, 0, 0);
        gf.canvas.drawImage(Rocket, this.x, this.y);

    }

    protected void key_move(Graphik gf) {

        char nextChar = gf.canvas.nextChar();

        if (nextChar != 0) {
            System.out.println(nextChar);

            if (nextChar == 'a') {
                this.dir = 3;
                move();

            } else if (nextChar == 'd') {
                this.dir = 1;
                move();

            }
        }

    }

    private void move() {

        if (dir == 1) {
            if (this.x < 800) {
                this.x += i;
                System.out.println("rx" + x);

            } else {
                this.x = 0;
            }

        } else if (dir == 3) {
            if (this.x > 0) {
                this.x -= i;
                System.out.println("rx" + x);
            } else {
                this.x = 800;
            }

        }

    }

    public Graphik getGraphik() {
        return graphik;
    }

}
