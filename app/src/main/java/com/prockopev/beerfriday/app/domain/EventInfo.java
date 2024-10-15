package com.prockopev.beerfriday.app.domain;

import com.prockopev.beerfriday.app.domain.enums.Status;
import lombok.Data;

import java.time.LocalDateTime;

@Data
public class EventInfo {
    private Long eventInfoId;
    private Long eventId;
    private Long participantId;
    private Status status;
    private LocalDateTime acceptedAt;
}
