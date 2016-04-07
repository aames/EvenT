package net.ajed.event.persistence;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.HashMap;
import java.util.Properties;


/**
 * A generic persistence facade to decouple the database specific code.
 * This application has been built with MongoDB in mind and with this class as an abstraction
 * instead of working directly with the Mongo driver here.
 */
public class Persistence {
    Logger logger = LoggerFactory.getLogger(Persistence.class);
    private HashMap<String, String> configuration = new HashMap<>();

    public Persistence(String configFileRelativePathName){

        logger.info("Reading db.config");

        boolean successfulLoad = false;
        try{
            successfulLoad = getProperties(configFileRelativePathName);
        } catch (IOException e){
            logger.error("Failed to load properties from db.config.", e);
        }
        if (!successfulLoad)
            logger.info("Failed to load configuration files successfully");
    }

    public HashMap<String, String> getConfiguration(){
        //TODO: Placeholder. WIP.
        return null;
    }

    private boolean getProperties(String configFileRelativePathName) throws IOException {
        InputStream inputStream = null;
        try {
            Properties properties = new Properties();
            inputStream = getClass().getClassLoader().getResourceAsStream(configFileRelativePathName);

            if (inputStream != null) {
                properties.load(inputStream);
            } else {
                throw new FileNotFoundException("property file '" + configFileRelativePathName + "' not found.");
            }

            String type = properties.getProperty("persistence_implementation");
            // TODO: Continue fetching properties


        } catch (Exception e) {
            logger.error("In getProperties()", e);
            throw e;
        } finally {
            inputStream.close();
        }
        return true;
    }


}
