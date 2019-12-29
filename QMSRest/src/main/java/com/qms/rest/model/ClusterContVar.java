package com.qms.rest.model;

import lombok.*;

@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class ClusterContVar {
    private String sno;
    private String clusterId;
    private String attribute;
    private String min;
    private String firstQuartile;
    private String median;
    private String secondQuartile;
    private String max;
}
