package com.qms.rest.model;

import lombok.*;

import java.util.Set;

@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
@ToString

public class CareGapMeasure {
    //private String maasureName;

    private Set<String> cearGapMeasureList;
}
