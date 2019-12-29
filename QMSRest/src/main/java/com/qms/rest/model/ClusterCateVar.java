package com.qms.rest.model;

import lombok.*;

@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class ClusterCateVar {
    private String sno;
    private String clusterId;
    private String attribute;
    private String label;
    private String value;
}
