package com.marawan.tickets.services;

import com.marawan.tickets.domain.CreateEventRequest;
import com.marawan.tickets.domain.entities.Event;

import java.util.UUID;

public interface EventService {
    Event createEvent(UUID organizerId, CreateEventRequest event);
}
