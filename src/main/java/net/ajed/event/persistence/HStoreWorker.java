package net.ajed.event.persistence;

import net.ajed.event.core.Event;
import net.ajed.event.core.EventBag;
import net.ajed.event.interfaces.IPersist;
import sun.reflect.generics.reflectiveObjects.NotImplementedException;

import java.util.List;
import java.util.UUID;

/**
 * EvenT
 * net.ajed.event.persistence
 * 2016
 *
 * Summary:
 * In time... We'll support HStore too
 */
public class HStoreWorker implements IPersist {
    public HStoreWorker(){
        throw new NotImplementedException();
    }

    @Override
    public boolean connect() {
        return false;
    }

    @Override
    public UUID createNewBag(String name) {
        return null;
    }

    @Override
    public EventBag findBag(String id) {
        return null;
    }

    @Override
    public Event findEvent(String bagId) {
        return null;
    }

    @Override
    public List<EventBag> findIncompleteEventBags() {
        return null;
    }

    @Override
    public List<EventBag> findExpiredEventBags() {
        return null;
    }

    @Override
    public List<EventBag> findEventBagsByName() {
        return null;
    }
}
