public abstract class Carnivores extends Animal {

    public Carnivores(String name) {
        super(name);
    }

    public String feed(){
        return "meat";
    }
}
