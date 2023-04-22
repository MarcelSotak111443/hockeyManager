package players;

public abstract class Player {
    protected int age;
    protected String name;

    public abstract int getAge();
    public abstract String getName();
    public abstract void setAge(int age);
    public abstract void setName(String name);
}
