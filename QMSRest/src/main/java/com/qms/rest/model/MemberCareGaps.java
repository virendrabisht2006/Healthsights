package com.qms.rest.model;

import lombok.*;

@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class MemberCareGaps {
    private String careGaps;
    private String plan;
    private String timePeriod;
    private String pcp;
    private String Status;
    private String qualityMeasureId;
}
