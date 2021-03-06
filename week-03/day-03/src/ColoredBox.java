import javax.swing.*;

import java.awt.*;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class ColoredBox {

    public static void mainDraw(Graphics graphics){
        // draw a box that has different colored lines on each edge.

        graphics.setColor(Color.WHITE);                         // white background
        graphics.fillRect(10, 10, 200, 100);

        graphics.setColor(Color.ORANGE);                        // left
        graphics.drawLine(10, 10, 10, 110);

        graphics.setColor(Color.RED);                           // top
        graphics.drawLine(10, 10, 210, 10);

        graphics.setColor(new Color(171, 23, 182));     // right
        graphics.drawLine(210, 10, 210, 110);

        graphics.setColor(Color.BLUE);                          // bottom
        graphics.drawLine(10, 110, 210, 110);
    }

    //    Don't touch the code below
    static int WIDTH = 320;
    static int HEIGHT = 343;

    public static void main(String[] args) {
        JFrame jFrame = new JFrame("Drawing");
        jFrame.setSize(new Dimension(WIDTH, HEIGHT));
        jFrame.setDefaultCloseOperation(EXIT_ON_CLOSE);
        jFrame.add(new ImagePanel());
        jFrame.setLocationRelativeTo(null);
        jFrame.setVisible(true);
    }
    static class ImagePanel extends JPanel{
        @Override
        protected void paintComponent(Graphics graphics) {
            super.paintComponent(graphics);
            mainDraw(graphics);

        }
    }

}