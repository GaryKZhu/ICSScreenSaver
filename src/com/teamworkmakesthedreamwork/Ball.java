package com.teamworkmakesthedreamwork;


import java.awt.Color;
import java.awt.Rectangle;


public class Ball extends Effects
{
	//do not put superclass variables here
	int xspeed = 3;	
	int yspeed = 3;
	int diameter = 30;
	Color colour = Color.RED;
	/**
	 * The ball will be placed randomly within the rectangle specified by the parameters below.
	 * The ball will be at least 75 pixels from the edge of this rectangle. (errr... only if maxX and maxY are > 150)
	 * @param maxX The range of X values for the ball to be placed
	 * @param maxY The range of Y values for the ball to be placed
	 */
	Ball(int x, int y) {
		setX(x); 
		setY(y); 
		
		// uncomment the following line if you want each ball to have a different random colour
		//colour = new Color(Color.HSBtoRGB((float)Math.random(), 1.0f, 1.0f)); 
	}
	public int getXspeed() {
		return xspeed;
	}
	public void setXspeed(int xspeed) {
		this.xspeed = xspeed;
	}
	public int getYspeed() {
		return yspeed;
	}
	public void setYspeed(int yspeed) {
		this.yspeed = yspeed;
	}
	public int getDiameter() {
		return diameter;
	}
	public void setDiameter(int diameter) {
		this.diameter = diameter;
	}
	public Color getColour() {
		return colour;
	}
	public void setColour(Color colour) {
		this.colour = colour;
	}
}
