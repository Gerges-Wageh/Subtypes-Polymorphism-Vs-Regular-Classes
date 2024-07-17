package Example1.SimplerSolution;

public class Attack {
    private final int damage;

    public Attack(int damage){
        this.damage = damage;
    }

    public void use(Player target){
        target.health -= damage;
    }
}
