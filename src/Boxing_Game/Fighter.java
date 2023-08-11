package Boxing_Game;

public class Fighter {
    String name;
    int damage;
    int health;
    int weight;
    String weightCategory;
    double dodgeChance;
    double block;

    //weightCategories should be = light / medium / heavy. Only matching ones can battle.

    public Fighter(String name, int damage, int health, int weight, double dodge, double block) {
        this.name = name;
        this.damage = damage;
        this.health = health;
        this.weight = weight;
        this.dodgeChance = dodge;
        this.block = block;
        if (this.weight < 50) {
            this.weightCategory = "Fly Weight";
        }
        if (this.weight >= 50 && this.weight < 60) {
            this.weightCategory = "Light Weight";
        }
        if (this.weight >= 60 && this.weight <= 80) {
            this.weightCategory = "Medium Weight";
        }
        if (this.weight >= 80) {
            this.weightCategory = "Heavy Weight";
        }
    }

    int hit(Fighter opponent) {
        System.out.println(this.name + " deals " + this.damage + "to" + opponent.name);
        return 0;
    }
}
