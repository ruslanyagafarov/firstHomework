package org.example;

public class Warrior extends Hero{
    public Warrior(String name){
        super(name);
    }

    @Override
    public void attackEnemy(int warriorDamage){
        enemy.takeDamage(warriorDamage);
        System.out.println("WarriorAttacksEnemy: " + warriorDamage);
    }
}
