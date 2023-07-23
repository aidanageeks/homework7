public class Main {
    public static void main(String[] args) {
        Hero[] heroes = {
                new Magic(100, 20, "Teleportation"),
                new Medic(80, 10, "Healing Touch", 50),
                new warrior(120, 30, "CRITICAL DAMAGE")
        };

        for (Hero hero : heroes) {
            hero.applySuperAbility();
            if (hero instanceof Medic) {
                ((Medic) hero).increaseExperience();
            }
        }
    }
}
