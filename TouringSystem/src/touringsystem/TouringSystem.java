
package touringsystem;
import com.mongodb.MongoClient;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;
import com.mongodb.client.model.Filters;
import com.mongodb.client.model.Updates;
import org.bson.Document;

/**
 *
 * @author Ahmed Kamal
 */
public class TouringSystem {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        // Client connection and database connection 
        MongoClient client = new MongoClient();
        MongoDatabase TS = client.getDatabase("TouringSystem");
        
        // collection creation 
        TS.createCollection("Packages"); // creating the collection inside the database 
        MongoCollection pack = TS.getCollection("Packages"); 
        
        // test #1 amer
    }
    
}
