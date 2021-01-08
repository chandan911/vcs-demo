package school_player;

import java.util.ArrayList;

public class School {

    private String name;
    private ArrayList<Team> teams;

    public School(String name,ArrayList<Team> teams) {
        this.name = name;
        this.teams = teams;
    }

    public ArrayList<Team> getTeams() {
        return teams;
    }

    public void addTeam(Team team) {
        teams.add(team);
    }

    public Team getTeam(String teamName){
        for(int team=0;team<teams.size();team++)
        {
            if(teams.get(team).getName() == teamName) {
                return teams.get(team);
            }
        }
        System.out.println("Not present");
        return null;
    }
}
