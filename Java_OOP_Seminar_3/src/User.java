public class User implements Comparable<User> {
    private String firstName;
    private String lastName;
    private int age;

    public Personnel getSubordinate() {
        return subordinate;
    }

    public void setSubordinate(Personnel subordinate) {
        this.subordinate = subordinate;
    }

    private Personnel subordinate;

    public User(String firstName, String lastName, int age) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
    }

    @Override
    public String toString() {
        return String.format("\nFirst name: %s, Last name: %s, age: %d", firstName, lastName, age);
    }

    @Override
    public int compareTo(User o) {
        int compareNames = this.firstName.compareTo(o.firstName);
        if(compareNames!=0) return compareNames;
        int compareLastnames = this.lastName.compareTo(o.lastName);
        if(compareLastnames!=0) return compareLastnames;
//        Все что  ниже можно написать одной строчкой
//        if (this.age < o.age) {
//            return -1;
//        } else if (this.age > o.age) {
//            return 1;
//        } else {
//            return 0;
//        }
//        Вот этой строчкой!
        return this.age - o.age;
    }
}
