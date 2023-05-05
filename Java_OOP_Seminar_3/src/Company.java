import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Company implements Iterable<User>{
    private User user;
    public Company(User user){
        this.user = user;
    }

    private List<User> deepTree(User user){
        List<User> subordinatesList = new ArrayList<>();
        subordinatesList.add(user);
        if(user.getSubordinate()== null || user.getSubordinate().getSize()==0){
            return subordinatesList;
        }
        for (User item:user.getSubordinate()
             ) { subordinatesList.addAll(deepTree(item));

        }
        return subordinatesList;
    }


    @Override
    public Iterator<User> iterator() {
        //Ниже анонимный класс
        return new Iterator<User>() {
            List<User>iterUser = deepTree(user);
            Iterator<User> iterator = iterUser.iterator();
            int index = 0;
            @Override
            public boolean hasNext() {
                return iterator.hasNext();
            }

            @Override
            public User next() {
                return iterator.next();
            }
        };
    }

}
