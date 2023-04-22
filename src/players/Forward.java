package players;

public class Forward extends Player{

    private int goals;

    public Forward(int goals, int age, String name) {
        this.goals = goals;
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

    public void setGoals(int goals) {
        this.goals = goals;
    }


    public int getGoals() {
        return this.goals;
    }

}
