package players;

public class Goalie extends Player{

    private int wins;

    public Goalie(int goals, int age, String name) {
        this.wins = goals;
        this.name  = name;
        this.age = age;


    }

    @Override
    public int getAge() {
        return age;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public void setName(String name) {
        this.name = name;
    }

    public void setWins(int wins) {
        this.wins = wins;
    }


    public int getWins() {
        return this.wins;
    }

}

