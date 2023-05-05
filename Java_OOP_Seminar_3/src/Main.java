import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Personnel personnel = new Personnel();
        personnel.addUser(new User("Ivana", "Ivanova", 40))
                .addUser(new User("Petra", "Petrova", 31))
                .addUser(new User("Irina", "Semenova", 32))
                .addUser(new User("Chris","Hoppenbrouwers",103))
                .addUser(new User("Ivana", "Ivanova", 12));

//        for (User user: personnel) {
//            System.out.println(user);
//        }
////        Цикл for можно использовать вместо iterable НО!
////        тогда user нельзя будет сделать private
////        for (int i = 0; i < personnel.users.size(); i++) {
////            System.out.println(personnel.users.get(i));
////        }
//        System.out.println("----------------------------------------------------");
//        List<User> users = personnel.toList();
//        Collections.sort(users);
//        System.out.println(users);
//
//    }

        Personnel personnel2 = new Personnel();
        personnel.addUser(new User("Tanya", "Ivanova", 18));

        User user = new User("Lena","Petrova", 25);
        user.setSubordinate(personnel);

        personnel2.addUser(user);
        User boss = new User("Boss","Big",32);
        boss.setSubordinate(personnel2);

        Company company = new Company(boss);
        for (User subordinate:company
             ) {
            System.out.println(subordinate);

        }

    }
}