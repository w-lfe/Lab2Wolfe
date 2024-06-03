/**

 * Project: LAB2
 * Purpose Details: Obstacle class restructure
 * Course: IST 242
 * Author: Kadin
 * Date Developed: 5/22
 * Last Date Changed: 5/29
 * Revision: 6/1

 */







public class Obstacle {
    private String type;
    private int health;
    private int damage;

    /**
     *
     * @param type
     * @param health
     * @param damage
     */

    public Obstacle(String type, int health, int damage) {
        this.type = type;
        this.health = health;
        this.damage = damage;
    }

    /**
     *
     * @return
     */
    public String getType() {
        return type;
    }

    /**
     *
     * @param type
     */
    public void setType(String type) {
        this.type = type;
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
        return "Obstacle{type='" + type + "', health=" + health + ", damage=" + damage + "}";
    }
}