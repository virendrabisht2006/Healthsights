package com.qms.rest.model;

import lombok.*;

@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class RewardRecommendationSet {
    private String memberId;
    private String name;
    private String age;
    private String gender;
    private String persona;

    private String motivations;
    private String category;
    private String goal;
    private String frequency;
    private String rewardRecommendation;
    private String rewardSet;
    private String rewardId;

}
