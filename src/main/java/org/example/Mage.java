package org.example;

public class Mage extends Hero{
    public Mage(String name){
        super(name);
    }

    @Override
    public void attackEnemy(int mageDamage){
        enemy.takeDamage(mageDamage);
        System.out.println("MageAttacksEnemy: " + mageDamage);
    }

}
