package org.example;

// Weapon class
class Weapon {
    // Class representing weapons
    int id;
    int valuePerAttack;
    public Weapon(int id, int valuePerAttack) {
        this.id = id;
        this.valuePerAttack = valuePerAttack;
    }

    static void attack_m2p(Protagonist protagonist, Weapon weapon) {
        protagonist.health -= weapon.valuePerAttack;

        if (protagonist.health <= 0) {
            protagonist.alive = false;
            protagonist.health=0;
        }
    }

    static void attack_p2m(Monster monster, Weapon weapon) {
        monster.health -= weapon.valuePerAttack;

        if (monster.health <= 0) {
            monster.alive = false;
            monster.health=0;
        }
    }
}
