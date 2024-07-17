package Example1.SimplerSolution;

public class Main {
    public static void main(String[] args) {
        // New player with health = 100
        Player p1 = new Player();

        // thunderbolt attack with damage = 50
        Attack thunderbolt = new Attack(50);
        // Apply thunderbolt on p1
        thunderbolt.use(p1);
        // p1 health deducted by 50 to be 50 now
        System.out.println(p1.health);

        // scratch attack with damage = 25
        Attack scratch = new Attack(25);
        // Apply scratch attack on p1
        scratch.use(p1);
        // p1 health deducted by 25 to be 25 now
        System.out.println(p1.health);

    }
}

// Note how we handle variation in data with regular class "Attack" instead of interface "IAttack" and two subtypes
// variations in data handled by Regular class instead on complex hierarchy