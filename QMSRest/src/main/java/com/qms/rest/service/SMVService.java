package com.qms.rest.service;

import com.qms.rest.model.*;

import java.util.Set;

public interface SMVService {

    Set<SMVMemberDetails> getSMVMemberDetails(String memberId);

    Set<SmvMemberClinical> getSmvMemberClinical(String memberId);

    Set<SMVMemberPayerClustering> getSMVMemberPayerClustering(String memberId);

    Set<LhcMemberView> getLhcMemberViewList();

    Set<LhrMemberListView> getLhrMemberListView();

    Set<String> getMemberIdList(String memberListType);

    SmvMember getSmvMember(String memberId);

    Set<RewardSet> getIntervention(String memberId);

}
