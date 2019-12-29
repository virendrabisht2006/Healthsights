package com.qms.rest.service;

import com.qms.rest.exception.QMSException;
import com.qms.rest.model.DimMemberGapListSearch;
import com.qms.rest.model.DimMemeberList;
import com.qms.rest.model.MemberCareGapsList;
import com.qms.rest.model.QMSMemberReq;

import java.util.List;

public interface MemberGapListService {

    DimMemeberList findMembergapListByMid(String mid);

    QMSMemberReq editMembergapListByQMS(QMSMemberReq qMSMemberReq) throws QMSException;

    List<MemberCareGapsList> findAllMembersList();

    List<DimMemberGapListSearch> findSearchMembergapList(String search);

    List<MemberCareGapsList> getHomePageCareGapsList();

    List<MemberCareGapsList> findAllMembersListFromHive();
}
