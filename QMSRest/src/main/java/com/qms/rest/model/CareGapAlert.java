package com.qms.rest.model;

import lombok.*;

import java.util.List;

@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class CareGapAlert implements Comparable<CareGapAlert> {
    private String careGap;
    private List<Integer> alerts;

    @Override
    public int compareTo(CareGapAlert arg0) {
        if (arg0 != null && arg0.getCareGap() != null)
            return careGap.compareTo(arg0.getCareGap());
        else
            return 0;
    }

}
