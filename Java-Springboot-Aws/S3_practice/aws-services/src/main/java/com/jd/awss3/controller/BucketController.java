package com.jd.awss3.controller;

import com.jd.awss3.service.BucketService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

/**
 * Created by jd birla on 18-01-2023 at 10:12
 */
@RestController
@RequestMapping("s3bucket")
@CrossOrigin("*")
public class BucketController {

    @Autowired
    BucketService service;

    /**
     * Calls Service class to create bucket on AWS S3
     *
     * @param bucketName
     * @return
     */
    @GetMapping("/add/{bucketName}")
    public ResponseEntity<String> createBucket(@PathVariable("bucketName") String bucketName) {
        return new ResponseEntity<>(service.createBucket(bucketName), HttpStatus.OK);
    }

    @PostMapping(path = "/upload/file/{bucketName}", consumes = MediaType.MULTIPART_FORM_DATA_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<String> uploadFile(@RequestParam("file") MultipartFile file,
                                             @PathVariable("bucketName") String bucketName) {
        return new ResponseEntity<>(service.uploadFile(file,bucketName), HttpStatus.OK);
    }

        @DeleteMapping(path="/delete/file/{bucketName}/{fileName}")
    public ResponseEntity<String> deleteFile(@PathVariable("bucketName")String bucketName,@PathVariable("fileName")String fileName)
    {
        return new ResponseEntity<>(service.deleteFile(bucketName,fileName),HttpStatus.OK);
    }

    @DeleteMapping("/delete/bucket/{bucketName}")
    public ResponseEntity<String> deleteBucket(@PathVariable("bucketName") String bucketName) {
        return new ResponseEntity<>(service.deleteBucket(bucketName), HttpStatus.OK);
    }
}
