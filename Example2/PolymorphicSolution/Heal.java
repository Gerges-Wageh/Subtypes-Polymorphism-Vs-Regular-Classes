package Example2.PolymorphicSolution;

public class Heal implements IAction {
    @Override
    public void use(Player target) {
        target.health = 100;
    }
}
