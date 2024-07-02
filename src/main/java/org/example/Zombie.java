package org.example;

public class Zombie extends Enemy {
    public Zombie(int health) {
        super(health);
    }

    public boolean isAlive(){
        if(super.isAlive()){
            return true;
        }
        else {
            double reborn = Math.random();
            if (reborn < 0.5) {
                setHealth(25);
                System.out.println("Zombie have 25 HP");
                return true;
            }
            return false;
        }
    }
}
