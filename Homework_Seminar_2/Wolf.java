public class Wolf extends Carnivores implements Walkable, Swimable{
    public Wolf(String name) {
        super(name);
    }

    @Override
    public String say() {
        return "Uuuuu";
    }

    @Override
    public String toString() {
        return String.format("Wolf %s", super.toString());
    }

    @Override
    public int walkingSpeed() {
        return 70;
    }

    @Override
    public int swimmingSpeed() {
        return 10;
    }
}
