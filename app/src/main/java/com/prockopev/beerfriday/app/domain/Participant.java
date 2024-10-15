package com.prockopev.beerfriday.app.domain;

import com.prockopev.beerfriday.app.domain.enums.JobTitle;
import lombok.Data;

@Data
public class Participant {
    private Long id;
    private String firstName;
    private String lastName;
    private String phoneNumber;
    private JobTitle jobTitle;
}
