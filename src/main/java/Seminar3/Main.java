package Seminar3;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.InputStream;
import java.util.Arrays;
/*
Создать обобщенный класс с тремя параметрами (T, V, K).
 Класс содержит три переменные типа (T, V, K), конструктор, принимающий на вход
 параметры типа (T, V, K), методы возвращающие значения трех переменных.
 Создать метод, выводящий на консоль имена классов для трех переменных класса.
 Наложить ограничения на параметры типа: T должен реализовать интерфейс
 Comparable (классы оболочки, String), V должен реализовать интерфейс
 DataInput и расширять класс InputStream, K должен расширять класс
Number.
Задача 2
Написать итератор по массиву. Итератор - это объект, осуществляющий движение по коллекциям любого типа,
содержащим любые типы данных. Итераторы обычно имеют только два метода - проверка на наличие след. эл-та и переход
к следующему эл-ту. Но также, особенно в других языках программирования, возможно встретить итераторы,
реализующие доп. логику.
Задача 3
Описать интерфейс Person с методами doWork() и haveRest(). Написать два класса работник и бездельник,
реализующих интерфейс. Работник работает, и не умеет бездельничать, в то время как бездельник не умеет работать,
но умеет отдыхать. Написать обобщённые классы Workplace и Club, содержащие массив из Person. В классах необходимо
вызывать у всего массива людей вызывать соответствующие методы


*/

public class Main {
    public static void main(String[] args) {
//        FileInputStream fis;
//        Box<String, Integer, InputStream> box1;
//        try {
//            fis = new FileInputStream("file");
//            box1 = new Box<>("Word",5, fis);
//        } catch (FileNotFoundException e) {
//            throw new RuntimeException(e);
//        }
//
//        box1.printClassName();
        MyCollection<Integer> collection = new MyCollection<>();
        collection.addElement(1);
        collection.addElement(34);
        collection.addElement(66);
        collection.addElement(66);
        collection.addElement(66);
        collection.addElement(66);
        collection.addElement(66);
        collection.addElement(66);
        collection.addElement(66);
        collection.addElement(66);
        collection.addElement(66);
        collection.addElement(66);
        collection.addElement(66);

        System.out.println(Arrays.toString(collection.getValue()));
        collection.deleteElement(34);
        collection.deleteElement(31);
        System.out.println(Arrays.toString(collection.getValue()));

        MyCollectionIterator<Object> myCollectionIterator = new MyCollectionIterator<>(collection.value);

        while (collection.hasNext()) {
            System.out.println(collection.next());
        }
    }
}


/*
Описать интерфейс Person c методами doWork() и haveRest().
Написать два класса работник и бездельник, реализующих интерфейс.
Работник работает и не умеет бездельничать, в то время как бездельник
не умеет работать, но умеет отдыхать. Написать обобщенные классы Workplace и Club,
содержащие массив из Person. В классах необходимо вызывать у всего массива людей
вызывать соответствующие методы.
*/
