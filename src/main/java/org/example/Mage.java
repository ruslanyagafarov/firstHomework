package org.example;

public class Mage extends Hero{
    public Mage(String name){
        super(name,30);
    }

    @Override
    public void attackEnemy(Enemy enemy) {
        int damage = 30;
        enemy.takeDamage(damage);
        System.out.println(getName() + " kills an enemy, dealing " + damage + " DAMAGE");
    }

}
