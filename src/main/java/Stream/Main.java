package Stream;


class CurrentThreadDemo {
    public static void main(String[] args) {
        Thread t = Thread.currentThread(); //Объект тред управляет главныи потоком, получили ссылку на него
        System.out.println("Teкyщий поток: " + t);// Изменить имя потока .
        t.setName("Му Thread");
        System.out.println(" Пocлe изменения имени : " + t);
        try {
            for (int n = 5; n > 0; n--) {
                System.out.println(n);
                Thread.sleep(1000);
            }
        } catch(InterruptedException е){
            System.out.println("Главный поток прерван");
        }
    }
}
