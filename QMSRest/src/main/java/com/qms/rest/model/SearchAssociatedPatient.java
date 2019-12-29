package com.qms.rest.model;

import lombok.*;

@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class SearchAssociatedPatient {
    String patId;
    String name;
    String patMrn;
}
