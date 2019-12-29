package com.qms.rest.service;

import com.qms.rest.model.MeasureConfig;
import com.qms.rest.model.RestResult;
import com.qms.rest.model.TableData;

import java.util.List;
import java.util.Set;

public interface MeasureConfigService {

    Set<TableData> getMeasureConfigData();

    RestResult insertMeasureConfig(List<MeasureConfig> measureConfig, String category);

    RestResult updateMeasureConfig(List<MeasureConfig> measureConfig, String category);

    List<MeasureConfig> getMeasureConfigById(String measureId, String category);

}
