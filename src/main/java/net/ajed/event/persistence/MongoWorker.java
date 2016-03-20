package net.ajed.event.persistence;

import com.mongodb.MongoClient;
import com.mongodb.MongoCredential;
import com.mongodb.ServerAddress;

import java.util.Arrays;

/**
 * MongoDB specific implementation
 */

public class MongoWorker {

    private MongoClient mc;
    private int port;
    private String hostname;
    private String db;
    private MongoCredential credential;
    private String username;
    private String password;

    public MongoWorker(String hostname, int port){
        this.mc = new MongoClient(hostname, port);

    }

    public MongoWorker(String hostname, int port, String username, String password, String database){
        this.hostname = hostname;
        this.port = port;
        this.username = username;
        this.password = password;
        this.db = database;

        this.credential = MongoCredential.createCredential(this.username, this.db, this.password.toCharArray());
        this.mc = new MongoClient(new ServerAddress(this.hostname, this.port), Arrays.asList(this.credential));

    }
}
