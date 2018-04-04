import java.awt.*;

public class DrawLine {
	public static void main (String[] Args) {
		//Create Drawing Panel
		DrawingPanel panel = new DrawingPanel(400,400);
		//Draw a line on the panel
		Graphics g = panel.getGraphics();
		g.drawLine (25,75,175,25);
		g.setColor(Color.CYAN);
		g.drawOval (150, 50, 40, 20);
		g.setColor(new Color(255, 0, 255));		
		g.fillOval (200, 200, 100, 50);
		
	}
}
