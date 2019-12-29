package com.qms.rest.model;

import lombok.*;

@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class GicLifeCycleFileUpload {
    //	private int fileId;
//	private int lifeCycleId;
    private String filePath;
    private String fileName;
    private String type;
    private String typeId;
}