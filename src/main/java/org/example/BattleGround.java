package org.example;

public class BattleGround {
    public static void main(String[] argc){

        Archer archer = new Archer("Ruslan");
        archer.attackEnemy(25);
        System.out.println("EnimyHealth: " + archer.enemy.getHealth());
        System.out.println(archer.enemy.isAlive() + "\n");



        Mage mage = new Mage("Roman");
        mage.attackEnemy(50);
        System.out.println("EnimyHealth: " + mage.enemy.getHealth());
        System.out.println(mage.enemy.isAlive() + "\n");



        Warrior warrior = new Warrior("Vasiliy");
        warrior.attackEnemy(100);
        System.out.println("EnimyHealth: " + warrior.enemy.getHealth());
        System.out.println(warrior.enemy.isAlive() + "\n");
    }
}
