package school_player;

import java.util.ArrayList;

public class Team {
    private ArrayList<Player> players;
    private String name;

    public String getName() {
        return name;
    }

    public Team(String name,ArrayList<Player> players) {
        this.name = name;
        this.players = players;
    }

    public ArrayList<Player> getPlayers() {
        return players;
    }

    public void addPlayer(Player player){
        players.add(player);
    }

}
