public class Main   {
    public static void main(String[] args) {

        Team<Archer> archers  = new Team<>();
        archers.addWarrior(new Archer("Sir Arthur", new Bow(),30));
        archers.addWarrior(new Archer("Sir Timothy", new Bow(),40));
        archers.addWarrior(new Archer("Sir Gregory", new Bow(),25));

        Team<Swordsman> assassins  = new Team<>();
        assassins.addWarrior(new Swordsman("Sir Anthony", new Sword(),30));
        assassins.addWarrior(new Swordsman("Sir David", new Sword(),25));
        assassins.addWarrior(new Swordsman("Sir Roger", new Sword(),40));

        System.out.println(archers);
        System.out.println("--------------------------");
        System.out.println(assassins);

    }
}
