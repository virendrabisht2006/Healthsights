package com.qms.rest.model;

import lombok.*;

import java.util.List;

@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class ProgramEdit {
    private int programId;
    private String programName;
    private String startDate;
    private String endDate;
    private List<ProgramCategoryEdit> programCategorys;
}
