import java.util.Date;
import java.util.UUID;

public class Event {
    private UUID id;
    private Date dateTimeCreated;
    private Date dateTimeEventExpiry;
    private Date dateTimeCompleted;
    private String uniqueName;
    private String description;
    private boolean hasErrors;
    private String errorDescription;

    // Only use this constructor
    public Event(String uniqueName, String description){
        this.dateTimeCreated = new Date();
        this.uniqueName = uniqueName;
        if (description != null){
            this.description = description;
        }
    }

    // Core methods
    public void registerCompletion(String description){
        if (description != null){
            this.description = description;
        }
        this.dateTimeCompleted = new Date();
    }

    public void registerErrors(String errorDescription){
        this.errorDescription = errorDescription;
        this.dateTimeCompleted = new Date();
        this.hasErrors = true;
    }

    // Getters
    public UUID getId() {
        return id;
    }

    public Date getDateTimeCreated() {
        return dateTimeCreated;
    }

    public Date getDateTimeEventExpiry() {
        return dateTimeEventExpiry;
    }

    public Date getDateTimeCompleted() {
        return dateTimeCompleted;
    }

    public String getUniqueName() {
        return uniqueName;
    }

    public String getDescription() {
        return description;
    }

    public boolean isHasErrors() {
        return hasErrors;
    }

    public String getErrorDescription() {
        return errorDescription;
    }

    // Setters
    public void setDateTimeEventExpiry(Date dateTimeEventExpiry) {
        this.dateTimeEventExpiry = dateTimeEventExpiry;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    // etc...
    @Override
    public String toString() {
        return "Event{" +
                "id=" + id +
                ", dateTimeCreated=" + dateTimeCreated +
                ", dateTimeEventExpiry=" + dateTimeEventExpiry +
                ", dateTimeCompleted=" + dateTimeCompleted +
                ", uniqueName='" + uniqueName + '\'' +
                ", description='" + description + '\'' +
                ", hasErrors=" + hasErrors +
                ", errorDescription='" + errorDescription + '\'' +
                '}';
    }
}
