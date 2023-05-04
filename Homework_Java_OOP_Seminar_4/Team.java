package Homework_Java_OOP_Seminar_4;
import java.util.ArrayList;
import java.util.List;

public class Team<T extends Warrior> {
    List<T> team = new ArrayList<>();


    public Team<T> addWarrior(T warrior){
        team.add(warrior);
        return this;
    }

    public String toString(){
        StringBuilder stringBuilder = new StringBuilder();
        for(T item:team){
            stringBuilder.append(item);
            stringBuilder.append("\n");
        }
        stringBuilder.append(String.format("healthPoints %s, damage %d, max range %d, protection sum %d",healthPoints(), getDamage(), maxRange(), getProtection()));
        return stringBuilder.toString();
    }

    public int healthPoints(){
         int summa = 0;
        for (T item: team
             ) { summa += item.getHealthPoints();
        }
        return summa;
    }

    public int getDamage(){
        int summa=0;
        for (T item:team
             ) {summa+=item.getWeapon().damage();
        }
        return summa;
    }

    public int getProtection() {
        int summa = 0;
        for (T item : team)
        {summa+=item.getShield().protection();}
        return summa;
    }

    public int maxRange(){
        int max =0;
        for (T item: team
             ) { if(item instanceof Archer){
                 if(max <((Archer)item).range()){
                     max = ((Archer)item).range();
                 }
        }
        }
        return max;
    }

}
