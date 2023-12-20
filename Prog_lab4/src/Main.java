public class Main {
    // вложенный класс
    private static class Boys {
        public void catchKarlson() {
            System.out.println("они попытаются поимать Карлсона");
        }
    }

    // Локальный класс
    public void KarlsonSleep() {
        class He {
            public void Text() {
                System.out.println("когда он, лежит в постели у Свантесонов и мирно спит.");
            }
        }

        He he = new He();
        he.Text();
    }

    public static void main(String[] args) {

        //aнонимный класс
        Together together = new Together() {
            @Override
            public void siting() {
                System.out.println("они сидят на скамейке не одни.");
            }
        };


        Filley filley = new Filley("Филле");
        Baby baby = new Baby("Малыш");
        Rulle rulle = new Rulle("Рулле");
        Karlson karlson = new Karlson("Карлсон");
        They they = new They("Филле и Рулле");
        Boys boys = new Boys();
        Main main = new Main();

        they.understand();

        //класс исключений
        karlson.PoorKarlson();
        karlson.WellBeiing();
        karlson.HuntStart();
        try {
            karlson.Feeling();
        } catch (HuntForKarlosnException e) {
            System.out.println(e.getMessage());
        }

        they.action();
        rulle.say();
        baby.action();
        filley.understand();

        together.siting();

        filley.action();
        filley.say();
        baby.understand();
        they.goingToDo();
        boys.catchKarlson();
        main.KarlsonSleep();

        baby.thought();
        baby.solution();
        karlson.come();


        //класс исключений
        baby.Flying();
        baby.RingDoor();
        try {
            baby.Run();
        } catch (ReturnOfKarlsonException a) {
            System.out.println(a.getMessage());
        }
    }
}
interface Together {
    void siting();
}