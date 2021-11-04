package hsa2;
import java.awt.*; 

public class practice {
	public static void main(String[] args) throws InterruptedException { 
		GraphicsConsole c = new GraphicsConsole(800, 800, "Starship"); 
		c.setBackgroundColor(Color.black);
		
		
		int x = 100, y = 100;
		int x2 = 0;
		
		while(x < 300) {
			c.clear();
			c.setColor(Color.yellow);
			
			c.fillStar(x, y, 50, 75);
			c.fillStar(x2, 200, 10, 10); 
			Thread.sleep(5);
			
			x++; y++; 
		}
		
		Image Rocket = Toolkit.getDefaultToolkit().getImage(c.getClass().getClassLoader().getResource("rocketship.png")); 
		c.drawImage(Rocket, 10, 10);
	}
}
