package Boxing_Game;

public class Fighter {
    String name;
    int damage;
    int health;
    int weight;
    String weightCategory;
    double dodgeChance;
    double blockPower;

    //dodge and block chance is by 0-100%
    //block reduces the damage by % if occurs

    public Fighter(String name, int damage, int health, int weight, double dodgeChance, double blockPower) {
        this.name = name;
        this.damage = damage;
        this.health = health;
        this.weight = weight;

        if (blockPower >= 0 && blockPower <= 100) {
            this.blockPower = blockPower;
        } else {
            this.blockPower = 0;
        }

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
            System.out.println(opponent.name + " dodged the attack and did not take any damage!");
            return opponent.health;
        }
        if (opponent.isBlock()) {
            double blockedDamage = (this.damage - ((this.damage * opponent.blockPower) / 100));
            System.out.println(opponent.name + " blocked the attack and toke "+blockedDamage +" damage!");
            return (int) (opponent.health - blockedDamage);
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

    boolean isBlock() {
        double randomValue = Math.random() * 100;
        return randomValue <= this.blockPower;
    }


}
