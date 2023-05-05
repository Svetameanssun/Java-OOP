import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Personnel implements Iterable<User>{
    List<User> users = new ArrayList<>();

    @Override
    public Iterator<User> iterator() {
        return new Iterator<User>() {
            int index = 0;
            @Override
            public boolean hasNext() {
                return index<users.size();
            }

            @Override
            public User next() {
                return users.get(index++);
            }
        };
    }
    public Personnel addUser(User user){
        users.add(user);
        return this;
    }

    //создадим метод, который Users в toList отправляет
    public List<User> toList(){
        List<User> result = new ArrayList<>();
        for (User user: this) {
            result.add(user);
        }
        return result;
    }

    public int getSize(){
        return users.size();
    }
}
