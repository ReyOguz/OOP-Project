package dungeonmania.goals.GoalTypes;

import dungeonmania.Game;
import dungeonmania.goals.Goal;

public class OrGoal implements Goal {
    private Goal goal1;
    private Goal goal2;

    public OrGoal(Goal goal1, Goal goal2) {
        this.goal1 = goal1;
        this.goal2 = goal2;
    }

    public boolean achieved(Game game) {
        return goal1.achieved(game) || goal2.achieved(game);
    }

    public String toString(Game game) {
        if (achieved(game))
            return "";
        return "(" + goal1.toString(game) + " OR " + goal2.toString(game) + ")";
    }
}
