package math.rocket;



import java.awt.Color;
import java.awt.Image;
import javax.swing.ImageIcon;

public class Box {

    protected int x, y;
    

    protected int[] pos = {this.x + 600, this.x + 350, this.x + 100};
    private int i = (int) (java.lang.Math.random() * 3 + 0);
    protected int xreponse;
    private int unr1 = (int) (java.lang.Math.random() * 99 + 0);
    private int unr2 = (int) (java.lang.Math.random() * 99 + 0);
    protected int unrpos1;
    protected int unrpos2;
    protected boolean boxhit = false;

    private final Graphik graphik;

    private Image Rocket = new ImageIcon("moon.png").getImage();
    
    

    public Box(int x, int y, Graphik graphik) {

        this.x = x;
        this.y = y;

        this.graphik = graphik;
    }

    public int getUnrpos1() {
        return unrpos1;
    }

    public int getUnrpos2() {
        return unrpos2;
    }

    public int getXreponse() {
        return xreponse;
    }

    public void setBoxhit(boolean boxhit) {
        this.boxhit = boxhit;
    }

    public int[] getPos() {
        return pos;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public void block(Graphik gf) {
        int j = 0;
       
        while (j < 3) {
            int u = (int) (java.lang.Math.random() * 3 + 0);
            gf.canvas.drawImage(Rocket, pos[u], y);
            
            j++;

        }
        bchange(gf);

    }

    public void blockmove() {
        if (y < 590) {
            y++;

        } else {
            y = -200;

        }
    }

    private void bchange(Graphik gf) {
        gf.canvas.setColor(Color.red);
        gf.canvas.setFontSize(40);
        this.xreponse = pos[i] + 30;
        if (boxhit == true) {
            i = (int) (java.lang.Math.random() * 3 + 0);
            this.xreponse = pos[i] + 30;
            boxhit = false;
        }
        gf.canvas.drawString("=" + (graphik.mathes.getReponse()), this.xreponse, y + 65);
        switch (i) {
            case 0:
                gf.canvas.drawString("=" + unr1, this.pos[1] + 30, y + 65);
                gf.canvas.drawString("=" + unr2, this.pos[2] + 30, y + 65);
                this.unrpos1 = pos[1];
                this.unrpos2 = pos[2];
                break;
            case 1:
                gf.canvas.drawString("=" + unr1, this.pos[0] + 30, y + 65);
                gf.canvas.drawString("=" + unr2, this.pos[2] + 30, y + 65);
                this.unrpos1 = pos[0];
                this.unrpos2 = pos[2];
                break;
            case 2:
                gf.canvas.drawString("=" + unr1, this.pos[1] + 30, y + 65);
                gf.canvas.drawString("=" + unr2, this.pos[0] + 30, y + 65);
                this.unrpos1 = pos[0];
                this.unrpos2 = pos[1];
                break;
        }

    }
     public Graphik getGraphik() {
        return graphik;
    }

}
