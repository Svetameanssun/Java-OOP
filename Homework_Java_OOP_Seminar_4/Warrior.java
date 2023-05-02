import java.util.Random;

public abstract class Warrior<T extends Weapon,T extends Shield>{
    private String name;

    public T getWeapon() {
        return weapon;
    }

    protected T weapon;

    public Shield getShield() {
        return shield;
    }

    protected Shield shield;

    private int healthPoints;

    //class Warrior constructor:
    public Warrior(String name, T weapon, Shield shield, int healthPoints){
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
