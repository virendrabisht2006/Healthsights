package com.qms.rest.model;

import lombok.*;

import java.util.ArrayList;
import java.util.List;

@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class MemberCareGapsList {
    private String member_id;
    private String name;
    private String age;
    private String gender;
    private Integer countOfCareGaps;
    private String riskGrade;
    private List<MemberCareGaps> members;
    private String compliancePotential;
    private String measureSK;
    private List<String> careGaps = new ArrayList();
}
