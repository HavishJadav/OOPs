package org.example;

abstract class Character {
    // Abstract class representing common characteristics of characters
    protected int health;
    protected int positionX;
    protected int positionY;
    protected boolean alive;

    public Character(int health,int positionX,int positionY) {
        this.health = health;
        this.positionX = positionX;
        this.positionY = positionY;
        this.alive = true;
    }

    abstract void moveLeft();
    abstract void moveRight();
    abstract void moveTop();
    abstract void moveBottom();
    abstract int healthStatus();
    abstract String getPosition();
    abstract boolean aliveStatus();
}
