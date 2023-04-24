public class Bear extends Omnivores implements Walkable,Swimable{
    public Bear(String name) {
        super(name);
    }

    @Override
    public String say() {
        return "Rooooaaaaar!";
    }

    @Override
    public int swimmingSpeed() {
        return 50;
    }

    @Override
    public int walkingSpeed() {
        return 80;
    }
}
