package com.jd.sqs;


import io.awspring.cloud.messaging.listener.SqsMessageDeletionPolicy;
import io.awspring.cloud.messaging.listener.annotation.SqsListener;

import org.springframework.stereotype.Service;

/**
 * Created by jd birla on 18-01-2023 at 15:04
 */
@Service
public class Consumer {
    @SqsListener(value="aws-java-practice-q1",deletionPolicy = SqsMessageDeletionPolicy.ALWAYS)
    public void myConsumer(String message)
    {
        System.out.println("Message received:"+message);
    }

}
