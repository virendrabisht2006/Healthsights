package com.qms.rest.service;

import com.qms.rest.model.*;

import java.util.List;
import java.util.Set;

public interface MemberEngagementService {

    Set<ModelSummary> getCSVModelSummary();

    Set<ConfusionMatric> getCSVConfusionMatric();

    ModelScore getCSVModelScore();

    String[][] getCSVClusterAnalysis();

    RestResult updateClusteringPersona(PersonaDefine clusteringPersona);

    ClusterData getClusteringData(String clusterId);

    GraphData getPersonaClusterFeaturesGraphData(String clusterId, String attributeName);

    Set<PersonaClusterFeatures> getPersonaClusterFeatures(String clusterId);

    Set<String> getPersonaClusterNames();

    Set<RoleLandingPage> getRoleLandingPage();

    ///////////LHE////////////////////
    Set<LHEOutput> getLHEModelOutPut();

    Set<ModelSummary> getLHEModelSummary();

    ModelMetric getLHEModelMetric();

    String[][] getLHEReasonNotEnrollStatics();

    RestResult createLHEInputFile();

    ///////////Persona///////////////////
    RestResult createPersonaInputFile();

    Set<PersonaMember> personaMemberList(String clusterId);

    List<PersonaClusterFeatures> getCPFeature();

    Set<CPOutput> getCPOutput();

    String[][] getCPStatistics();

    ///////////LHC////////////////////
    RestResult createLHCInputFile();

    Set<LHCMember> lhcMemberList();

    Set<ModelSummary> getLHCModelSummary();

    ModelMetric getLHCModelMetric();

}
