//package lesson3;
//
//public class Main {
//    private static class Box {
//        public Object obj;
//        public Box(Object obj){
//            this.obj = obj;
//        }
//        public Object getObj() {
//            return obj;
//        }
//        public void setObj(Object obj) {
//            this.obj = obj;
//        }
//        public void printInfo() {
//            System.out.printf("Box (%s): %s",
//                    obj.getClass().getSimpleName(), obj);
//        }
//    }
//
//    public static void main(String[] args) {
//        /*
//        Box b1 = new Box(20);
//        Box b2 = new Box(30);
////        System.out.println((Integer) b1.getObj() + (Integer) b2.getObj());
//
//        Box b3 = new Box("Hello, ");
//        Box b4 = new Box("World!");
////        System.out.println((String) b3.getObj() + (String) b4.getObj());
//        b1.setObj("sdf");
////        System.out.println((String) b1.getObj());
//
//        GBox<String> stringGBox = new GBox<>("Hello ");
//        stringGBox.showType();
//        GBox<Integer> integerGBox = new GBox<>(12);
//        integerGBox.showType();
////        GBox<Integer> newBox = new GBox<>();
////        integerGBox.setValue("World!");
//        GBox<Integer> integerGBox0;
//        GBox<Integer> integerGBox1 = new GBox<Integer>(1);
//
//        KVBox<Integer, String> kvb0 = new KVBox<>(1, "Hello");
//        KVBox<String, GBox<String>> kvb1 = new KVBox<>("World", new GBox<>("Java"));
//        kvb1.showType2();
//        System.out.println(kvb1);
//
//        GBox<Integer> box = new GBox<>(null);
//        setIfnull(box, 13);
//        System.out.println(box.getValue());
//        GBox<Integer> box1 = new GBox<>(1);
//        setIfnull(box1, 15);
//        System.out.println(box1.getValue());
//
//        BBox<Integer> integerBBox = new BBox<>();
////        BBox<String> stringBBox = new BBox<>();
//
//        setIfNull(integerBBox, 4);
////        setIfNull(stringBBox, "hello");
//        Object a;
//        Integer b = 13;
//        a = b;
//        System.out.println(a);
//        */
//        TBox<String> box = TBox.emptyBox();
//        System.out.println();
//    }
//    public static class GBox<T> {
//        private T value;
//
//        public GBox(T value) {
//            this.value = value;
//        }
//
//        public T getValue() {
//            return value;
//        }
//
//        public void setValue(T value) {
//            this.value = value;
//        }
//
//        private Object object;
//
//
//        public Object getObject() {
//            return object;
//        }
//
//        public void setObject(Object object) {
//            this.object = object;
//        }
//        public void showType() {
//            System.out.printf("Box (%s): %s",
//                    object.getClass().getSimpleName(), object);
//        }
//
//
//    }
//    private static class KVBox<K, V> {
//        private final K key;
//        private final V value;
//
//        public KVBox(K key, V value) {
//            this.key = key;
//            this.value = value;
//        }
//
//        public K getKey() {
//            return key;
//        }
//
//        public V getValue() {
//            return value;
//        }
//
//        public void showType2() {
//            System.out.printf("type of key is %s, key = %s, " +
//                              "type of value is %s, value = %s\n",
//                    key.getClass().getName(), getKey(),
//                    value.getClass().getName(), getValue());
//        }
//
//        @Override
//        public String toString() {
//            return "KVBox{" +
//                    "key=" + key +
//                    ", value=" + value +
//                    '}';
//        }
//
//    }
////    private static <T> void setIfnull(GBox<T> box, T t) {
////        if (box.getValue() == null) {
////            box.setValue(t);
////        }
////    }
//    private static class BBox<V extends Number> {
//        private V value;
//        public V getValue() {
//            return value;
//        }
//        public void setValue(V value) {
//            this.value = value;
//        }
//    }
//    private static <T extends Number> void setIfNull(BBox<T> box, T t) {
//        if (box.getValue() == null) {
//            box.setValue(t);
//        }
//    }
//    class Bird{}
//    interface Animal{}
//    interface Man{}
//    class CBox<T extends Bird & Animal & Man> {
//    }
////    private static class Animal {
////    }
//    public static class TBox<T> {
//        public static final TBox EMPTY_BOX = new TBox<>();
//        private T value;
//
//        public T getValue() {
//            return value;
//        }
//
//        public void setValue(T value) {
//            this.value = value;
//        }
//        static <T> TBox<T> emptyBox() {
//            return (TBox<T>) EMPTY_BOX;
//        }
//    }
//}
