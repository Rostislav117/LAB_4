import javax.swing.*;

public class They extends Human implements Actions {
    TimeOfDay currentTime = TimeOfDay.NIGHT;
    public They(String name) {
        super(name);
    }

    @Override
    public void understand() {
        System.out.println(getName() + " не пронюхали про домик на крыше");
    }

    @Override
    public void action() {
        System.out.println(getName() + " снова долго молчали,");
    }

    public void goingToDo() {
        switch (currentTime) {
            case NIGHT:
                System.out.println("что именно " + getName() + " собираются делать ночью:");
                break;
            case AFTERNOON:
                System.out.println("что именно " + getName() + " собираются делать днем:");
                break;
            default:
                System.out.println("что именно " + getName() + " собираются делать утром:");
                break;
        }

    }
}
