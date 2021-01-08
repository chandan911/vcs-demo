import school_player.Player;
import school_player.School;
import school_player.Team;

import java.util.ArrayList;

public class VCSDemo {

  public static void main(String[] args) {
    School school1 = new School("ABC Public School",new ArrayList<Team>());
    school1.addTeam(new Team("EDITH",new ArrayList<Player>()));
    school1.addTeam(new Team("Hippo",new ArrayList<Player>()));
    Team team = school1.getTeam("Hippo");
    if(team != null){
      team.addPlayer(new Player(214,team.getName(),"Satyam"));
      team.addPlayer(new Player(344,team.getName(),"Shubham"));
      ArrayList<Player> players = team.getPlayers();
      if(players.size()>0) {
        for(int player=0;player<players.size();player++){
          System.out.println(players.get(player).getId()+ " " +players.get(player).getName()+ " "+players.get(player).getTeam());
        }
      }
    }
  }

}
