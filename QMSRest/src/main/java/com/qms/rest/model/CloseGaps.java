package com.qms.rest.model;

import lombok.*;

import java.util.Set;

@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class CloseGaps {
    private String memberId;
    private String gender;
    private String name;
    private String dateOfBirth;

    private String careGap;
    private String openDate;
    private String targetDate;
    private String assignedTo;
    private String status;
    private String lastActionDate;
    private String nextAppointmentDate;

    private Set<CloseGap> careGaps;
}
