package org.example;

public abstract class Hero {
    private String name;
    private int health;

    public Hero (String name, int health){
        this.name = name;
        this.health = health;
    }

    public String getName() {
        return name;
    }

    public int getHealth() {
        return health;
    }

    public void takeDamage(int damage){
        health -= damage;
        if (health <= 0){
            health = 0;
        }
        System.out.println(name + " takes " + damage + " DAMAGE, remaining health: " + health);
    }

    public boolean isAlive() {
        if (health > 0)
            return true;
        else
            return false;
    }

    abstract void attackEnemy(Enemy enemy);
}
