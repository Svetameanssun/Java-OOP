import java.util.ArrayList;
import java.util.List;

public class Zoo {
    private final List<Animal> listAnimal = new ArrayList<>();

    public List<Animal> getListAnimal(){
        return listAnimal;
    }
    public Zoo addAnimal(Animal animal){
        listAnimal.add(animal);
        return this;
    }
    private Radio radio;

    public void setRadio(Radio radio) {
        this.radio = radio;
    }
    public List<Sayable> getSayable(){
        List<Sayable> sayables = new ArrayList<>();
        for (var item: listAnimal) {
            sayables.add(item);
        }
        sayables.add(radio);
        return sayables;
    }
    public List<Walkable> getWalkable(){
        List<Walkable> walkables = new ArrayList<>();
        for (var item:listAnimal
             ) {
            if(item instanceof Walkable){
            walkables.add((Walkable)(item));
        }
        }
        return walkables;
    }

    public List<Flyable> getFlyable(){
        List<Flyable> flyables = new ArrayList<>();
        for (var item:listAnimal) {
            if (item instanceof Flyable)
                 flyables.add((Flyable)item);

        }
        return flyables;
    }

    public List<Swimable> getSwimable(){
        List<Swimable> swimables = new ArrayList<>();
        for(var item: listAnimal) {
            if (item instanceof Swimable)
                swimables.add((Swimable) item);
        }
        return swimables;
    }


    /**Метод, с помощью которого мы находим самого быстрого*/

    public Walkable winnerWalkable(){
        int index = 0;
        for (int i = 0; i < getWalkable().size(); i++) {
            if(getWalkable().get(i).walkingSpeed() > getWalkable().get(index).walkingSpeed()){
                index = i;
            }
        }
        return getWalkable().get(index);
    }

    public Flyable winnerFlyable(){
        int index = 0;
        for (int i = 0; i < getFlyable().size(); i++) {
            if(getFlyable().get(i).flyingSpeed() > getFlyable().get(index).flyingSpeed()){
                index = i;
            }
        }
        return getFlyable().get(index);
    }

    public Swimable winnerSwimable(){
        int index = 0;
        for (int i = 0; i < getSwimable().size(); i++) {
            if(getSwimable().get(i).swimmingSpeed() > getSwimable().get(index).swimmingSpeed()){
                index = i;
            }
        }
        return getSwimable().get(index);
    }
}
