package com.marawan.tickets.mappers;

import com.marawan.tickets.domain.CreateEventRequest;
import com.marawan.tickets.domain.CreateTicketTypeRequest;
import com.marawan.tickets.domain.dtos.CreateEventRequestDto;
import com.marawan.tickets.domain.dtos.CreateEventResponseDto;
import com.marawan.tickets.domain.dtos.CreateTicketTypeRequestDto;
import com.marawan.tickets.domain.entities.Event;
import org.mapstruct.Mapper;
import org.mapstruct.ReportingPolicy;

@Mapper(componentModel = "spring", unmappedTargetPolicy = ReportingPolicy.IGNORE)
public interface EventMapper {

    CreateTicketTypeRequest fromDto(CreateTicketTypeRequestDto dto);
    CreateEventRequest fromDto(CreateEventRequestDto dto);
    CreateEventResponseDto toDto(Event event);
}
