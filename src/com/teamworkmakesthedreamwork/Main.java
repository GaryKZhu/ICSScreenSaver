package com.teamworkmakesthedreamwork;

import java.awt.Color;
import java.awt.Font;

import hsa2.GraphicsConsole;

public class Main {

	public static void main(String[] args) {
		new Main();
	}
	
	static final int SLEEPTIME = 10;
	static final int GRWIDTH = 800;
	static final int GRHEIGHT = 800;
	
	private GraphicsConsole gc = new GraphicsConsole (GRWIDTH, GRHEIGHT);
	
	private Main() {
		initialize();
		
		//hello

		//main loop, q to quit
		while (gc.getKeyCode() != 'Q') {

			drawGraphics();
			
			gc.sleep(SLEEPTIME);
		}
		
		System.out.println("Program Clossed");
	}

	
	void initialize() {
		gc.setFont(new Font("Georgia", Font.PLAIN, 25));
		gc.setAntiAlias(true);
		gc.setBackgroundColor(Color.BLACK);
		gc.enableMouseMotion();
		gc.clear();
		
		System.out.println("Finished Initialization!");
	}
	
	void drawGraphics() {
		
		synchronized(gc) {
			gc.clear();	
			
			gc.setColor(Color.WHITE);
			gc.setStroke(4);
			gc.drawLine(GRWIDTH/2-200, GRHEIGHT/2-200, GRWIDTH/2+200, GRHEIGHT/2+200);
		}
	}
}