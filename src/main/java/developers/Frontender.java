package developers;

public class Frontender extends Developer implements Backendable, Frontendable{
    Frontender(String name, int age) {
        super(name, age);
    }

    @Override
    public void doBackendWork() {
        System.out.println("Can't do frontend work!");
    }

    @Override
    public void doFrontendWork() {
        System.out.println("Good backend work!");
    }
}
