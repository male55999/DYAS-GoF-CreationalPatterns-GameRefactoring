package com.balitechy.spacewar.main;

import java.awt.Graphics;
import java.awt.image.BufferedImage;

public class SpritePlayer extends Player {

    private BufferedImage image;

    public SpritePlayer(double x, double y, Game game) {
        super(x, y, game);

         image = game.getSprites().getImage(219, 304, WIDTH, HEIGHT);
    }

    @Override
    public void render(Graphics g) {
        g.drawImage(image, (int) x, (int) y, null);
    }
}