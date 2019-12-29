package com.qms.rest.model;

import lombok.*;

@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class CSVOutPut1 {

    private String patientId;
    private String name;
    private String appointmentId;
    private String gender;
    private String dayClass;
    private String appointmentDay;
    private String age;
    private String neighbourhood;
    private String logOdds;
    private String noshow;
    private String countCareGaps;
    private String riskGrade;

}
