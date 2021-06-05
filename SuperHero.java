abstract public class SuperHero {
    private String name;
    private String job;

    public void setName(String name) {
        this.name = name;
    }

    public abstract void skill(String skill);
}
