package com.jd.sqs;

import com.amazonaws.services.sqs.AmazonSQSAsync;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;
/**
 * Created by jd birla on 18-01-2023 at 15:17
 */
@RestController("")
public class Publish {

    @Autowired
    @Qualifier("publish")
    private AmazonSQSAsync sqs;

    @Value("${sqs.url}")
    private String sqsUrl;

    @PostMapping("/publish/{msg}")
    public ResponseEntity<String> postMessage(@PathVariable("msg") String message) {
        sqs.sendMessage(sqsUrl, message);
        return new ResponseEntity<>("Message Published", HttpStatus.OK);
    }
}
