package com.jd.awss3.service;

import com.amazonaws.services.s3.AmazonS3;
import com.amazonaws.services.s3.model.AmazonS3Exception;
import com.amazonaws.services.s3.model.S3Object;
import com.amazonaws.util.IOUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;
import java.io.InputStream;

/**
 * Created by jd birla on 18-01-2023 at 10:11
 */
@Service
public class BucketService {
    Logger logger = LoggerFactory.getLogger(FileStore.class);

    @Autowired
    private FileStore fileStore;

    public String createBucket(String bucketName) {
        return fileStore.createBucket(bucketName);
    }
    public void downloadFile(String fileName, AmazonS3 amazonS3, String bucketName) {
        try {
            logger.info("File to be fetched from S3 {}", fileName);
            S3Object s3Object = amazonS3.getObject(bucketName, fileName);

            InputStream objectContent = s3Object.getObjectContent();

            String content = IOUtils.toString(objectContent);
            // String content = convertInputStreamToString(objectContent);
            logger.info("Content {}", content);

        } catch (IOException e) {
            logger.error("Error in reading file content {}", e.getMessage());
        } catch (AmazonS3Exception s3Exception) {
            logger.error("Some error occured", s3Exception.getMessage());
        }

    }
    public String uploadFile(MultipartFile file, String bucketName) {
        if (file.isEmpty()) {
            throw new IllegalStateException("Cannot upload empty file");
        }
        try {
            fileStore.uploadFiletoBucket(file, bucketName);
        } catch (Exception e) {
            throw new IllegalStateException("Failed to upload file", e);
        }
        return "File Uploaded Successfully";
    }

    public String deleteBucket(String bucketName) {
        fileStore.deleteBucket(bucketName);
        return "Bucket deleted successfully";
    }

    public String deleteFile(String bucketName, String fileName) {
        fileStore.deletFile(bucketName,fileName);
        return "File deleted successfully";
    }

}
