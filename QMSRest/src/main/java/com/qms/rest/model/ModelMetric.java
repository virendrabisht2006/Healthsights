package com.qms.rest.model;

import lombok.*;

@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class ModelMetric {

    private String tp;
    private String fp;
    private String tn;
    private String fn;
    private String score;
    private String imagePath;
}
