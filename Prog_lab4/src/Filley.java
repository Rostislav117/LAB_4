import javax.swing.*;

public class Filley extends Human implements Actions, BadBoys {
    public Filley(String name) {
        super(name);
    }

    @Override
    public void understand() {
        System.out.println("Вот тут-то " + getName() + " и спохватился,");
    }

    @Override
    public void action() {
        System.out.println(getName() + " поглядел на Малыша и сказал очень громко:");
    }

    @Override
    public void say() {
        System.out.println("Но так легко Малыша не проведешь.");
    }
}
