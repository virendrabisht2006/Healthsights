package com.qms.rest.model;

import lombok.*;

@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class Patient {
    private String patientId;
    private String firstName;
    private String lastName;
    private String dob;
    private String gender;
}
