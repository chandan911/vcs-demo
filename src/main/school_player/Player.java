package school_player;

public class Player {
    private int id;
    private String team;
    private String name;

    public Player(int id, String team, String name) {
        this.id = id;
        this.team = team;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTeam() {
        return team;
    }

    public void setTeam(String team) {
        this.team = team;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
