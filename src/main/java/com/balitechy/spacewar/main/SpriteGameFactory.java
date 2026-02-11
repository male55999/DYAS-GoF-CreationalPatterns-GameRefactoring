package com.balitechy.spacewar.main;

public class SpriteGameFactory implements GameFactory {

    @Override
    public Player createPlayer(double x, double y, Game game) {
        return new SpritePlayer(x, y, game);
    }

    @Override
    public Bullet createBullet(double x, double y, Game game) {
        return new SpriteBullet(x, y, game);
    }

    @Override
    public BackgroundRenderer createBackgroundRenderer() {
        return new BitmapBackgroundRenderer();
    }
}