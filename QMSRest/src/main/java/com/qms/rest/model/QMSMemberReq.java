package com.qms.rest.model;

import lombok.*;

@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class QMSMemberReq {
    private String memberId;
    private String careGaps;
    private String careGapsId;
    private String interventions;
    private String priority;
    private String payorComments;
    private String providerComments;
    private String status;

}
