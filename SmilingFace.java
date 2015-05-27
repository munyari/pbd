import java.awt.*;
import javax.swing.JFrame;

public class SmilingFace extends Canvas {
  public void paint(Graphics g) {
    g.setColor(Color.yellow);
    g.fillOval(250, 150, 300, 300);
    g.setColor(Color.blue);
    g.fillOval(275, 175, 50, 50);
    g.fillOval(475, 175, 50, 50);
    g.setColor(Color.red);
    g.drawArc(325, 275, 150, 150, 215, 110);
//    g.fillOval();
  }
  public static void main(String[] args) {
    JFrame win = new JFrame("Smiling Face");
    win.setSize(800, 600);
    win.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    SmilingFace canvas = new SmilingFace();
    win.add(canvas);
    win.setVisible(true);
  }
}
