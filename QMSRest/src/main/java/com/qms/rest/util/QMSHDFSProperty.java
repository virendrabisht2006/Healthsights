package com.qms.rest.util;

import lombok.*;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@ConfigurationProperties(prefix = "qmsHDFS")
@Component
@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class QMSHDFSProperty {

    private String coreSite;
    private String hdfsSite;
    private String hdfsURL;
    private String readFile;
    private String writePath;
    private String hdfsUser;

    //models
    private String rapiNoShow;
    private String rapiLHE;
    private String rapiLHC;
    private String rapiPersona;
    private String rapiNC;

//	//models upload path	
//	private String uploadPathNoshow;	
//	private String uploadPathLHE;
//	private String uploadPathLHC;		
//	private String uploadPathPersona;
//	private String uploadPathNC;	

//qmsHDFS.uploadPathNoshow=/home/hdp-hadoop/models/noshow/input/
//qmsHDFS.uploadPathLHE=/home/hdp-hadoop/models/me/lhe/input/
//qmsHDFS.uploadPathLHC=/home/hdp-hadoop/models/me/lhc/input/
//qmsHDFS.uploadPathPersona=/home/hdp-hadoop/models/me/persona/input/
//qmsHDFS.uploadPathNC=/home/hdp-hadoop/models/nc/input/	
}
