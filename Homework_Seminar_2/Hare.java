public class Hare extends Herbivores implements Walkable,Swimable {

    public Hare(String name) {
        super(name);
    }

    @Override
    public String say() {
        return "Pipipi";
    }

    @Override
    public String toString() {
        return String.format("Hare %s",super.toString());
    }

    @Override
    public int walkingSpeed() {
        return 80;
    }

    @Override
    public int swimmingSpeed() {
        return 5;
    }
}
