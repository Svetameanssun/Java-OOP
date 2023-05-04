package Homework_Java_OOP_Seminar_4;
import java.util.Random;

public class Archer extends Warrior<Bow, BucklerShield>{

    public Archer(String name, Bow bow, BucklerShield bucklerShield, int healthPoints) {
        super(name, bow, bucklerShield, healthPoints);
    }
    int range(){
        Random random = new Random();
        return random.nextInt(weapon.range());
    }

    @Override
    public String toString() {
        return String.format("Archer %s", super.toString());
    }
}
