package com.balitechy.spacewar.main;

import java.awt.Graphics;
import java.awt.image.BufferedImage;
import java.io.IOException;
import javax.imageio.ImageIO;

public class BitmapBackgroundRenderer implements BackgroundRenderer {

    private BufferedImage image;

    public BitmapBackgroundRenderer() {
        try {
            image = ImageIO.read(getClass().getResource("/bg.png"));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void render(Graphics g) {
        g.drawImage(image, 0, 0, Game.WIDTH * Game.SCALE, Game.HEIGHT * Game.SCALE, null);
    }
}