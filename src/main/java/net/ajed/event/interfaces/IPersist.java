package net.ajed.event.interfaces;

import net.ajed.event.core.Event;
import net.ajed.event.core.EventBag;

import java.util.List;
import java.util.UUID;

/**
 * EvenT
 * net.ajed.event.interfaces
 * 2016
 */
public interface IPersist {

    public boolean connect();
    public UUID createNewBag(String name);
    public EventBag findBag(String id);
    public Event findEvent(String bagId);
    public List<EventBag> findIncompleteEventBags();
    public List<EventBag> findExpiredEventBags();
    public List<EventBag> findEventBagsByName();
}
