package com.qms.rest.model;

import lombok.*;

@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class QmsReffReward {
    private String rewardId;
    ;
    private String rewardl;
    private String latestFlag;
    private String activeFlag;
    private String ingestionDate;
    private String sourceName;
    private String userName;
}
