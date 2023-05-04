package Homework_Java_OOP_Seminar_4;
import java.util.Random;

public abstract class Warrior<T extends Weapon, B extends Shield>{
    public String getName() {
        return name;
    }

    private String name;

    public T getWeapon() {
        return weapon;
    }

    protected T weapon;

    public B getShield() {
        return shield;
    }

    protected B shield;

    public void setHealthPoints(int healthPoints) {
        this.healthPoints = healthPoints;
    }

    private int healthPoints;

    //class Warrior constructor:
    public Warrior(String name, T weapon, B shield, int healthPoints){
        this.name = name;
        this.weapon = weapon;
        this.shield = shield;
        this.healthPoints = healthPoints;

    }

    @Override
    public String toString() {
        return String.format("Name: %s, Weapon: %s, Shield:%s, healthPoint: %d", name, weapon,shield, healthPoints);
    }

    public int hit(){
        Random random = new Random();
        return random.nextInt(weapon.damage());
    }

    public int protect(){
        Random random = new Random();
        return random.nextInt(shield.protection());
    }

    public int getHealthPoints() {
        return healthPoints;
    }
}
