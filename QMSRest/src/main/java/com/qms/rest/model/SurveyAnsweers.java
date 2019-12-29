package com.qms.rest.model;

import lombok.*;

import java.util.Set;

@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class SurveyAnsweers {

    //private String answerId;
    //private String questionId;
    //private String answer;
    //private String latestFlag;
    //private String activeFlag;
    //private String ingestionDate;
    //private String sourceName;
    //private String userName;

    private Set<String> answerList;


}
