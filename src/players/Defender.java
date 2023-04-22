package players;

public class Defender extends Player{


    private int hits;

    public Defender(int hits, int years, String name) {
        this.hits = hits;
        this.name  = name;
        this.age = years;


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

    public void setHits(int hits) {
        this.hits = hits;
    }


    public int getHits() {
        return this.hits;
    }

}
