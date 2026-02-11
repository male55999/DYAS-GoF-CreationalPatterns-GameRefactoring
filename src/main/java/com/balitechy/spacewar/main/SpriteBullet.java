package com.balitechy.spacewar.main;

import java.awt.Graphics;
import java.awt.image.BufferedImage;

public class SpriteBullet extends Bullet {

    private BufferedImage image;

    public SpriteBullet(double x, double y, Game game){
        super(x, y); // Inicializa coordenadas en la clase padre

        // Carga la imagen específica usando la instancia de Game
        this.image = game.getSprites().getImage(35, 52, WIDTH, HEIGHT);
    }

    @Override
    public void render(Graphics g){
        g.drawImage(image, (int) x, (int) y, null);
    }
}