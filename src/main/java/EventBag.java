import org.bson.types.ObjectId;

import java.util.ArrayList;
import java.util.List;

public class EventBag {
    private ObjectId id;
    private String eventName;
    private List<Event> events;

    public EventBag(String eventName){
        this.id = new ObjectId();
        this.eventName = eventName;
        this.events = new ArrayList<Event>();
    }

    public void addEvent(Event event){
        // TODO: if name is unique then:
        this.events.add(event);
    }

    public void markEventComplete(String uniqueEventName){

    }
}
