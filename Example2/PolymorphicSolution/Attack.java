package Example2.PolymorphicSolution;

public class Attack implements IAction {
    private int damage;

    public Attack(int damage) {
        this.damage = damage;
    }

    @Override
    public void use(Player target) {
        target.health -= damage;

    }
}
