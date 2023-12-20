public class Rulle extends Human implements BadBoys{
    public Rulle(String name) {
        super(name);
    }

    @Override
    public void say() {
        System.out.println("а потом " + getName() + " сказал шопотом");
    }
}
