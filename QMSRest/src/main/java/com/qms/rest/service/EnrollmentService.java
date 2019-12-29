package com.qms.rest.service;

import com.qms.rest.model.*;

import java.util.List;
import java.util.Set;

public interface EnrollmentService {
    List<EnrollmentFileOutput> getEnrollmentFileOutput(String criteria);

    RestResult updateEnrollmentFileOutput(List<EnrollmentFileOutput> enrollmentFileOutputList, String flag);

    public Objectives getObjectivesByTitle(String title);

    FactGoalRecommendations getFactGoalRecommendations(String memberId);

    RestResult insertFactGoalRecommendationsCreator(FactGoalRecommendations factGoalRecommendations);

    RestResult updateFactGoalRecommendations(FactGoalRecommendations factGoalRecommendations);

    public PersonaMemberListView getPersonaMemberList(String mid);

    public Set<String> getDataByTableAndColumn(String tableName, String columnName);

    RestResult updateRewards(String memberId, List<String> rewards);

    public Set<String> getAllRewards(String questionId);

    public List<RewardsFileOutput> getRewardsFileOutputList(String memberId);

    RestResult insertRewardsFileOutput(List<RewardsFileOutput> rewardsFileOutputList);

    public RestResult insertRewardsRecommendations(RewardsRecommendations rewardsRecommendations);

    public Set<PersonaMemberListView> filterPersonaMemberList(String filterType, String filterValue);

    public Set<GoalRecommendationSet> getGoalRecommendationsSetMemberList();

    public Set<RewardRecommendationSet> getRewardRecommendationsSetMemberList();

    Set<RefPhysicalActivity> getQmsRefPhysicalActivity(String goal, String frequency);

    Set<RefCalorieIntake> getQmsRefCalorieIntake(String goal, String frequency);

    Set<RefPhysicalActivity> getQmsRefPhysicalActivityFrequency(String goal);

    FactGoalInterventions getFactGoalInterventions(String memberId);

    RestResult updateFactGoalInterventions(FactGoalInterventions factGoalInterventions);

    Set<String> getCareGapListByMemberId(String memberId);

    public Set<NameValue> getCareGapMemberId1(String memberId);


    Set<NameValue> getQmsQualityMeasureId(String memberId);

    Set<NameValue> getQmsRewardId(String reward);

}
