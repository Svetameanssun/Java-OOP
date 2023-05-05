public class Bat extends Predator implements Flyable{
    public Bat(String name) {
        super(name);
    }

    @Override
    public String say() {
        return "Fr-fr-fr";
    }

    @Override
    public int flyingSpeed() {
        return 100;
    }
}
