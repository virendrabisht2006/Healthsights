package com.qms.rest.model;

import lombok.*;

import java.util.ArrayList;
import java.util.List;


@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class RefModel {

    //private String refModelId;
    //private String modelName;
    private List<String> refModelNameList = new ArrayList<>();

}
