package Homework_Java_OOP_Seminar_4;

public class Battle {
    private Warrior one;
    private Warrior two;

    private Warrior draw;

    public Battle(Warrior one, Warrior two){
        this.one = one;
        this.two = two;
    }

    public Warrior battleField(){
        Warrior winner = null;
        while(one.getHealthPoints()>0&&two.getHealthPoints()>0) {
            if (one.getHealthPoints() > 0) {
                winner = turn(one, two);
            }
            if (two.getHealthPoints() > 0) {
                winner = turn(two, one);
            }
        }
        return winner;
    }

    public Warrior turn(Warrior first, Warrior second){
        int hitOne = first.hit();
        System.out.printf("%s hp: %s\n",first.getName(),first.getHealthPoints());
        System.out.printf("%s hp: %s\n",second.getName(), second.getHealthPoints());
        System.out.printf("%s casted damage %s\n",first.getName(),hitOne);
        int protectTwo = second.protect();
        if (hitOne < protectTwo){
            second.setHealthPoints(second.getHealthPoints());
        } else {
            System.out.printf("%s used shield %s\n", second.getName(), protectTwo);
            second.setHealthPoints(second.getHealthPoints() - hitOne + protectTwo);
            System.out.printf("%s 's hp now: %s\n", second.getName(), second.getHealthPoints());
        }
        if (second.getHealthPoints()<=0) {
            return first;
        }
        return second;
    }

    @Override
    public String toString() {
        return String.format("The winner: %s", battleField().getName());
    }
}
