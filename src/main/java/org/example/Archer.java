package org.example;

public class Archer extends Hero{
    public Archer(String name){
        super(name, 50);
    }

    @Override
    public void attackEnemy(Enemy enemy) {
        int damage = 25;
        enemy.takeDamage(damage);
        System.out.println(getName() + " kills an enemy, dealing " + damage + " DAMAGE");
    }

}
