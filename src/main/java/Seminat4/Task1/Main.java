package Seminat4.Task1;

import java.util.*;

/*
   Создайте коллекцию мужских и женских имен с помощью интерфейса List
   ● Отсортируйте коллекцию в алфавитном порядке
   ● Отсортируйте коллекцию по количеству букв в слове
   ● Разверните коллекцию
*/
public class Main {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("Ivan", "Anna", "Ira", "Sveta", "Valentin", "Alex");
        System.out.println(names);
        Collections.sort(names);
        System.out.println(names);
        Collections.sort(names, (o1, o2) -> o1.length() - o2.length());
        System.out.println(names);
        Collections.reverse(names);
        System.out.println(names);

        names.sort(Comparator.comparingInt(String::length));
        System.out.println(names);

    }
}
