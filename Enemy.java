/**

 * Project: LAB2
 * Purpose Details: Enemy class restructure
 * Course: IST 242
 * Author: Kadin
 * Date Developed: 5/22
 * Last Date Changed: 5/29
 * Revision: 6/1

 */







public class Enemy extends Obstacle {
    private String name;

    public Enemy(String name, String type, int health, int damage) {
        super(type, health, damage);
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Enemy{name='" + name + "', type='" + getType() + "', health=" + getHealth() + ", damage=" + getDamage() + "}";
    }
}
