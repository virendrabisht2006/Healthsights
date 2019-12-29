package com.qms.rest.service;

import com.qms.rest.model.CloseGaps;
import com.qms.rest.model.GicLifeCycleFileUpload;
import com.qms.rest.model.RestResult;
import org.springframework.web.multipart.MultipartFile;

import java.sql.Statement;
import java.util.HashMap;
import java.util.List;

public interface CloseGapsService {

    CloseGaps getCloseGaps(String memberId, String measureId);

    RestResult insertCloseGaps(CloseGaps closeGaps, String memberId, String measureId);

    RestResult importFile(MultipartFile file, String type);

    RestResult saveFileUpload(GicLifeCycleFileUpload fileUpload);

    HashMap<Integer, List<String>> getUploadFileByTypeId(Statement statement, List<Integer> typeIds, int typeId,
                                                         String type) throws Exception;

}
