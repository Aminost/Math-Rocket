package math.rocket;

import de.hsulm.sote2.ecanvas.EasyCanvas;


import java.util.ArrayList;
import java.util.List;

import java.awt.Graphics2D;
import java.awt.Image;
import javax.swing.ImageIcon;

public class Graphik {

    private int breite;
    private int hoehe;
    Graphics2D Graphics2D;
    final EasyCanvas canvas;
    final List<Rocket> rockets;
    final List<Box> boxes;
    final Math mathes;
   
   

    public Graphik(int breite, int hoehe) {
        this.breite = breite;
        this.hoehe = hoehe;
        this.rockets = new ArrayList<>();
        this.boxes = new ArrayList<>();
        this.mathes = new Math(this);

        this.canvas = new EasyCanvas(breite, hoehe);
        canvas.show();
        Rocket Re = new Rocket(350, 590, this);
        this.rockets.add(Re);
        Box boite = new Box(50, 50, this);
        for (int i = 0; i < 3; i++) {
            this.boxes.add(boite);

        }

    }
  

    public int getBreite() {
        return breite;
    }

    public int getHoehe() {
        return hoehe;
    }

    void zeichne() {

        rockets.get(0).zeichne(this);

    }

    void key_move() {
        rockets.get(0).key_move(this);
    }

    void block() {
        for (int j = 0; j < boxes.size(); j++) {
            boxes.get(j).block(this);
        }
    }

    void blockmove() {
        for (int j = 0; j < boxes.size(); j++) {
            boxes.get(j).blockmove();
        }
    }

    void draw() {
        mathes.draw(this);
    }

}
