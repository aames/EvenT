package net.ajed.event.persistence;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.HashMap;
import java.util.Properties;

/**
 * EvenT
 * net.ajed.event.persistence
 * 2016
 */
public class PersistenceConfigLoader {

    final Logger logger = LoggerFactory.getLogger(PersistenceConfigLoader.class);

    public PersistenceConfigLoader(){

    }

    public HashMap<String, String> getConfiguration(String configFileRelativePathName){
        HashMap<String, String> configurationElements = new HashMap<>();
        //TODO: Placeholder. WIP.
        logger.info("Reading db.config");
        boolean successfulLoad = false;
        try{
            successfulLoad = getProperties(configFileRelativePathName);
        } catch (IOException e){
            logger.error("Failed to load properties from db.config.", e);
        }
        if (!successfulLoad)
            logger.info("Failed to load configuration files successfully");
        return configurationElements;
    }

    private boolean getProperties(String configFileRelativePathName) throws IOException {
        try (InputStream inputStream = getClass().getClassLoader().getResourceAsStream(configFileRelativePathName);)  {
            Properties properties = new Properties();
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
        }
        return true;
    }
}
