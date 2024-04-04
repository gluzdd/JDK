package Seminar3;

import java.util.Arrays;
import java.util.Iterator;
import java.util.NoSuchElementException;

public class MyCollection<T> {
    Object[] value;
    private  int size = 0;
    private int currentIndex = 0;
    public MyCollection() {
        value = new Object[10];
    }
    public void addElement(T element) {
        if (size >= value.length) {
            value = Arrays.copyOf(value, value.length *2);
        }
        value[size++] = element;
    }
    public void deleteElement(T element) {
        if (size == 0) System.out.println("Array is empty");
        for (int i = 0; i < size; i++) {
            if (value[i] == element) {
                System.arraycopy(value, i + 1, value, i, value.length - 1 - i);
                size--;
                return;
            }
        }
    }
    public Object[] getValue() {
        return value;
    }
    public boolean hasNext() {
        if (value[currentIndex] != null && currentIndex < size){
            return true;
        }
        return false;
    }
    public T next(){
        if (!hasNext()) throw new NoSuchElementException();
        return (T) value[currentIndex++];
    }
}