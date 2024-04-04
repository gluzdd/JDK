package Seminar3.EqualsArrays;
/*
Напишите обобщенный метод compareArrays(), который принимает два массива и
возвращает true, если они одинаковые, и false в противном случае. Массивы могут быть
любого типа данных, но должны иметь одинаковую длину и содержать элементы одного
типа.
 */

import java.util.Arrays;

public class EqualsArrays {
    public static  <T> boolean compareArrays(T[] arr1, T[] arr2){
        return (Arrays.equals(arr1, arr2) && arr1.length == arr2.length);
//        console.log(arr1) != Typeof(arr2)
//        if (arr1.length != arr2.length) return false;
//        for (int i = 0; i < arr1.length; i++) {
//            if (arr1[i] != arr2[i]) return false;
//        }
//        return true;
    }
}
