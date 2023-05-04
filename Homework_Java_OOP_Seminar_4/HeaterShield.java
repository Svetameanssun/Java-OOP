package Homework_Java_OOP_Seminar_4;
public class HeaterShield implements Shield{
    @Override
    public int protection() {
        return 30;
    }

    @Override
    public String toString() {
        return String.format("Heater Shield gives %d points of protection", protection());
    }
}
