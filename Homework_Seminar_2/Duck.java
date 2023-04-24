public class Duck extends Omnivores implements Flyable, Walkable, Swimable{

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


    @Override
    public int swimmingSpeed() {
        return 70;
    }
}
