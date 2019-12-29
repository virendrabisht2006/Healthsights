package com.qms.rest.model;

import lombok.*;

@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class ProgramCategoryEdit {

    private String categoryName;
    private int maxPoints;
    private int maxScore;
}
