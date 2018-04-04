import java.awt.Color;
import java.awt.Graphics;

public class ColorWheel {
	private final static int X_SIZE = 512;
	private final static int Y_SIZE = 512;
	private final static double R = X_SIZE / 2;
	private final static int X_CENTER = X_SIZE / 2 - 1;
	private final static int Y_CENTER = Y_SIZE / 2 - 1;
	
	public static void main(String[] args) {
		DrawingPanel panel = new DrawingPanel(X_SIZE, Y_SIZE);
		panel.setBackground(Color.WHITE);
		double pointRadius = 0;
		
		Graphics g = panel.getGraphics();
		
		for (int y = 0; y < Y_SIZE; y++) {
			for (int x = 0; x < X_SIZE; x++) {
				pointRadius = Math.sqrt((x - X_CENTER) * (x - X_CENTER) + (y - Y_CENTER) * (y - Y_CENTER));
				if (pointRadius > R) {
					continue;
				} 
				double angle = getAngle(x, y);
				int red = getRed(angle);
				int blue = getBlue(angle);
				int green = getGreen(angle);
				g.setColor(new Color(red, green, blue, getAlpha(pointRadius)));
				g.drawLine(x, y, x, y);
			}
		}
	}
	
	private static double getAngle(double x, double y) {
		if (y == Y_CENTER) {
			if (x < X_CENTER) {
				return Math.PI / 2;
			}
			return  3 * Math.PI / 2;
		}
		double angle = Math.atan((X_CENTER - x) / (Y_CENTER - y));
		if (angle > 0) {
			if (y > Y_CENTER) {
				return angle + Math.PI;
			} else {
				return angle;
			}
		} else {
			if (y > Y_CENTER) {
				return Math.PI + angle;
			} else {
				return 2 * Math.PI + angle;
			}
		}
	}
	
	private static int getRed(double angle) {
		if (angle < 2 * Math.PI / 3) {
			return (int) (255 - angle * 255 / ((2 * Math.PI) / 3));
		} else if (angle < 4 * Math.PI / 3) {
			return 0;
		} else {
			double relativeAngle = angle - 4 * Math.PI / 3;
			return (int) (relativeAngle * 255 / ((2 * Math.PI) / 3));
		}
	}
	
	private static int getBlue(double angle) {
		if (angle < 2 * Math.PI / 3) {
			return 0;
		} else if (angle < 4 * Math.PI / 3) {
			double relativeAngle = angle - 2 * Math.PI / 3;
			return (int) (relativeAngle * 255 / ((2 * Math.PI) / 3));
		} else {
			double relativeAngle = angle - 4 * Math.PI / 3;
			return (int) (255 - relativeAngle * 255 / ((2 * Math.PI) / 3));
		}
	}
	
	private static int getGreen(double angle) {
		if (angle < 2 * Math.PI / 3) {
			return (int) (angle * 255 / ((2 * Math.PI) / 3));
		} else if (angle < 4 * Math.PI / 3) {
			double relativeAngle = angle - 2 * Math.PI / 3;
			return (int) (255 - relativeAngle * 255 / ((2 * Math.PI) / 3));
		} else {
			return 0;
		}
	}
	
	private static int getAlpha(double pointRadius) {
		int pRadius = (int) pointRadius - 1;
		if (pRadius < 0) {
			return 0;
		} else {
			return pRadius;
		}
	}
}