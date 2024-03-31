package developers;

public class Fullstack extends Developer implements Backendable, Frontendable{
    public Fullstack(String name, int age) {
        super(name, age);
    }

    @Override
    public void doBackendWork() {
        System.out.println("Good backend work!");
    }

    @Override
    public void doFrontendWork() {
        System.out.println("Good backend work!");
    }


}
