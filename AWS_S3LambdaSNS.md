# AWS S3 , Lambda ans SNS design

### Step1 : Create Lambda
- create lambda function 
- set runtime java 11
- Lambda will create execution role to upload cloudwatch logs
- handler set : packagename.classname:handleRequest
		
### Step2: 
- Add tiggers 
- create bucket 
- event type : all object create events
        		 
### Step 3: Destination
- Source: Asynchronous invocation
- Condiftion : on failure 
		          : On Success
- Destination tye : SNS topic
		   
### Create SNS Topics
- create topic
- type :  standard
- Create subscription 
      	 Topic ARN : 
		 Protocol : Email
		 Endpoint : jitendra.birla@gmail.com
		 
- Confirm subcription 

```java
import com.amazonaws.services.lambda.runtime.Context;
import com.amazonaws.services.lambda.runtime.RequestHandler;
import com.amazonaws.services.lambda.runtime.events.S3Event;
import com.amazonaws.services.s3.AmazonS3;
import com.amazonaws.services.s3.AmazonS3ClientBuilder;
import com.amazonaws.services.s3.model.S3Object;
import com.amazonaws.services.s3.model.S3ObjectInputStream;
import com.amazonaws.services.sns.AmazonSNS;
import com.amazonaws.services.sns.AmazonSNSClientBuilder;
import com.amazonaws.services.sns.model.PublishRequest;
import java.io.IOException;
import java.io.InputStreamReader;
import com.opencsv.CSVReader;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class S3EventProcessor implements RequestHandler<S3Event, Void> {

    private static final String DB_URL = "jdbc:mysql://your-db-url-here";
    private static final String DB_USER = "your-db-user-here";
    private static final String DB_PASSWORD = "your-db-password-here";
    private static final String SNS_TOPIC_ARN = "your-sns-topic-arn-here";

    private AmazonS3 s3Client = AmazonS3ClientBuilder.defaultClient();
    private AmazonSNS snsClient = AmazonSNSClientBuilder.defaultClient();

    @Override
    public Void handleRequest(S3Event event, Context context) {
        for (S3EventNotification.S3Entity s3Entity : event.getRecords()) {
            String bucketName = s3Entity.getS3().getBucket().getName();
            String objectKey = s3Entity.getS3().getObject().getKey();
            S3Object s3Object = s3Client.getObject(bucketName, objectKey);
            S3ObjectInputStream inputStream = s3Object.getObjectContent();
            try (CSVReader csvReader = new CSVReader(new InputStreamReader(inputStream))) {
                String[] headerRow = csvReader.readNext();
                String[] dataRow;
                while ((dataRow = csvReader.readNext()) != null) {
                    insertDataIntoDatabase(dataRow);
                }
                sendNotification("CSV file uploaded successfully!");
            } catch (IOException | SQLException e) {
                context.getLogger().log("Error: " + e.getMessage());
                sendNotification("Error uploading CSV file: " + e.getMessage());
            }
        }
        return null;
    }

    private void insertDataIntoDatabase(String[] dataRow) throws SQLException {
        try (Connection conn = DriverManager.getConnection(DB_URL, DB_USER, DB_PASSWORD)) {
            String sql = "INSERT INTO my_table (column1, column2, column3) VALUES (?, ?, ?)";
            PreparedStatement pstmt = conn.prepareStatement(sql);
            pstmt.setString(1, dataRow[0]);
            pstmt.setString(2, dataRow[1]);
            pstmt.setString(3, dataRow[2]);
            pstmt.executeUpdate();
        }
    }

    private void sendNotification(String message) {
        PublishRequest request = new PublishRequest(SNS_TOPIC_ARN, message);
        snsClient.publish(request);
    }
}

```
