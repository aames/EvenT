package net.ajed.event.persistence;

import com.mongodb.MongoClient;
import com.mongodb.MongoCredential;
import com.mongodb.ServerAddress;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;
import net.ajed.event.interfaces.Persist;
import org.bson.Document;

import java.util.Arrays;

/**
 * MongoDB specific implementation
 */

public class MongoWorker implements Persist {

    private MongoClient mc;
    private MongoCredential credential;
    private MongoDatabase database;
    private MongoCollection<Document> collection;
    private String hostname;
    private int port;
    private String db;
    private String username;
    private String password;
    private String eventsCollection;

    public MongoWorker(String hostname, int port){
        this.mc = new MongoClient(hostname, port);

    }

    public MongoWorker(String hostname, int port, String username, String password, String database, String eventsCollection){
        this.hostname = hostname;
        this.port = port;
        this.username = username;
        this.password = password;
        this.db = database;

        this.credential = MongoCredential.createCredential(this.username, this.db, this.password.toCharArray());
        this.mc = new MongoClient(new ServerAddress(this.hostname, this.port), Arrays.asList(this.credential));
        this.database = this.mc.getDatabase(this.db);
        this.collection = this.database.getCollection(eventsCollection);
    }
}
