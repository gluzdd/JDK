package developers;

public class Main {
    public static void main(String[] args) {
        Backender backender = new Backender("Javokhir", 32);
        Frontender frontender = new Frontender("Anna", 29);
        Fullstack fullstackerDevepoer = new Fullstack("Vika", 27);
        Backendable fullstack2 = new Fullstack("Artem", 35);

        backender.doBackendWork();
        backender.doFrontendWork();

        frontender.doBackendWork();
        frontender.doFrontendWork();

        fullstackerDevepoer.doBackendWork();
        fullstackerDevepoer.doFrontendWork();

        fullstack2.doBackendWork();
    }
}
