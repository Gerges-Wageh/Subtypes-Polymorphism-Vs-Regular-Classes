package Example1.PolymorphicSolution;

public class Scratch implements IAttack{
    @Override
    public void use(Player target) {
        target.health -= 25;
    }
}
