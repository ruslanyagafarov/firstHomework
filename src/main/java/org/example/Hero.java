package org.example;

abstract class Hero {
    private String name;

    public Hero (String name){
        this.name = name;
    }

    public String getName() {
        return name;
    }

    Enemy enemy = new Enemy(100);

    abstract void attackEnemy(int damage);
}
