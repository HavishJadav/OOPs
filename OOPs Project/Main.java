package org.example;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.Scanner;


// Main.java
public class Main {
    public static void main(String[] args) {
        //
        Scanner scanner= new Scanner(System.in);

        Monster monster = new Monster(1,1000,0,0);
        Protagonist protagonist = new Protagonist(200,1,1);

        Weapon weapon1 = new Weapon(1, 100);
        Weapon weapon2 = new Weapon(2, 250);
        Weapon weapon3 = new Weapon(3, 750);
        Weapon weapon4 = new Weapon(4, 5);

        List<Weapon> weaponList= new ArrayList<>();
        weaponList.add(weapon1);
        weaponList.add(weapon2);
        weaponList.add(weapon3);
        weaponList.add(weapon4);

        int temp = 0;
        int temp1 = 1;

        // Simulate interactions
        while(monster.aliveStatus() && protagonist.aliveStatus()) {
            System.out.println("Enter 1 for attack ");
            System.out.println("Enter 2 to know position monster and protagonist");
            int s = scanner.nextInt();


            if (s == 1) {
                //Weapons of both parties
                System.out.println("Enter weapon for protagonist: ");
                int x = scanner.nextInt();
                System.out.println("Enter weapon for monster: ");
                int y = scanner.nextInt();

                //Elixir
                if (temp1 == 1) {
                    System.out.println("If you want use elixir(1/0)");

                    int elixir = scanner.nextInt();
                    if (Objects.equals(elixir, 1)) {

                        protagonist.elixir = true;
                        protagonist.consumeElixir();
                        temp1 = 0;

                    }
                }

                //Dealing Damage
                Weapon protagonistweapon = getWeapon(x, weaponList);
                Weapon monsterweapon = getWeapon(y, weaponList);
                Weapon.attack_m2p(protagonist, monsterweapon);

                if (!protagonist.aliveStatus()) {
                    temp = 1;
                }
                Weapon.attack_p2m(monster, protagonistweapon);
                if (!monster.aliveStatus() && temp == 0) {
                    temp = 2;
                }

                System.out.println("Monster health: " + monster.healthStatus());
                System.out.println("Protagonist health: " + protagonist.healthStatus());
                System.out.println();
            } else {
                System.out.println("position of monster: " + monster.getPosition());
                System.out.println("position of protagonist: " + protagonist.getPosition());
                System.out.println();
            }

            //Moving Position
            monster.moveRight();
            protagonist.moveLeft();
        }
        if(temp==1){
            System.out.println("protagonist is dead");
        }
        else {
            System.out.println("monster is dead");
        }

    }

    // A utility function to get a weapon based on the selected option
    private static Weapon getWeapon(int temp,List<Weapon> weaponList){
        switch(temp)
        {
            case 1:
                return weaponList.get(0);

            case 2:
                return weaponList.get(1);

            case 3:
                return weaponList.get(2);

            default:
                return weaponList.get(3);

        }
    }
}