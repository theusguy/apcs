// Marty Stepp, CSE 142, Autumn 2008
// This program displays the motion of a thrown projectile over time.
// This second version uses the Scanner so that it can interactively draw
// a different projectile every time it is run.

import java.awt.*;   // for Graphics
import java.util.*;  // for Scanner

public class Projectile2 {
    public static final double GRAVITY = -9.81;

    public static void main(String[] args) {
        // read user input from the Scanner
        Scanner console = new Scanner(System.in);
        System.out.print("Type your velocity, angle, and steps: ");
        int v0 = console.nextInt();
        int angle = console.nextInt();
        int steps = console.nextInt();
        
        // draw the graph of the projectile for the given input
        DrawingPanel panel = new DrawingPanel(400, 300);
        Graphics g = panel.getGraphics();
        
        projectile(g, v0, angle, steps);
        // projectile(g, 60, 50, 10);

        // g.setColor(Color.RED);
        // projectile(g, 50, 80, 50);
    }
    
    // Plots the motion of a single projectile with the given
    // initial velocity v0, angle, and number of steps to plot.
    public static void projectile(Graphics g, double v0, double angle, int steps) {
        // v0y = v0 sin theta,   v0x = v0 cos theta
        double v0y = v0 * Math.sin(Math.toRadians(angle));
        double v0x = v0 * Math.cos(Math.toRadians(angle));

        // t = -2v0 / a
        double totalTime = -2 * v0y / GRAVITY;
        double dt = totalTime / steps;
        
        System.out.println("       x       y      time");
        for (int i = 0; i <= steps; i++) {
            double t = i * dt;
            double x = v0x * t;
            double y = displacement(v0y, GRAVITY, t);
            System.out.printf("%8.2f %8.2f %8.2f \n", x, y, t);
            g.fillOval( (int) x, (int) (300 - y), 5, 5);
        }
    }
    
    // Computes and returns the change in position of a projectile
    // given its initial velocity v0, acceleration a, and time t.
    public static double displacement(double v0, double a, double t) {
        return (v0 * t + 0.5 * a * Math.pow(t, 2));
    }
}