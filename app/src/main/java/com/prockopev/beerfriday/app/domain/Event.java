package com.prockopev.beerfriday.app.domain;

import lombok.Data;

import java.time.LocalDateTime;
import java.util.List;

@Data
public class Event {
    private Long id;
    private String title;
    private String description;
    private List<Participant> participants;
    private List<EventInfo> eventInfo;
    private LocalDateTime createdAt;
    private LocalDateTime updatedAt;
    private LocalDateTime startedAt;
    private LocalDateTime endAt;
}
