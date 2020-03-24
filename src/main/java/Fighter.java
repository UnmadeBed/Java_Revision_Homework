public class Fighter extends CharacterProps implements ISpecial {

    private String taunt;

    public Fighter(String name, int age, String origin, int health, String taunt) {
        super(name, age, origin, health);
        this.taunt = taunt;
    }

    public String useTaunt() {
        return taunt;
    }

    public String specialMove(String super) {
        return this.name + "used " + super + ".";
    }

}