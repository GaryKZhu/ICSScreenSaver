package com.teamworkmakesthedreamwork;

import java.awt.Color;

public class Effects {
	private int x, y; 
	private Boolean status;
	
	public Effects() {
		this.x = 0;
		this.y = 0;
		this.status = false;
	}
	public Effects(int x, int y) {
		this.x = x;
		this.y = y;
		this.status = false; 
	}

	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}

	public Boolean getStatus() {
		return status;
	}

	public void setStatus(Boolean status) {
		this.status = status;
	}
	public Color getColour() {
		// TODO Auto-generated method stub
		return null;
	}
	public int getDiameter() {
		// TODO Auto-generated method stub
		return 0;
	}
	
	
}
