package com.qms.rest.service;

import com.qms.rest.model.*;
import org.springframework.web.multipart.MultipartFile;

import java.util.Set;

public interface ImportExportService {

    RestResult importFile(MultipartFile file, int fileId, String model);

    RestResult exportFile(String fileName);

    RestResult runRFile(String modelType);

    Set<CSVOutPut> getCSVOutPut();

    Set<CSVOutPut1> getCSVOutPut1();

    Set<ModelSummary> getCSVModelSummary();

    ModelMetric getCSVConfusionMatric();

    ModelScore getCSVModelScore();

    FileUpload saveFileUpload(FileUpload fileUpload);

    RestResult callHivePatitioning(String model);

    //Compliance
    Set<ComplianceOutPut> getComplianceOutPut();

    Set<ModelSummary> getComplianceModelSummary();

    ModelMetric getComplianceModelMetric();

    //Non Compliance
    Set<NCOutput> getNCOutPut();

    Set<ModelSummary> getNCModelSummary();

    ModelMetric getNCModelMetric();
}
