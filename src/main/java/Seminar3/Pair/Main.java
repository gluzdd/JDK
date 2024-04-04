package Seminar3.Pair;

public class Main {
    public static void main(String[] args) {
        Pair<String, Integer> pair1 = new Pair<>("maomao", 17);
        System.out.println(pair1);
        System.out.println(pair1.getFirst() + " " + pair1.getSecond());
    }

}
