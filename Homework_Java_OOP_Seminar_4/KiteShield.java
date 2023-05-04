package Homework_Java_OOP_Seminar_4;
public class KiteShield implements Shield{
    @Override
    public int protection() {
        return 15;
    }

    @Override
    public String toString() {
        return String.format("Kite Shield gives %d points of protection", protection());
    }
}
