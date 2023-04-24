public class Dove extends Omnivores implements Flyable,Walkable{

    public Dove(String name) {
        super(name);
    }

    @Override
    public int flyingSpeed() {
        return 50;
    }

    @Override
    public String say() {
        return "Guli-guli!";
    }

    @Override
    public int walkingSpeed() {
        return 3;
    }
}
