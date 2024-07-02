package org.example;

public class Archer extends Hero{
    public Archer(String name){
        super(name);
    }

    @Override
    public void attackEnemy(int archerDamage){
        enemy.takeDamage(archerDamage);
        System.out.println("ArcherAttacksEnemy: " + archerDamage);
    }

}
