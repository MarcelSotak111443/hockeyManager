import players.Defender;
import players.Forward;
import players.Goalie;
import players.Player;

import java.util.ArrayList;
import java.util.Collections;

public class HockeyManager {

    private ArrayList<Forward> forwards = new ArrayList<>();
    private ArrayList<Defender> defenders = new ArrayList<>();
    private ArrayList<Goalie> goalies = new ArrayList<>();
    private ArrayList<Player> players = new ArrayList<>();




    public void addNewForward(String name, int age, int goals) {
        Forward forward = new Forward(goals, age, name);
        forwards.add(forward);
        players.add(forward);
    }

    public void addNewDefender(String name, int age, int hits) {
        Defender defender = new Defender(hits, age, name);
        defenders.add(defender);
        players.add(defender);
    }

    public void addNewGoalie(String name, int age, int wins) {
        Goalie goalie = new Goalie(wins, age, name);
        goalies.add(goalie);
        players.add(goalie);



    }

    public void PrintNameAndAgeOfTheYoungestPlayer() {
        Player youngestPlayer = players.get(0);
        for (int i = 1; i < players.size(); i++) {
            if (players.get(i).getAge() < youngestPlayer.getAge()) {
                youngestPlayer = players.get(i);
            }
        }

        System.out.println("Youngest player is: " + youngestPlayer.getName() + "with age:" + youngestPlayer.getAge());

    }

    }

