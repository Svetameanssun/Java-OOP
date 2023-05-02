public class Swordsman extends Warrior<Sword>{
    public Swordsman(String name, Sword sword, Shield shield, int healthPoints) {
        super(name, sword, shield,healthPoints);
    }

    @Override
    public String toString() {
        return String.format("Swordsman %s", super.toString());
    }


}
