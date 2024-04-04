//package Seminar3;
//
//import java.io.FileInputStream;
//import java.io.InputStream;
//import java.io.Serializable;
//
//public class Box<T extends Comparable, K extends Number, V extends InputStream> {
//    T valueT;
//    K valueK;
//    V valueV;
//
//    public Box(T valueT, K valueK, V valueV) {
//        this.valueT = valueT;
//        this.valueK = valueK;
//        this.valueV = valueV;
//    }
//
//    public T getValueT() {
//        return valueT;
//    }
//    public V getValueV() {
//        return valueV;
//    }
//    public K getValueK() {
//        return valueK;
//    }
//    public void printClassName(){
//        System.out.printf("ValueT is %s, ValueK is %s, ValueV is %s",
//                valueT.getClass().getSimpleName(),
//                valueK.getClass().getSimpleName(),
//                valueV.getClass().getSimpleName());
//    }
//}
