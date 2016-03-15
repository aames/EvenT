import org.bson.types.ObjectId;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

public class EventBag {
    private ObjectId id;
    private UUID eventBagId;
    private String eventName;
    private List<Event> events;

    public EventBag(String eventName){
        this.id = new ObjectId();
        this.eventName = eventName;
        this.events = new ArrayList<Event>();
        this.eventBagId = UUID.randomUUID();
    }

    public void addEvent(Event event){
        // TODO: if name is unique then:
        this.events.add(event);
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
