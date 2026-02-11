package com.balitechy.spacewar.main;

public interface GameFactory {
    public Player createPlayer(double x, double y, Game game);
    public Bullet createBullet(double x, double y, Game game);
    public BackgroundRenderer createBackgroundRenderer();
}