/*
 * Name: Kelcie Feeney
 * Course Number: CSC142
 * Date: 1/31/15
 * Assignment: Practice Exercises 4
 */

import java.awt.*;

public class FirstGraphics {
	
	public static void main(String[] args) {

		// Constants that describe the picture
		final int panel_width = 1200;
		final int panel_height = 600;
		final int num_rows_upper = 6;
		final int num_rows_lower = 6;
		final int logo_width = 300;
		final int logo_height = 300;
		Color SeahawksGreen = new Color(0, 192, 0);
		Color SeahawksBlue = new Color(0, 0, 192);
		
		// Setup the objects that will build the picture
		DrawingPanel panel = new DrawingPanel(panel_width, panel_height);
		Graphics g = panel.getGraphics();
		
		// Draw the box for the logo
		g.setColor(SeahawksGreen);
		g.fillRect(0, 0, logo_width, logo_height);		
		g.setColor(Color.BLACK);
		g.drawRect(0, 0, logo_width, logo_height);
		Polygon football = new Polygon();
		football.addPoint(10, 150); // left point
		football.addPoint(150, 100);
		football.addPoint(290, 150); // right point
		football.addPoint(150, 200);
		football.addPoint(10, 150); // left point
		g.setColor(Color.WHITE);
		g.fillPolygon(football);
		g.setColor(SeahawksBlue);
		g.setFont(new Font("Serif", Font.BOLD, 96));
		g.drawString("12", 100, 180);
		
		// Draw the upper rows
		for(int i = 0; i < num_rows_upper; i++) {
			
			// I am using the modulus operator here
			// to do something different each loop
			// and make a pattern of colors.
			if((i % 2) == 0) {
				g.setColor(SeahawksBlue);				
			}
			else {
				g.setColor(SeahawksGreen);
			}
			g.fillRect(300, i * 50, panel_width - logo_width, 
					logo_height / num_rows_upper);
			g.setColor(Color.BLACK);
			g.drawRect(300, i * 50, panel_width - logo_width, 
					logo_height / num_rows_upper);
		}
		
		// Draw the lower rows
		for(int i = 0; i < num_rows_lower; i++) {
			if((i % 2) == 0) {
				g.setColor(SeahawksBlue);				
			}
			else {
				g.setColor(SeahawksGreen);
			}
			g.fillRect(0, 300 + i * 50, panel_width, 
					logo_height / num_rows_lower);
			g.setColor(Color.BLACK);
			g.drawRect(0, 300 + i * 50, panel_width, 
					logo_height / num_rows_lower);
		}
		
		// Draw the banner words "GO HAWKS!"
		g.setColor(Color.WHITE);
		g.setFont(new Font("SERIF", Font.ITALIC, 96));
		g.drawString("GO HAWKS!", 600, 500);
	}
}