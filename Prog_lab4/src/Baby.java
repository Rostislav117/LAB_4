public class Baby extends Human implements Actions{
    public Baby(String name) {
        super(name);
    }

    //2 собственный класс исключений
    boolean IsNoFly;
    boolean IsRingDoor;
    public void Flying() {
        System.out.println("На этот раз он не влетел в окно,");
        this.IsNoFly = true;
    }
    public void RingDoor() {
        System.out.println("а бешено затрезвонил во входную дверь.");
        this.IsRingDoor = true;
    }
    public void Run() throws ReturnOfKarlsonException {
        if (IsNoFly & IsRingDoor) {
            System.out.println(getName() + " побежал открывать.");
        }
    }
    //

    @Override
    public void action() {
        System.out.println("(" + getName() + " едва раслышал):");
    }

    @Override
    public void understand() {
        System.out.println(getName() + " прекрасно понимал, ");
    }
    public void thought() {
        System.out.println("\'Надо поговорить об этом с Карлсоном, и как можно скорее!\'");
    }
    public void solution() {
        System.out.println("- решил про себя " + getName());
    }
}
