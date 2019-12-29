package com.qms.rest.repository;

import com.qms.rest.model.FileUpload;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import java.util.List;

@RepositoryRestResource
public interface FileUpoadRepository extends CrudRepository<FileUpload, Integer> {
    @Query(value = "select * from QMS_FILE_UPLOAD where FILE_ID in (select max(FILE_ID) from QMS_FILE_UPLOAD)", nativeQuery = true)
    List<FileUpload> getFileUpoadByMaxFileId();
}
