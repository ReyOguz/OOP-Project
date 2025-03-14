package dungeonmania.goals.GoalTypes;

import java.util.List;
import dungeonmania.Game;
import dungeonmania.entities.Entity;
import dungeonmania.entities.Exit;
import dungeonmania.entities.Player;
import dungeonmania.goals.Goal;
import dungeonmania.util.Position;

public class ExitGoal implements Goal {
    public ExitGoal() {

    }

    public boolean achieved(Game game) {
        Player character = game.getPlayer();
        Position pos = character.getPosition();
        List<Exit> es = game.getMap().getEntities(Exit.class);
        if (es == null || es.size() == 0)
            return false;
        return es.stream().map(Entity::getPosition).anyMatch(pos::equals);
    }

    public String toString(Game game) {
        if (achieved(game))
            return "";
        return ":exit";
    }
}
