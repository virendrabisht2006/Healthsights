package com.qms.rest.model;

import lombok.*;

@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class GoalSet {
    private String memberId;
    private String name;
    private String age;
    private String gender;
    private String persona;
    private String physicalActivityGoal;
    private String physicalActivityFrequency;
    private String physicalActivityDate;
    private String calorieIntakeGoal;
    private String calorieIntakeFrequency;
    private String calorieIntakeDate;
    private String careGap;
    private String careGapDate;
}
