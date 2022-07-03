package math.rocket;

public class MathRocket {

    public static void main(String[] args) throws InterruptedException {
        Graphik graphik = new Graphik(800, 800);

        WorldofModel w = new WorldofModel(graphik);
      //  Score_HP s = new Score_HP(300, 20, w);
        boolean run=true;
        while (run) {
            graphik.canvas.clear();
            w.control();
            graphik.zeichne();
            graphik.block();
            graphik.blockmove();
            graphik.draw();
            
            w.Zeichne();
            graphik.key_move();
            graphik.canvas.paintImmediately();
            Thread.sleep(40);
        }
    }

}
