package math.rocket;

import de.hsulm.sote2.ecanvas.EasyCanvas;
import java.awt.Color;

public class Math {

    protected boolean hit = false;
    public int a = (int) (java.lang.Math.random() * 9 + 1);
    public int b = (int) (java.lang.Math.random() * 9 + 1);
    private String[] operation = {"+", "-", "*"};
    public String op;
    protected String text = this.a + "+" + this.b + "=?";
    private int reponse = this.a + this.b;
    private final Graphik graphik;

    public Math(Graphik graphik) {
        this.graphik = graphik;
    }

    public int getReponse() {
        return reponse;
    }

    public void setHit(boolean hit) {
        this.hit = hit;
    }

    public int getA() {
        return a;
    }

    public int getB() {
        return b;
    }

    public int plus() {
        return this.a + this.b;
    }

    public double minus() {
        int r;
        //int c;
//        if (this.a > this.b) {
//            r = this.a - this.b;
//        } else {
//            c = a;
//            a = b;
//            b = c;
//            r = this.a - this.b;
//        }
        r = this.a - this.b;
        return r;
    }

    public int mal() {
        return this.a * this.b;
    }

    private String change(Graphik gf) {

        this.op = operation[0];
        if (hit == true) {
            this.a = (int) (java.lang.Math.random() * 9 + 1);
            this.b = (int) (java.lang.Math.random() * 9 + 1);
            int i = (int) (java.lang.Math.random() * 3 + 0);
            op = operation[i];
            this.hit = false;
            this.text = this.a + op + this.b + "=?";
            switch (this.op) {
                case "+":
                    this.reponse = plus();
                    break;
                case "-":
                    this.reponse = (int) minus();
                    break;
                case "*":
                    this.reponse = mal();
                    break;
            }

        }
        return text;
    }

    public void draw(Graphik gf) {

        gf.canvas.setColor(Color.yellow);

        gf.canvas.drawRect(200, 700, 400, 100);
        gf.canvas.setFontSize(50);
        gf.canvas.drawString(change(gf), 300, 780);

    }

    public Graphik getGraphik() {
        return graphik;
    }

}
