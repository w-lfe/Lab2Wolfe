/**

 * Project: LAB2
 * Purpose Details: Game class restructure
 * Course: IST 242
 * Author: Kadin
 * Date Developed: 5/22
 * Last Date Changed: 5/29
 * Revision: 6/1

 */








import java.util.ArrayList;
import java.util.List;

public class Game {
    private Player player;
    private List<Obstacle> obstacles;
    private List<Enemy> enemies;
    private List<PowerUp> powerUps;

    /**
     *
     * @param player
     */
    public Game(Player player) {
        this.player = player;
        this.obstacles = new ArrayList<>();
        this.enemies = new ArrayList<>();
        this.powerUps = new ArrayList<>();
    }

    /**
     *
     * @return
     */
    public Player getPlayer() {
        return player;
    }

    /**
     *
     * @param player
     */
    public void setPlayer(Player player) {
        this.player = player;
    }

    /**
     *
     * @return
     */
    public List<Obstacle> getObstacles() {
        return obstacles;
    }

    /**
     *
     * @param obstacles
     */
    public void setObstacles(List<Obstacle> obstacles) {
        this.obstacles = obstacles;
    }

    /**
     *
     * @return
     */
    public List<Enemy> getEnemies() {
        return enemies;
    }

    /**
     *
     * @param enemies
     */
    public void setEnemies(List<Enemy> enemies) {
        this.enemies = enemies;
    }

    /**
     *
     * @return
     */
    public List<PowerUp> getPowerUps() {
        return powerUps;
    }

    /**
     *
     * @param powerUps
     */
    public void setPowerUps(List<PowerUp> powerUps) {
        this.powerUps = powerUps;
    }

    /**
     *
     * @return
     */
    @Override
    public String toString() {
        return "Game{" +
                "player=" + player +
                ", obstacles=" + obstacles +
                ", enemies=" + enemies +
                ", powerUps=" + powerUps +
                '}';
    }

    /**
     *
     * @param args
     */
    public static void main(String[] args) {
        Ship playerShip = new Ship("OAKESCRUISER", 100, 50);
        Player player = new Player("KAPTAIN KADIN", playerShip);

        Game game = new Game(player);

        Obstacle asteroid = new Obstacle("SPACE DEBRIS", 50, 10);
        game.getObstacles().add(asteroid);

        Enemy alien = new Enemy("MOTHERSHIP", "STAR FIGHTER", 80, 25);
        game.getEnemies().add(alien);

        PowerUp speedBoost = new PowerUp("NOS", "FASTER THAN FLASH ZOOM ZOOM (raises speed by 20%");
        game.getPowerUps().add(speedBoost);

        System.out.println(game);
    }
}
