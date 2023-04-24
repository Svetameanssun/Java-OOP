public class Main {
    public static void main(String[] args) {
        Zoo zoo = new Zoo();
        zoo.setRadio(new Radio());
        zoo.addAnimal(new Wolf("Walter"))
                .addAnimal(new Hare("Harry"))
                .addAnimal(new Duck("Duke"))
                .addAnimal(new Bat("Betty"))
                .addAnimal(new Bear("Bob"))
                .addAnimal(new Dove("Daphne"));
//        System.out.println(zoo.getWalkable());

        for (var item:zoo.getListAnimal()
             ) {
            System.out.println(item);
        }
        System.out.println("------------------------------------------------------------");
        System.out.println("Sounds...");
        System.out.println("------------------------------------------------------------");
        for (var item:zoo.getSayable()) {
            System.out.println(item.say());

        }
        System.out.println("------------------------------------------------------------");
        System.out.println("Walking animals:\n");
        for (var item:zoo.getWalkable()){
            System.out.println(item.toString());
            System.out.println(item.walkingSpeed());
        }
        System.out.println("\n");
        System.out.println("Flying animals:\n");
        for (var item: zoo.getFlyable()) {
            System.out.printf("%s - %d\n", item.toString(), item.flyingSpeed());
        }
        System.out.println("\n");
        System.out.println("Swimming animals:\n");
        for (var item: zoo.getSwimable()) {
            System.out.printf("%s - %d\n", item.toString(), item.swimmingSpeed());
        }
        System.out.println("------------------------------------------------------------");
        System.out.println("The fastest runner:");
        System.out.println("Winner - " + zoo.winnerWalkable());
        System.out.println("\n");
        System.out.println("The fastest flier:");
        System.out.println("Winner - " + zoo.winnerFlyable());
        System.out.println("\n");
        System.out.println("The fastest swimmer:");
        System.out.println("Winner - " + zoo.winnerSwimable());
    }
}
