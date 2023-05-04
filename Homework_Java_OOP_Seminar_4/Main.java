package Homework_Java_OOP_Seminar_4;
public class Main   {
    public static void main(String[] args) {

        Team<Archer> archers  = new Team<>();
        archers.addWarrior(new Archer("Sir Arthur", new Bow(), new BucklerShield(),30));
        archers.addWarrior(new Archer("Sir Timothy", new Bow(),new BucklerShield(),40));
        archers.addWarrior(new Archer("Sir Gregory", new Bow(),new BucklerShield(),25));

        Team<Swordsman> swordsmen  = new Team<>();
        swordsmen.addWarrior(new Swordsman("Sir Anthony", new Sword(),new HeaterShield(),30));
        swordsmen.addWarrior(new Swordsman("Sir David", new Sword(),new HeaterShield(),25));
        swordsmen.addWarrior(new Swordsman("Sir Roger", new Sword(),new HeaterShield(),40));

        System.out.println(archers);
        System.out.println("--------------------------");
        System.out.println(swordsmen);

    }
}
