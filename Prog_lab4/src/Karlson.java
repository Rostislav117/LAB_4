public class Karlson extends Human{
    public Karlson(String name) {
        super(name);
    }

    //1 собственный класс исключений
    boolean IsPoor;
    boolean IsHunt;
    boolean IsFeel;
    public void PoorKarlson() {
        System.out.println("Бедняга " + getName() + ",");
        this.IsPoor = true;
    }
    //Сасочувствие
    public void WellBeiing() {
        System.out.println("каково ему придется,");
        this.IsFeel = true;
    }
    public void HuntStart(){
        System.out.println("если всерьез начнется за ним охота!");
        this.IsHunt = true;
    }
    public void Feeling() throws HuntForKarlosnException {
        if (IsPoor & IsFeel & IsHunt) {
            System.out.println("Этот дурачок никогда не умел прятаться.");
        } else {
            throw new HuntForKarlosnException("Он научился прятаться");
        }
    }

    public void come() {
        System.out.println("Но Карлсон появился только к обеду.");
    }

}
