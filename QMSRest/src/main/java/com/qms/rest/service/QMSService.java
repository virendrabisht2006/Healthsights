package com.qms.rest.service;

import com.qms.rest.model.*;

import java.util.Set;

public interface QMSService {

    Set<MeasureCreator> getMeasureLibrary(String programName, String value);

    MeasureCreator getMeasureLibraryById(int id);

    Set<String> getMeasureDropDownList(String tableName, String columnName);

    Set<NameValue> getMeasureDropDownNameValueList(String tableName, String columnValue, String columnName);

    Set<String> getQMSHomeDropDownList(String tableName, String columnName);

    Set<String> getCategoryByProgramId(String programId);

    //Set<NameValue> getDropDownOnChangeList(String tableName, String baseColumn, String getColumn1, String getColumn2);

    RestResult insertMeasureCreator(MeasureCreator measureCreator);

    RestResult updateMeasureCreator(MeasureCreator measureCreator);

    MeasureCreator findMeasureCreatorById(int id);

    Set<MeasureCreator> getAllWorkList();

    RestResult updateMeasureWorkListStatus(int id, String status, Param param);

    Set<RefMrss> getRefMrssList();

    Set<RefMrssSample> getRefMrssSaimpleList();

    Set<String> getProductPlanByLobId(String lobId);
}
