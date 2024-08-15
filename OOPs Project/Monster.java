package org.example;

// Monster class
class Monster extends Character {
    private final int id;

    public Monster(int id,int health,int positionX,int positionY) {
        super(health,positionX,positionY);
        this.id = id;
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
