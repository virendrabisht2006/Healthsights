package com.qms.rest.model;

import lombok.*;

import java.util.Set;

@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class PatActionCareGap {
    Set<String> valueSet;
    Set<String> codeType;
    Set<String> codes;
}
