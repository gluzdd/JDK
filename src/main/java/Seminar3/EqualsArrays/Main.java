package Seminar3.EqualsArrays;

import static Seminar3.EqualsArrays.EqualsArrays.compareArrays;

public class Main {
    public static void main(String[] args) {

        Integer[] array1 = {123,234,345};
        String [] array2 = {"12.3","2.34","3.45"};
        System.out.println(compareArrays(array1, array2));
        String [] array3 = {"12sdf3","234","345sdfs"};
        String [] array4 = {"12df3","23fsdf4","345"};
        System.out.println(compareArrays(array3, array4));
        Integer[] array5 = {123,234,345};
        Integer[] array6 = {123,234,345};
        System.out.println(compareArrays(array5, array6));
        String [] array7 = {"gg","aa","vv"};
        String [] array8 = {"gg","aa","vv"};
        System.out.println(compareArrays(array7, array8));
        Integer[] array9 = {123,234,345};
        String[] array10 = {"123","234","345"};
        System.out.println(compareArrays(array9, array10));
    }
}
