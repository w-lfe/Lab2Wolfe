/** Project: Lab2
 * Purpose Details: SQL DATABASE
 * Course: IST 242
 * Author: KADIN
 * Date Developed: 6/1
 * Last Date Changed:
 * Rev:

 */










import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 */

public class MysqlDatabase {

    private static final String URL = "jdbc:mysql://localhost:3306/space_game";
    private static final String USER = "root";
    private static final String PASSWORD = "IST888IST888";

    public MysqlDatabase() {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }

    /**
     *
     * @param shipName
     * @param health
     * @return
     */
    public boolean insertShipHealth(String shipName, int health) {
        String query = "INSERT INTO ships (name, health) VALUES (?, ?)";
        try (Connection connection = DriverManager.getConnection(URL, USER, PASSWORD);
             PreparedStatement statement = connection.prepareStatement(query)) {
            statement.setString(1, shipName);
            statement.setInt(2, health);
            statement.executeUpdate();
            System.out.println("Insert successful.");
            return true;
        } catch (SQLException e) {
            e.printStackTrace();
            System.out.println("Insert failed: " + e.getMessage());
            return false;
        }
    }

    /**
     *
     * @param shipName
     * @param health
     * @return
     */
    public boolean updateShipHealth(String shipName, int health) {
        String query = "UPDATE ships SET health = ? WHERE name = ?";
        try (Connection connection = DriverManager.getConnection(URL, USER, PASSWORD);
             PreparedStatement statement = connection.prepareStatement(query)) {
            statement.setInt(1, health);
            statement.setString(2, shipName);
            int rowsUpdated = statement.executeUpdate();
            if (rowsUpdated > 0) {
                System.out.println("Update successful.");
                return true;
            } else {
                System.out.println("Ship not found.");
                return false;
            }
        } catch (SQLException e) {
            e.printStackTrace();
            System.out.println("Update failed: " + e.getMessage());
            return false;
        }
    }

    /**
     *
     * @param shipName
     */
    public void readShipHealth(String shipName) {
        String query = "SELECT health FROM ships WHERE name = ?";
        try (Connection connection = DriverManager.getConnection(URL, USER, PASSWORD);
             PreparedStatement statement = connection.prepareStatement(query)) {
            statement.setString(1, shipName);
            ResultSet resultSet = statement.executeQuery();
            if (resultSet.next()) {
                int health = resultSet.getInt("health");
                System.out.println("Health of " + shipName + ": " + health);
            } else {
                System.out.println("Ship not found.");
            }
        } catch (SQLException e) {
            e.printStackTrace();
            System.out.println("Read failed: " + e.getMessage());
        }
    }

    /**
     *
     * @param shipName
     * @return
     */
    public boolean deleteShipHealth(String shipName) {
        String query = "DELETE FROM ships WHERE name = ?";
        try (Connection connection = DriverManager.getConnection(URL, USER, PASSWORD);
             PreparedStatement statement = connection.prepareStatement(query)) {
            statement.setString(1, shipName);
            int rowsDeleted = statement.executeUpdate();
            if (rowsDeleted > 0) {
                System.out.println("Delete successful.");
                return true;
            } else {
                System.out.println("Ship not found.");
                return false;
            }
        } catch (SQLException e) {
            e.printStackTrace();
            System.out.println("Delete failed: " + e.getMessage());
            return false;
        }
    }

    /**
     *
     * @param args
     */
    public static void main(String[] args) {
        MysqlDatabase db = new MysqlDatabase();


        if (db.insertShipHealth("OAKESCRUISER", 100)) {
            System.out.println("Ship inserted successfully.");
        } else {
            System.out.println("Failed to insert ship.");
        }


        db.readShipHealth("OAKESCRUISER");


        if (db.updateShipHealth("OAKESCRUISER", 120)) {
            System.out.println("Ship updated successfully.");
        } else {
            System.out.println("Failed to update ship.");
        }


        db.readShipHealth("OAKESCRUISER");

        if (db.deleteShipHealth("OAKESCRUISER")) {
            System.out.println("Ship deleted successfully.");
        } else {
            System.out.println("Failed to delete ship.");

        }


    }
}
