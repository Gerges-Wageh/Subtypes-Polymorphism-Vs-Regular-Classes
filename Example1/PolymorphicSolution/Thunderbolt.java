package Example1.PolymorphicSolution;

public class Thunderbolt implements IAttack{
    @Override
    public void use(Player target) {
        target.health -= 50;
    }
}
