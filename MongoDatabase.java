import com.mongodb.client.MongoClient;
import com.mongodb.client.MongoClients;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;
import org.bson.Document;
import static com.mongodb.client.model.Filters.eq;

public class MongoDatabase {

    private static final String CONNECTION_STRING = "mongodb://localhost:27017";
    private static final String DATABASE_NAME = "space_game";
    private static final String COLLECTION_NAME = "ships";

    private MongoClient mongoClient;
    private MongoDatabase database;
    private MongoCollection<Document> collection;

    public MongoDatabase() {
        mongoClient = MongoClients.create(CONNECTION_STRING);
        database = (MongoDatabase) mongoClient.getDatabase(DATABASE_NAME);
        collection = database.getCollection(COLLECTION_NAME);
    }

    private MongoCollection<Document> getCollection(String collectionName) {
        return null;
    }

    public boolean insertShipHealth(String shipName, int health) {
        Document document = new Document("name", shipName).append("health", health);
        try {
            collection.insertOne(document);
            System.out.println("Insert successful.");
            return true;
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("Insert failed.");
            return false;
        }
    }

    public boolean updateShipHealth(String shipName, int health) {
        try {
            collection.updateOne(eq("name", shipName), new Document("$set", new Document("health", health)));
            System.out.println("Update successful.");
            return true;
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("Update failed.");
            return false;
        }
    }

    public void readShipHealth(String shipName) {
        try {
            Document document = collection.find(eq("name", shipName)).first();
            if (document != null) {
                int health = document.getInteger("health");
                System.out.println("Health of " + shipName + ": " + health);
            } else {
                System.out.println("Ship not found.");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public boolean deleteShipHealth(String shipName) {
        try {
            collection.deleteOne(eq("name", shipName));
            System.out.println("Delete successful.");
            return true;
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("Delete failed.");
            return false;
        }
    }

    public static void main(String[] args) {
        MongoDatabase db = new MongoDatabase();
        db.insertShipHealth("OAKESCRUISER", 100);
        db.readShipHealth("OAKESRUISER");
        db.updateShipHealth("OAKESCRUISER", 120);
        db.readShipHealth("OAKESCRUISER");
        db.deleteShipHealth("OAKESCRUISER");
    }
}

