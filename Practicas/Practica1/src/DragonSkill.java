/**
 * Class to represent the dragon skill of the fighter Korby
 * The dragon skill has a damage of 30 and a defense of 10
 */
public class DragonSkill implements SpSkillKorby {

    /* The attack boost of the skill */
    private int atkBoost;
    /* The defense boost of the skill */
    private int defBoost;
    /* The name of the skill */
    private String name;
    /* The owner of the skill */
    private Korby owner;

    /**
     * Constructor of the dragon skill
     * 
     * @param owner the owner of the skill
     */
    public DragonSkill(Korby owner) {
        atkBoost = 30;
        defBoost = 10;
        name = "Dragon";
        this.owner = owner;
    }

    /**
     * Returns the attack boost of the skill
     * 
     * @return the attack boost of the skill
     */
    @Override
    public int getAtkBoost() {
        return atkBoost;
    }

    /**
     * Returns the attack boost of the skill
     * 
     * @return the attack boost of the skill
     */
    @Override
    public int getDefBoost() {
        return defBoost;
    }

    /**
     * Calculates and returns the amount of block that the skill will give to the
     * owner
     * 
     * @return the amount of block that the skill will give to the owner
     */
    @Override
    public int hit(Fighter target) {
        return atkBoost - (target.getBlock() / 2);
    }

    /**
     * Calculates and returns the defense that the skill will give to the owner
     * 
     * @return the defense that the skill will give to the owner
     */
    @Override
    public int defend() {
        return defBoost;
    }

    /**
     * Returns the name of the skill
     * 
     * @return the name of the skill
     */
    @Override
    public String getName() {
        return name;
    }

    /**
     * Returns a description of the skill, this description contains the name, the
     * attack boost, the defense boost, and the special effect
     * 
     * @return a description of the skill
     */
    @Override
    public String getDescription() {
        return "Nombre: " + name + " Atk: " + atkBoost + " Def: " + defBoost
                + " Al atacar tomas la mitad del escudo del enemigo";
    }

    /**
     * Returns the owner of the skill
     * 
     * @return the owner of the skill
     */
    @Override
    public Korby getOwner() {
        return owner;
    }

}
