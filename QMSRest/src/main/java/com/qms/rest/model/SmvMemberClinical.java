package com.qms.rest.model;

import lombok.*;

@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class SmvMemberClinical {
    private String procedureName;
    private String drugCode;
    private String encCsnId;
    private String memberId;
    private String immunizationName;
    private String immunizationStatus;
    private String encounterDateSk;
}
