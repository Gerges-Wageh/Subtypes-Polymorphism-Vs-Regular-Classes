package Example2.ComplexSolution;



public class Main {
    public static void main(String[] args) {

        Player p1 = new Player();
        Action action = new Action(ActionType.ATTACK);
        action.use(p1);
        System.out.println(p1.health);

        action.setActionType(ActionType.HEAL);
        action.use(p1);
        System.out.println(p1.health);
    }
}


// we got the same result as using subtype polymorphism but, now we're using conditionals to handle the variation
// in behavior in the "Action" class
// This is the case when subtype polymorphism is sensible and if you used Regular class instead of subtypes polymorphism
// you had to use conditionals to handle variation in behavior

// Always replace conditionals with subtypes polymorphism to handle behavioral variations