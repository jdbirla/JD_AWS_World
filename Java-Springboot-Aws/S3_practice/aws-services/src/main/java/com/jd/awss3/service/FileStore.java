package com.jd.awss3.service;

import com.amazonaws.services.s3.AmazonS3;
import com.amazonaws.services.s3.model.AmazonS3Exception;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import java.io.File;

/**
 * Created by jd birla on 18-01-2023 at 10:03
 */
@Service
public class FileStore {

    Logger logger = LoggerFactory.getLogger(FileStore.class);

    @Autowired
    private AmazonS3 amazonS3;

    public String createBucket(String bucketName) {
        logger.info("Inside methode createBucket");
        try {
            if (bucketAlreadyExists(bucketName)) {
                logger.error("bucket already exist");
            }
            amazonS3.createBucket(bucketName);
        } catch (AmazonS3Exception s3Exception) {
            logger.error("Unable to create bucket :" + s3Exception.getMessage());
        }
        return "Bucket created with name:" + bucketName;
    }

    private boolean bucketAlreadyExists(String bucketName) {
        logger.info("Inside method bucketAlreadyExists");
        return amazonS3.doesBucketExistV2(bucketName);
    }

    public void uploadFiletoBucket(MultipartFile multiPart, String bucketName) throws Exception {
        logger.info("Inside method upload");
        File convFile = new File(System.getProperty("java.io.tmpdir") + "/" + multiPart.getOriginalFilename());
        multiPart.transferTo(convFile);
        try {
            amazonS3.putObject(bucketName, convFile.getName(), convFile);

        } catch (AmazonS3Exception s3Exception) {
            logger.error("Unable to upload file :" + s3Exception.getMessage());
        }
    }

    public void deletFile(String bucketName, String fileName) {
        amazonS3.deleteObject(bucketName, fileName);
    }

    public void deleteBucket(String bucketName) {
        amazonS3.deleteBucket(bucketName);
    }


}
