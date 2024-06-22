/*
Name: Lê Nguyễn Thành Long - ITDSIU21097
Purpose: Represents a registry for player scores in the game, storing the highest score achieved.
*/
package general.data;

import java.io.Serializable;

public class PlayersRegistry implements Serializable {
    private static final long serialVersionUID = 1L;
    protected PlayerScore ps;

    public PlayersRegistry() {
        ps = new PlayerScore(0);
    }

    public void addPlayer(PlayerScore p) {
        if(ps.compareTo(p) < 0)
            ps = p;
    }

    public PlayerScore getScores() {
        return ps;
    }
}
