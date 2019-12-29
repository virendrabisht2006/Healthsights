package com.qms.rest.model;

import lombok.*;

@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class RewardSet {
    private String category;
    private String goal;
    private String frequency;
    private String goalDate;
    private String reward;
    private String interventions;
    private String performance;
    private int goalSetId;
}
