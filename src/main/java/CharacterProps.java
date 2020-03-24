public abstract class CharacterProps {

    public String name;
    private int age;
    private String origin;
    private int health;

    public CharacterProps(String name, int age, String origin, int health) {
        this.name = name;
        this.age = age;
        this.origin = origin;
        this.health = health;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getOrigin() {
        return origin;
    }

    public int getHealth() {
        return health;
    }



}
