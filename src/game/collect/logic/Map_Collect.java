/*
Name: Lê Nguyễn Thành Long - ITDSIU21097
Purpose: Extends the general Map class for the game, associating it with the Game_Collect instance.
*/
package game.collect.logic;

import general.logic.Map;

public class Map_Collect extends Map{
    protected Game_Collect game;

    public Map_Collect(Game_Collect game) {
        super(game, false);
        this.game = game;
    }
}