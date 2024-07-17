package Example1.PolymorphicSolution;

public class Main {
    public static void main(String[] args) {
        // New player with health = 100
        Player p1 = new Player();

        // thunderbolt weapon that deduct player health by 50
        IAttack weapon = new Thunderbolt();
        // apply thunderbolt weapon on p1 deducted this health by 50 to be 50
        weapon.use(p1);
        System.out.println(p1.health);

        // scratch weapon that deduct player health by 25
        weapon = new Scratch();
        // apply scratch weapon on p1 deducted this health by 25 to be 25
        weapon.use(p1);
        System.out.println(p1.health);
    }
}


