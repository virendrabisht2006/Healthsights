package com.qms.rest.model;

import lombok.*;

@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class PersonaMemberListView {
    private String memberId;
    private String personaName;
    private String goals;
    private String measureCalorieIntake;
    private String comorbidityCount;
    private String addictions;
    private String rewards;
    private String motivations;

    private String modeOfContact;
    private String formOfExercise;
    private String frequencyOfExcercise;
    private String idealHealthGoal;
    private String socialMediaUsage;
    private String age;
    private String gender;
    private String ethnicity;
    private String weight;
    private String clusterId;
}
