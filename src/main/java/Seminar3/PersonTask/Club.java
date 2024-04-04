package Seminar3.PersonTask;

import java.util.NoSuchElementException;
public class Club<T extends Person>{
    T[] arrayT;

    public Club(T[] array) {
        this.arrayT = array;
    }
    public void start() {
        Iterator iterator = new Iterator();
            while (iterator.hasNext()){
                iterator.next().haveRest();
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
