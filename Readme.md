#EvenT is an event service

The idea is that you register an event with the service, then another service may connect and call the service to confirm completion. 

~Key concepts:

- net.ajed.event.core.Event: A single event
- net.ajed.event.core.Event Bag: Aggregated events

How is it supposed to work?

# Vague description of the concept

EventService creates an net.ajed.event.core.EventBag, which EventService can then add events to.

The net.ajed.event.core.Event is the core entity, the net.ajed.event.core.EventBag is a repository of events grouped by a 'thing' (I will avoid the word task).




