package Boxing_Game;

public class Fighter {
    String name;
    int damage;
    int health;
    int weight;
    String weightCategory;
    double dodgeChance;
    double block;

    //dodge and block chance is by 0-100%

    public Fighter(String name, int damage, int health, int weight, double dodgeChance, double block) {
        this.name = name;
        this.damage = damage;
        this.health = health;
        this.weight = weight;
        this.block = block;

        if (dodgeChance >= 0 && dodgeChance <= 100) {
            this.dodgeChance = dodgeChance;
        } else {
            this.dodgeChance = 0;
        }


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
        System.out.println("------------");
        System.out.println(this.name + " deals " + this.damage + " damage to " + opponent.name);

        if (opponent.isDodge()) {
            System.out.println(opponent.name + " dodged the attack!");
            return opponent.health;
        }

        if (opponent.health - this.damage < 0) {
            return 0;
        }
        return opponent.health - this.damage;
    }

    boolean isDodge() {
        double randomValue = Math.random() * 100;
        return randomValue <= this.dodgeChance;
    }




}
