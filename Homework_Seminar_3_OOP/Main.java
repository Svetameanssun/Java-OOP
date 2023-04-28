package Homework_Seminar_3_OOP;
//Урок 3.
//        Создать список по аналогии LinkedList (список связанных элементов),
//        реализовать в нем iterable интерфейс. Список должен содержать элементы
//        со ссылкой на следующий элемент (если показалось мало, то реализовать
//        ссылку и на предыдущий элемент)
public class Main {
    public static void main(String[] args)
    {
        // Create Linked List
        List<String> myList = new List<>();

        // Add Elements
        myList.add("abc");
        myList.add("mno");
        myList.add("pqr");
        myList.add("xyz");

        // Iterate through the list using For Each Loop
        for (String string : myList){
            System.out.println(string);
    }
}
}

