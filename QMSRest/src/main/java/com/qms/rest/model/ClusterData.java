package com.qms.rest.model;

import lombok.*;

@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class ClusterData {

//	Set<ClusterCateVar> clusterCateVars;	
//	Set<ClusterContVar> clusterContVars;

    PersonaDefine clusterPersona;
    PersonaClusterFeatures personaClusterFeatures;
}
