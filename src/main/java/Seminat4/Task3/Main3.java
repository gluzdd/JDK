package Seminat4.Task3;


import java.util.*;

/*
Создайте телефонный справочник с помощью Map - телефон это ключ, а имя
значение
● Найдите человека с самым маленьким номером телефона
● Найдите номер телефона человека чье имя самое большое в алфавитном порядке


 */
public class Main3 {
    public static void main(String[] args) {
        Map<String, String> phonebook = Map.of("99", "Ivan", "77", "Anna", "55", "Svetlana", "111", "Ira", "222", "Oleg");
        Set<String> phones = phonebook.keySet();
        System.out.println();
//        String keyMin = Collections.min(phones, (o1, o2) -> o1.length() - o2.length());
//        System.out.println(phonebook.get(keyMin) + " - > " + keyMin);
        Comparator<String> myComporator = new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                if ((o1.length() == o2.length())) {
                    return o1.compareTo(o2);
                }
                return o1.length() - o2.length();
            }
        };
        String keyMin = Collections.min(phones, myComporator);
//        System.out.println(phonebook.get(keyMin) + " - > " + keyMin);

        Collection<String> names = phonebook.values();
        String nameMax = Collections.max(names, (o1, o2) -> o1.compareTo(o2));
        List<String> namePhones = new ArrayList<>();
        for (var entry : phonebook.entrySet()) {
            if (nameMax.equals(entry.getValue())) {
                namePhones.add(entry.getKey());
            }
        }
        for (String namePhone : namePhones) {
            System.out.println(nameMax + " -> " + namePhone);
        }
    }
}
