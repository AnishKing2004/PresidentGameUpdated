package edu.up.cs301.tictactoe;

import edu.up.cs301.game.GameFramework.actionMessage.GameAction;
import edu.up.cs301.game.GameFramework.players.GamePlayer;

public class PresidentPlaceAction extends GameAction {

    /**
     * constructor for GameAction
     *
     * @param player the player who created the action
     */
    public PresidentPlaceAction(GamePlayer player) {
        super(player);
    }
}
