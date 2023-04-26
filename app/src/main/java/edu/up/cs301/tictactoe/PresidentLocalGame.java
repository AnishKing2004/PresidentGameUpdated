package edu.up.cs301.tictactoe;

import edu.up.cs301.game.GameFramework.LocalGame;
import edu.up.cs301.game.GameFramework.actionMessage.GameAction;
import edu.up.cs301.game.GameFramework.players.GamePlayer;

public class PresidentLocalGame extends LocalGame {

    PresidentGameState presidentGameState;

    public PresidentLocalGame(){
        this.presidentGameState = new PresidentGameState();
    }
    @Override
    protected void sendUpdatedStateTo(GamePlayer p) {

    }

    @Override
    protected boolean canMove(int playerIdx) {

        if(presidentGameState.currentPlayer == playerIdx){
            return true;
        }
        return false;
    }

    @Override
    protected String checkIfGameOver() {
        return null;
    }

    @Override
    protected boolean makeMove(GameAction action) {

        if(action instanceof PresidentPassAction){
            presidentGameState.currentPlayer++;
            if(presidentGameState.currentPlayer > 3){
                presidentGameState.currentPlayer = 0;
            }
            return true;
        } else if (action instanceof PresidentPlaceAction){

        }


        return false;
    }


}
