package Seminar3.PersonTask;

import java.util.NoSuchElementException;

public class Workplace<T extends Person> {
    T[] arrayT;

    public Workplace(T[] arrayT) {
        this.arrayT = arrayT;
    }
    public void start() {
        Iterator iterator = new Iterator();
        while (iterator.hasNext()){
            iterator.next().doWork();
        }
    }
    class Iterator {
        private int currentIndex = 0;
        public boolean hasNext() {
            return currentIndex < arrayT.length && arrayT[currentIndex] != null;
        }
        public T next(){
            if (!hasNext()) throw new NoSuchElementException();
            return arrayT[currentIndex++];
        }
    }
}
