package Boxing_Game;

public class Fighter {
    String name;
    int damage;
    int health;
    int weight;
    double dodgeChance;

    public Fighter(String name, int damage, int health, int weight, double dodge) {
        this.name = name;
        this.damage = damage;
        this.health = health;
        this.weight = weight;
        this.dodgeChance = dodge;
    }
}
