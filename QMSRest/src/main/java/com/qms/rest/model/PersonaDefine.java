package com.qms.rest.model;

import lombok.*;

import java.util.ArrayList;
import java.util.List;

@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class PersonaDefine {
    private int clusterId;
    private String personaName;
    private String demographics;
    private String motivations;
    private String goals;
    private String barriers;
    private String socialMedia;
    private String healthStatus;
    private String demoAgeGroup;
    private String demoEducation;
    private String demoIncome;
    private String demoOccupation;
    private String demoAddictions;
    private String demoFamilySize;
    private String imageUrl;
    private String bio;
    private List<String> uploadFilesList = new ArrayList<>();
}
