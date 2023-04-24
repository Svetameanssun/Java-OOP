public abstract class Animal implements Sayable {
    public Animal(String name) {
        this.name = name;
    }

    private String name;

//    /**Это пример создания абстрактного метода*/
//    public abstract String say();
//    Этот метод мы выкинули в интерфейс

    public abstract String feed();

    @Override
    public String toString() {
        return String.format("Name %s, says %s, eats %s",this.name, say(),feed());
    }
}
