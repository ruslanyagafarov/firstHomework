package org.example;

public class Warrior extends Hero{
    public Warrior(String name){
        super(name, 5);
    }

    @Override
    public void attackEnemy(Enemy enemy) {
        int damage = 28;
        enemy.takeDamage(damage);
        System.out.println(getName() + " kills an enemy, dealing " + damage + " DAMAGE");
    }
}
