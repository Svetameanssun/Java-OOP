package Homework_Java_OOP_Seminar_4;
public class Swordsman extends Warrior<Sword, HeaterShield>{
    public Swordsman(String name, Sword sword, HeaterShield heaterShield, int healthPoints) {
        super(name, sword, heaterShield,healthPoints);
    }

    @Override
    public String toString() {
        return String.format("Swordsman %s", super.toString());
    }


}
