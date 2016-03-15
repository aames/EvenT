#EvenT is an event service

The idea is that you register an event with the service, then another service may connect and call the service to confirm completion. 

~Key concepts:

- Event: A single event
- Event Bag: Aggregated events

How is it supposed to work?

# Vague description of the concept

EventService creates an EventBag, which EventService can then add events to.

The Event is the core entity, the EventBag is a repository of events grouped by a 'thing' (I will avoid the word task).




