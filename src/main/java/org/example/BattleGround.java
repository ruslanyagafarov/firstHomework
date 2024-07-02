package org.example;

public class BattleGround {
    public static void main(String[] argc){
        Hero archer = new Archer("Ruslan");
        Hero mage = new Mage("Roman");
        Hero warrior = new Warrior("Vasiliy");

        Enemy enemy = new Enemy(50);
        Enemy zombie = new Zombie(25);

        battle(archer, enemy);
        battle(mage, zombie);
        battle(warrior, zombie);
    }

    public static void battle(Hero hero, Enemy enemy){
        while (hero.isAlive() && enemy.isAlive()) {
            hero.attackEnemy(enemy);
            if (enemy.isAlive()) {
                int enemyDamage = 20;
                hero.takeDamage(enemyDamage);
                System.out.println("Enemy attacks " + hero.getName() + " dealing " + enemyDamage + " DAMAGE");
            }
        }
        if (!hero.isAlive()) {
            System.out.println(hero.getName() + " died");
        } else if (!enemy.isAlive()) {
            System.out.println("Enemy died by " + hero.getName());
        }
    }
}
