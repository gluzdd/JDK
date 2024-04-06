package Lesson4;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Collection<Integer> collection = List.of(1,2,3,4,5);
        Iterator<Integer> iterator = collection.iterator();
        while (iterator.hasNext()) {
            System.out.print(iterator.next() + " ");
        }
        System.out.println();
        // for each
        for (Integer value : collection) {
            System.out.print(value + " ");
        }
        System.out.println();
        // Stream API
        collection.stream()
                .forEach(value -> System.out.print(value + " "));
        System.out.println();
        collection.stream().forEach(System.out::print);

        ArrayList<Integer>list = new ArrayList<>(collection);
        // [] <- 1
        // [_], [1] <- 2
        // [1], [_ _], [1 _], [1 2] <- 3
        // [1 2], [_ _ _ _], [1 2 _ _], [1 2 3 _] <-4 O(1)
        // [1 2 3 4 5] <- 7, 2 O(n)
        // [_ _ _ _ _ _ _ _ _ _]
        // [1 2 3 4 5 _ _ _ _ _]
        // [1 2 3 3 4 5 _ _ _ _]
        // [1 2 7 3 4 5 _ _ _ _]
        // list.get(1) O(1)
        // list.set(1, 2) O(1)
        // list.contains() O(n)
        System.out.println();
        Map<String, Integer> map = Map.of("Hello" ,1, "World" ,2);
        // for each
        for(var entry: map.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
        for (String s : map.keySet()) {
            System.out.println(s + ": " + map.get(s));
        }
        // Stream
        map.forEach((k, v) -> System.out.println(k+ ": " + v));
    }
}
