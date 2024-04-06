package Seminat4.Task2;

import java.util.*;

/*
● Создайте коллекцию мужских и женских имен с помощью интерфейса List -
добавьте повторяющиеся значения
● Получите уникальный список Set на основании List
● Определите наименьший элемент (алфавитный порядок)
● Определите наибольший элемент (по количеству букв в слове но в обратном
порядке)
● Удалите все элементы содержащие букву ‘A’
 */
public class Main2 {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("Ivan", "Ana", "Ivan", "Ira", "Sveta", "Ira", "Valentin", "Alexey");
        System.out.println(names);
        Set<String> uniqueNames = new HashSet<>(names);
        System.out.println(uniqueNames);

        System.out.println(Collections.min(uniqueNames));
        System.out.println();

//        System.out.println(uniqueNames.stream().min((o1, o2) -> o1.compareTo(o2)).get());
        System.out.println(Collections.max(uniqueNames, (o1, o2) -> o2.length() - o1.length()));

        uniqueNames.removeIf(o -> o.contains("A"));
        System.out.println(uniqueNames);
        Iterator<String> iterator = uniqueNames.iterator();
        while (iterator.hasNext()) {
            String element = iterator.next();
            if (element.contains("A")) {
                iterator.remove();
            }
        }
        System.out.println(uniqueNames);
    }
}
