import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.Timer;

public class Runner extends JPanel{
	
	// Practice using Loops, random #s and 
	// methods
	public void paint(Graphics g) {
		
		
    	Graphics2D g2 = (Graphics2D) g;
        g2.setStroke(new BasicStroke(3));
     int l = 0 ;
     int X1 = 125 ;
     int X2 = 0 ;
     int Y1 = 600;
     int Y2 = 0;
	while( l <= 26) {
		X2 += 25;
		Y1 -= 25;
		X1 +=25;
		Y2 +=25;
	l++;
	g2.drawLine(0, Y1, X2, 0);
	g2.drawLine(X1, 0, 800, Y2);
	}
	
	for ( int ex1 = 125 , ex2 = 0, why1 = 600 , why2 = 0;l <= 26;  ) {
		
		
		
		
	}
		
	
	}	
	
		
	
	
	
	
	
	
	
	
	
	
	
	
	public static void main(String[] arg) {
		Runner m = new Runner();
	}
	
	public Runner() {
		JFrame f = new JFrame("Method Use");
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		f.setSize(800,600);
		f.add(this);
		f.setVisible(true);
		
	}
}
