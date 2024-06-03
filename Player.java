/**

 * Project: LAB2
 * Purpose Details: Player class restructure
 * Course: IST 242
 * Author: Kadin
 * Date Developed: 5/22
 * Last Date Changed: 6/1
 * Revision: 5/29

 */





public class Player {
    private String name;
    private Ship ship;

    /**
     * @param name
     * @param ship
     */

    public Player(String name, Ship ship) {
        this.name = name;
        this.ship = ship;
    }

    /**
     * @return
     */

    public String getName() {
        return name;
    }

    /**
     * @param name
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * @return
     */
    public Ship getShip() {
        return ship;
    }

    /**
     * @param ship
     */
    public void setShip(Ship ship) {
        this.ship = ship;
    }

    /**
     * @return
     */
    @Override
    public String toString() {
        return "Player{name='" + name + "', ship=" + ship + "}";
    }
}
