class Medic extends Hero {
    private int healPoints;

    public Medic(int health, int damage, String superAbility, int healPoints) {
        super(health, damage, superAbility);
        this.healPoints = healPoints;
    }

    public void increaseExperience() {
        healPoints = (int) (healPoints * 1.1);
    }

    @Override
    public void applySuperAbility() {
        System.out.println("Medic применил суперспособность " + superAbility);
    }
}
