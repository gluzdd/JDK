package Lesson2_1;

public interface Bull {
    public static final int amount = 2;
    default void walk() {
        System.out.println("Walks on " + amount + " four hooves");
    };
    void talk();
}
