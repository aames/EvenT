package net.ajed.event.persistence;

import net.ajed.event.core.Event;
import net.ajed.event.core.EventBag;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.HashMap;

/**
 * A generic persistence facade to decouple the database specific code.
 * This application has been built with MongoDB in mind and with this class as an abstraction
 * instead of working directly with the Mongo driver here.
 */
public class Persistence  {
    Logger logger = LoggerFactory.getLogger(Persistence.class);
    private PersistenceConfigLoader pl = new PersistenceConfigLoader();
    // TODO: Load value from app.config instead
    private HashMap<String, String> configuration = pl.getConfiguration("db.config");

    // Methods
    public boolean addEventToBag(Event e){ return true; }
    public boolean addEventBagWithEvents(EventBag eb){ return true; }

}
