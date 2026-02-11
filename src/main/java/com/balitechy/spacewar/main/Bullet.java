package com.balitechy.spacewar.main;

import java.awt.Graphics;

public abstract class Bullet {

	protected double x;
	protected double y;

	public static final int WIDTH = 11;
	public static final int HEIGHT = 21;

	public Bullet(double x, double y){
		this.x = x;
		this.y = y;
	}

	public void tick() {
		y -= 5;
	}

	public abstract void render(Graphics g);

	public double getY(){
		return y;
	}
}
