package com.qms.rest.model;

import lombok.*;

@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class GoalRecommendationSet {
    private String memberId;
    private String name;
    private String age;
    private String gender;
    private String persona;
    private GoalRecommendationSetData goalRecommendation;
    private GoalRecommendationSetData goalSet;
}
