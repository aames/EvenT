package net.ajed.event.core;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.UUID;

public class EventBag {
    private UUID eventBagId;
    private String eventName;
    private List<String> tags;
    private List<Event> events;

    public EventBag(String eventName){
        this.eventName = eventName;
        this.events = new ArrayList<Event>();
        this.eventBagId = UUID.randomUUID();
        this.tags = new ArrayList<String>();
    }

    public EventBag(String eventName, List<String> tags){
        this.eventName = eventName;
        this.events = new ArrayList<Event>();
        this.eventBagId = UUID.randomUUID();
        this.tags = new ArrayList<String>();
        this.tags.addAll(tags);
    }

    public void addEvent(Event event){
        // TODO: if name is unique then:
        this.events.add(event);
    }

    public void addEventWithExpiry(Event event, Date expiry){
        // TODO: if name is unique then:
        this.events.add(event);
        // expire setup
    }

    public void markEventComplete(String uniqueEventName, String description){
        for (Event e : this.events){
            if (e.getUniqueName().contentEquals(uniqueEventName)){
                e.registerCompletion(description);
                break;
            }
        }
    }

    public void markEventCompleteWithErrors(String uniqueEventName, String description, String errors){
        //TODO: complete logic
    }

    public List<Event> getEvents(){
        return this.events;
    }

}
