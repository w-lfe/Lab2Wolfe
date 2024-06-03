/**

 * Project: LAB2
 * Purpose Details: Ship class restructure
 * Course: IST 242
 * Author: Kadin
 * Date Developed: 5/22
 * Last Date Changed: 5/29
 * Revision: 6/1

 */
public class Ship {
    private String name;
    private int health;
    private int damage;

    /**
     *
     * @param name
     * @param health
     * @param damage
     */
    public Ship(String name, int health, int damage) {
        this.name = name;
        this.health = health;
        this.damage = damage;
    }

    /**
     *
     * @return
     */
    public String getName() {
        return name;
    }

    /**
     *
     * @param name
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     *
     * @return
     */
    public int getHealth() {
        return health;
    }

    /**
     *
     * @param health
     */
    public void setHealth(int health) {
        this.health = health;
    }

    /**
     *
     * @return
     */
    public int getDamage() {
        return damage;
    }

    /**
     *
     * @param damage
     */
    public void setDamage(int damage) {
        this.damage = damage;
    }

    /**
     *
     * @return
     */
    @Override
    public String toString() {
        return "Ship{name='" + name + "', health=" + health + ", damage=" + damage + "}";
    }
}
