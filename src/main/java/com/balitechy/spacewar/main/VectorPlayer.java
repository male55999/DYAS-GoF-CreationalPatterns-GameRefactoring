package com.balitechy.spacewar.main;

import java.awt.Color;
import java.awt.Graphics;

public class VectorPlayer extends Player {

    public VectorPlayer(double x, double y, Game game) {
        super(x, y, game);
    }

    @Override
    public void render(Graphics g) {
        g.setColor(Color.YELLOW);
        int[] xPoints = {(int)x, (int)x + WIDTH/2, (int)x + WIDTH};
        int[] yPoints = {(int)y + HEIGHT, (int)y, (int)y + HEIGHT};
        g.drawPolygon(xPoints, yPoints, 3);
    }
}