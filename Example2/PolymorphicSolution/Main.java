package Example2.PolymorphicSolution;

public class Main {
    public static void main(String[] args) {
        Player p1 = new Player();
        IAction action = new Attack(10);
        action.use(p1);
        System.out.println(p1.health);

        action = new Heal();
        action.use(p1);
        System.out.println(p1.health);

    }
}
