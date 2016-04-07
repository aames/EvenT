#EvenT 

## Introduction

This project is a microservice that handles events. Why, you might ask.

Well, sometimes when you're working with an integrated system it is necessary to register events in the same way you might write yourself a to-do list. Crossing off expected events that have been completed means you can keep track of things that might fail when you're running tasks that involve multiple systems (that are asynchronously connected).

The idea is that you register an event "bag" with the service (bag is just a collection in this case, but it seemed fitting - because you can throw anything into a bag), add some events to the event bag (or just 1, up to you) then another service may call the service to confirm completion. 

The cool thing about an event service is that you can call it to find out <b>where</b> your jobs are failing, taking a while to complete, or you can use it as an audit log to keep track of the number of events in your system.

##Key concepts:

- net.ajed.event.core.Event: A single event
- net.ajed.event.core.Event Bag: Aggregated events

#How is it supposed to work?

## Vague description of the concept

EventService creates an net.ajed.event.core.EventBag, which EventService can then add events to.

The net.ajed.event.core.Event is the core entity, the net.ajed.event.core.EventBag is a repository of events grouped by a 'thing' (I will avoid the word task).

# Pre-requisites
- MongoDB (>3)

# Config

## db.config

## app.config

