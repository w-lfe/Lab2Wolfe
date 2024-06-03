/**

 * Project: LAB2
 * Purpose Details: PowerUp class restructure
 * Course: IST 242
 * Author: Kadin
 * Date Developed: 5/22
 * Last Date Changed: 5/29
 * Revision: 6/1

 */








public class PowerUp {
    private String name;
    private String effect;

    /**
     *
     * @param name
     * @param effect
     */
    public PowerUp(String name, String effect) {
        this.name = name;
        this.effect = effect;
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
    public String getEffect() {
        return effect;
    }

    /**
     *
     * @param effect
     */
    public void setEffect(String effect) {
        this.effect = effect;
    }

    /**
     *
     * @return
     */
    @Override
    public String toString() {
        return "PowerUp{name='" + name + "', effect='" + effect + "'}";
    }
}
