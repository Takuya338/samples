import java.awt.*;
import javax.swing.*;
import java.awt.geom.Ellipse2D;

public class MyPanel extends JPanel {
	public void paintComponent(Graphics g) {
		Graphics2D g2 = (Graphics2D)g;
		g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING,
		RenderingHints.VALUE_ANTIALIAS_ON);
		int width = getWidth() - 20;
		int height = getHeight() - 20;
		GradientPaint paint = new GradientPaint(0f, 10f, Color.WHITE, 0f,(float)height, Color.BLACK);
		g2.setPaint(paint);
		Ellipse2D shape = new Ellipse2D.Double(10, 10, width, height);
		g2.fill(shape);
		g2.setColor(Color.BLACK);
		g2.setStroke(new BasicStroke(3));
		g2.draw(shape);
	}
}
