package org.example;

public class Enemy implements Mortal {
    private int health;

    public Enemy(int health){
        this.health = health;
    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public void takeDamage(int damage){
        health -= damage;
        if (health <= 0){
            health = 0;
        }
        System.out.println("Enemy takes " + damage + " DAMAGE, remaining health: " + health);
    }

    @Override
    public boolean isAlive() {
        if (health > 0)
            return true;
        else
            return false;
    }
}
