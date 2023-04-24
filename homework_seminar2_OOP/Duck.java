public class Duck extends Herbivores implements Flyable, Walkable{

    public Duck(String name) {
        super(name);
    }

    @Override
    public String say() {
        return "Krya-Krya";
    }

    @Override
    public int flyingSpeed() {
        return 80;
    }

    @Override
    public int walkingSpeed() {
        return 5;
    }
}
