import java.awt.*;
import javax.swing.JFrame;

public class ClockFace extends Canvas {
  public void paint(Graphics g) {
   g.drawOval(250, 150, 300, 300);
   g.setColor(Color.red);
   g.drawLine(400, 300, 300, 300);
  
   g.setColor(Color.black);
   g.drawLine(400, 300, 525, 325);
   g.fillArc(395, 295, 10, 10, 0, 360);

   g.setFont(new Font("Consolas", Font.PLAIN, 32));
   g.drawString("1", 455, 210);
   g.drawString("2", 495, 255);
   g.drawString("3", 510, 310);
   g.drawString("4", 495, 370);
   g.drawString("5", 455, 410);
   g.drawString("6", 385, 430);
   g.drawString("7", 320, 410);
   g.drawString("8", 290, 370);
   g.drawString("9", 270, 310);
   g.drawString("10", 290, 255);
   g.drawString("11", 320, 210);
   g.drawString("12", 380, 200);
  }
  public static void main(String[] args) {
    JFrame win = new JFrame("Clock face");
    win.setSize(800, 600);
    win.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    ClockFace canvas = new ClockFace();
    win.add(canvas);
    win.setVisible(true); 
  }
}

