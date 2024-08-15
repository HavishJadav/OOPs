package org.example;

// Protagonist class
class Protagonist extends Character {
    // Class representing a monster, inheriting from Character
    protected boolean elixir;

    public Protagonist(int health,int positionX,int positionY) {
        super(health,positionX,positionY);
        this.elixir = false;
    }

    void consumeElixir() {
        if (elixir) {
            health += 500;
        }
    }

    @Override
    void moveLeft() {
        positionX--;
    }

    @Override
    void moveRight() {
        positionX++;
    }

    @Override
    void moveTop() {
        positionY++;
    }

    @Override
    void moveBottom() {
        positionY--;
    }

    @Override
    int healthStatus() {
        return health;
    }

    @Override
    String getPosition() {
        return "(" + positionX + ", " + positionY + ")";
    }


    @Override
    boolean aliveStatus() {
        return alive;
    }
}
