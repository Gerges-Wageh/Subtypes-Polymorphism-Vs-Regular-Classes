package Example2.ComplexSolution;

public class Action {
    private ActionType actionType;

    public Action(ActionType actionType) {
        this.actionType = actionType;
    }

    public void setActionType(ActionType actionType) {
        this.actionType = actionType;
    }

    public void use(Player target){
        if(actionType == ActionType.ATTACK){
            target.health -= 10;
        } else if (actionType == ActionType.HEAL) {
            target.health = 100;
        }
    }
}



enum ActionType{
    ATTACK,
    HEAL
}