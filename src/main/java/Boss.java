public class Boss extends CharacterProps implements ISpecial {

    public Boss(String name, int age, String origin, int health) {
        super(name, age, origin, health);
    }

    public String specialMove(String super) {
        return this.name + "used " + super + ".";
    }
}
