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
        g2.setStroke(new BasicStroke(5));
      
		 
		//1) draw a concentric rectangle that's 10pixels from all sides of the "gray"
		//portion of the GUI
		g2.drawRect(10, 10, 765, 540);
		
		
		//2) Draw a horizontal line to bisect the Rectangle
		g2.drawLine(10, 270, 770, 270);
		
		
		//3) Draw a vertical line to bisect the shape again
		g2.drawLine(765/2, 10, 765/2, 550 );
		
		
		//4) small rectangles on top-left
		//g2.drawLine(765/4, 10, 765/4, 550/2-10);
		
		
		/* 
		 * int var = 0; 						<---- control variable
		 * while(var < 10){ 					<---- condition to run the loop
		 *   
		 *   //any repeating code
		 *   
		 *   var++;								<---- update control variable
		 *   
		 * }
		 */
		  Graphics2D g3 = (Graphics2D) g;
	        g3.setStroke(new BasicStroke(1));
		
		int Line = 0; 
		while (Line < 100) {
			g3.drawLine ((int)(Math.random() * (765/2)) + 10 , (int)(Math.random() * (260)) + 10, (int)(Math.random() * (765/2)+ 10)  ,(int) (Math.random() * (260)+ 10   ));
	
			
			Line ++;
		
		}
		
	int sqr = 0;
	while (sqr < 100) {
		int red =(int)(Math.random()*255);
		int blue = (int)(Math.random()*255);
		int green = (int)(Math.random()*255);
		g3.fillRect((int)(Math.random()*(765/2)) + 380  , (int)(Math.random()*(260) -40), 50, 50 );
	g3.setColor(new Color (red ,green ,blue ));
		
		
		sqr ++;
	
	
		
		
		
	}
	int crcl = 0;
	while(crcl < 100 ) {
		int crkl = (int)(Math.random()*(200))+10;
		g3.drawOval((int) (Math.random()*(765/2 - crkl - 10 + 1) ) +10 , (int)(Math.random()* (540 - crkl -270  +1) ) , crkl, crkl);
		
		
		crcl ++;
		
		
		
		
	
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
