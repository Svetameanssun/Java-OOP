public class Main {
    public static void main(String[] args) {
        Zoo zoo = new Zoo();
        zoo.setRadio(new Radio());
        zoo.addAnimal(new Wolf("Walter"))
                .addAnimal(new Hare("Harry"))
                .addAnimal(new Duck("Duke"));
//        System.out.println(zoo.getWalkable());

        for (var item:zoo.getListAnimal()
             ) {
            System.out.println(item);
        }
        System.out.println("Sounds...\n");
        for (var item:zoo.getSayable()) {
            System.out.println(item.say());

        }
        System.out.println("Waling animals:\n");
        for (var item:zoo.getWalkable()){
            System.out.println(item.toString());
            System.out.println(item.walkingSpeed());

        }
        System.out.println("Flying animals:\n");
        for (var item: zoo.getFlyable()) {
            System.out.printf("%s - %d\n", item.toString(), item.flyingSpeed());
        }
        System.out.println("The fastest runner:");
        System.out.println("Winner - " + zoo.winnerWalkable());
    }
}
