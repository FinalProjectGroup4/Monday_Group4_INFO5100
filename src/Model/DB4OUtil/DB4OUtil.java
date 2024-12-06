package Model.DB4OUtil;

import Model.ConfigureASystem;
import Model.EcoSystem;
import com.db4o.Db4oEmbedded;
import com.db4o.ObjectContainer;
import com.db4o.ObjectSet;
import com.db4o.config.EmbeddedConfiguration;
import com.db4o.ta.TransparentPersistenceSupport;
import java.nio.file.Paths;

/**
 * Utility class for managing DB4O connections and operations.
 */
public class DB4OUtil {

    private static final String FILENAME = Paths.get("Databank.db4o").toAbsolutePath().toString(); // Path to the data store
    private static DB4OUtil dB4OUtil;

    private DB4OUtil() {
        // Private constructor to enforce Singleton pattern
    }

    public synchronized static DB4OUtil getInstance() {
        if (dB4OUtil == null) {
            dB4OUtil = new DB4OUtil();
        }
        return dB4OUtil;
    }

    public synchronized static void shutdown(ObjectContainer conn) {
        if (conn != null) {
            try {
                conn.close();
            } catch (Exception ex) {
                System.err.println("Error closing ObjectContainer: " + ex.getMessage());
                ex.printStackTrace();
            }
        }
    }

    private ObjectContainer createConnection() {
        try {
            EmbeddedConfiguration config = Db4oEmbedded.newConfiguration();
            config.common().add(new TransparentPersistenceSupport());
            // Controls the number of objects in memory
            config.common().activationDepth(Integer.MAX_VALUE);
            // Controls the depth/level of updating objects
            config.common().updateDepth(Integer.MAX_VALUE);

            // Register your top-level class here
            config.common().objectClass(EcoSystem.class).cascadeOnUpdate(true);

            return Db4oEmbedded.openFile(config, FILENAME);
        } catch (Exception ex) {
            System.err.println("Error creating DB4O connection: " + ex.getMessage());
            ex.printStackTrace();
        }
        return null;
    }

    public synchronized void storeSystem(EcoSystem system) {
        ObjectContainer conn = null;
        try {
            conn = createConnection();
            if (conn != null) {
                conn.store(system);
                conn.commit();
            }
        } catch (Exception ex) {
            System.err.println("Error storing system: " + ex.getMessage());
            ex.printStackTrace();
        } finally {
            shutdown(conn);
        }
    }

    public EcoSystem retrieveSystem() {
        ObjectContainer conn = null;
        EcoSystem system = null;
        try {
            conn = createConnection();
            if (conn != null) {
                ObjectSet<EcoSystem> systems = conn.query(EcoSystem.class);
                if (systems.isEmpty()) {
                    system = ConfigureASystem.configure(); // Create a new system if none exists
                } else {
                    system = systems.get(systems.size() - 1);
                }
            }
        } catch (Exception ex) {
            System.err.println("Error retrieving system: " + ex.getMessage());
            ex.printStackTrace();
        } finally {
            shutdown(conn);
        }
        return system;
    }
}
